package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import mvc.model.Post;
import mvc.model.PostsDAO;

@Controller
public class PostsController {
	
	@RequestMapping("/perfil")
	public String execute(){
		System.out.println("Redirect perfil");
		return "meuperfil";
	}
	
	@RequestMapping("/post")
	public String newPost(){
		System.out.println("Redirect novo post");
		return "post";
	}
	
	@RequestMapping("criaQuote")
	public String adiciona(Post post){
		PostsDAO dao = new PostsDAO();
		dao.adiciona(post);
		System.out.println("Adicionado!");
		return "meuperfil";
	}

}
