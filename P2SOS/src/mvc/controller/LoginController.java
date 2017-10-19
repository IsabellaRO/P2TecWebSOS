package mvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mvc.model.Usuarios;
import mvc.model.UsuariosDAO;

public class LoginController {
	
	@RequestMapping("registro")
	public String registro() {
		System.out.println("Redirect cadastro");
		return "cadastro";
 	}

	 
	@RequestMapping(value = "efetuaRegistro", method = RequestMethod.POST)
 	public String upload(Usuarios usuario) throws IOException {
		System.out.println("Cadastrando....\n\n\n");
	 	UsuariosDAO dao = new UsuariosDAO();
	 	dao.adiciona(usuario);
	 	return "redirect:feed";
 	} 

	@RequestMapping("loginForm")
	public String loginForm() {
		return "login";
	}

	@RequestMapping("efetuaLogin")
	public String efetuaLogin(Usuarios usuario, HttpSession session) {
		if(new UsuariosDAO().existeUsuario(usuario)) {
			session.setAttribute("usuarioLogado", usuario.getUsername());
			return "meuperfil";
	}
	return "redirect:login";
	}
}
