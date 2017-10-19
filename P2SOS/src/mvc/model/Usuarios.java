package mvc.model;

//import org.springframework.web.multipart.MultipartFile;

public class Usuarios {
	
	private Integer user_id;
	private String nome;
	private String email;
	private String username;
	private String senha;
//	private MultipartFile foto_perfil;
	private String bio;
	private String trilha;

	public Integer getUser_id() {return user_id;}
	public void setUser_id(Integer user_id) {this.user_id = user_id;}
	
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	
	public String getEmail() {return email;}
	public void setEmail(String email) {this.email = email;}
	
	public String getUsername() {return username;}
	public void setUsername(String username) {this.username = username;}
	
	public String getSenha() {return senha;}
	public void setSenha(String senha) {this.senha = senha;}
	
//	public MultipartFile getFoto_perfil() {return foto_perfil;}
//	public void setFoto_perfil(MultipartFile foto_perfil) {this.foto_perfil = foto_perfil;}
	
	public String getBio() {return bio;}
	public void setBio(String bio) {this.bio = bio;}
	
	public String getTrilha() {return trilha;}
	public void setTrilha(String trilha) {this.trilha = trilha;}

}
