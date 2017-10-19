package mvc.model;

public class Post {
	
	private Integer post_id;
	private String quote;
	private String legenda;
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

