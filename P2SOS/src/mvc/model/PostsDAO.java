package mvc.model;

//import java.sql.Date;
//import java.io.IOException;
import java.sql.*;
import java.util.*;

//import org.springframework.web.multipart.MultipartFile;

public class PostsDAO {
	private Connection connection = null;
		
		public PostsDAO(){
			try {
				 Class.forName("com.mysql.jdbc.Driver");
				 connection = DriverManager.getConnection("jdbc:mysql://localhost/p2","root", "rangobom971025");
			} 
			catch (SQLException | ClassNotFoundException e){
				e.printStackTrace();
			}
		}
		
		public void adiciona(Posts post) {
			
			 try {
				 String sql = "INSERT INTO Post" + "(quote, user_id) values(?,?)";
				 PreparedStatement stmt = connection.prepareStatement(sql);
				 stmt.setString(1,post.getQuote());
				 stmt.setInt(2, post.getUser_id());
				 stmt.execute();
				 stmt.close();
			 } 
			 catch (SQLException e) {
				 e.printStackTrace();
			 }
		}
		
		public List<Posts> getLista() {
			 List<Posts> posts = new ArrayList<Posts>();
			 try {
				 PreparedStatement stmt = connection.prepareStatement("SELECT * FROM Posts");
				 ResultSet rs = stmt.executeQuery();
				 while (rs.next()) {
					 Posts post = new Posts();
					 post.setPost_id(rs.getInt("post_id"));
					 post.setQuote(rs.getString("quote"));
					 posts.add(post);
				 }
				 rs.close();
				 stmt.close();
			 } 
			 catch(SQLException e) {
				 System.out.println(e);
			 }
		 	 return posts;
		}
		
		public void remove(Posts post) {
			 try {
				 PreparedStatement stmt = connection.prepareStatement("DELETE FROM Posts WHERE post_id=?");
				 stmt.setInt(1, post.getPost_id());
				 stmt.execute();
				 stmt.close();
			 } 
			 catch(SQLException e) {
				 System.out.println(e);
			 }
		 }
		
//		public Posts buscaPorId(Integer post_id) {
//			 Posts post = new Posts();
//			 try {
//				 PreparedStatement stmt = connection.prepareStatement("SELECT * FROM Posts WHERE post_id=? ");
//				 stmt.setInt(1, post_id);
//				 ResultSet rs = stmt.executeQuery();
//				 if(rs.next()) {
//					 post.setPost_id(rs.getInt("post_id"));
//					 post.setQuote(rs.getString("quote"));
//				 }
//				 rs.close();
//				 stmt.close();
//	 		} 
//			catch(SQLException e) {
//				System.out.println(e);
//			}
//			return post;
//		}
		
//		public void altera(Posts post) {
//			 try {
//				 String sql = "UPDATE Post SET legenda=? WHERE id=?";
//				 PreparedStatement stmt = connection.prepareStatement(sql);
//				 stmt.setString(1, post.getLegenda());
//				 stmt.setLong(2, post.getPost_id());
//				 stmt.executeUpdate();
//				 stmt.close();
//			 } 
//			 catch(SQLException e) {
//				 System.out.println(e);
//			 }
//		}
		
		public void close() {
			 try { connection.close();}
			 catch (SQLException e) {e.printStackTrace();}
		 }

}
