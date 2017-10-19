package mvc.model;

import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuariosDAO {
	private Connection connection = null;
		public UsuariosDAO() {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://localhost/p2", "root", "adgjlra1");
			} 
			catch (SQLException | ClassNotFoundException e) {e.printStackTrace();}
		}

		public void adiciona(Usuarios usuario) throws IOException {
			//MultipartFile filePart = usuario.getFoto();
			/* Rotina para salvar o arquivo no servidor
			if (!filePart.isEmpty()) {
				String fileName = filePart.getOriginalFilename();
				File uploads = new File("/tmp");
				File file = new File(uploads, fileName);
				try (InputStream input = filePart.getInputStream()) {
					Files.copy(input, file.toPath());
	 			}
	 		}
			*/
			try {
				String sql = "INSERT INTO usuario (nome, email, username, senha, bio, trilha) values(?,?,?,?,?,?)";
				PreparedStatement stmt = connection.prepareStatement(sql);
				stmt.setString(1,usuario.getNome());
				stmt.setString(2, usuario.getEmail());
				stmt.setString(3,usuario.getUsername());
				stmt.setString(4,usuario.getSenha());
				stmt.setString(5, usuario.getBio());
				stmt.setString(6, usuario.getTrilha());
				//stmt.setBinaryStream(7, filePart.getInputStream());
				stmt.execute();
				stmt.close();
				 
			 } catch (SQLException e) {e.printStackTrace();}
		 }
				 
		public boolean existeUsuario(Usuarios usuario) {
			boolean existe = false;
			try {
				PreparedStatement stmt = connection.prepareStatement("SELECT COUNT(*) FROM usuario WHERE username=? AND senha=? LIMIT 1");
				stmt.setString(1, usuario.getUsername());
				stmt.setString(2, usuario.getSenha());
				ResultSet rs = stmt.executeQuery();
				if(rs.next()){
					if(rs.getInt(1) != 0) {existe=true;}
				}
				rs.close();
				stmt.close();
				} catch(SQLException e) {System.out.println(e);}
				
			return existe;
		}

		public byte[] buscaFoto(String login) {
			byte[] imgData = null;
			try {
				PreparedStatement stmt = connection.prepareStatement("SELECT * FROM usuario WHERE username=? ");
				stmt.setString(1, login);
				ResultSet rs = stmt.executeQuery();
				if(rs.next()) {
					Blob image = rs.getBlob("foto");
					imgData = image.getBytes(1, (int) image.length());
				}
				rs.close();
				stmt.close();
			} catch(SQLException e) {System.out.println(e);}
			
			return imgData;
		 }
	}
