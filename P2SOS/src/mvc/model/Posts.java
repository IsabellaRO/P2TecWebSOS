package mvc.model;

import java.util.Calendar;

//import org.springframework.web.multipart.MultipartFile;

public class Posts {
	
	private Integer post_id;
//	private MultipartFile foto;
//	private MultipartFile video;
//	private MultipartFile musica;
	private String quote;
	private String legenda;
//	private Calendar data;
	private Integer user_id;
	
	public Integer getPost_id() {
		return this.post_id;
	}
	public void setPost_id(Integer post_id) {
		this.post_id = post_id;
	}
	public String getQuote() {
		return this.quote;
	}
	public void setQuote(String quote) {
		this.quote = quote;
	}
	public String getLegenda() {
		return this.legenda;
	}
	public void setLegenda(String legenda) {
		this.legenda = legenda;
	}
	public Integer getUser_id() {
		return this.user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

}
