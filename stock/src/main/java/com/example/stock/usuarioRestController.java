package com.example.stock;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController

public class usuarioRestController{
@Autowired
private UsuarioService us;
		
	@GetMapping("/usuario")
	public List<Usuario> getUsuarios(){
	return us.findAll();
}	
	@PostMapping ("/usuario")
	public Usuario postUsuario (@RequestBody Usuario user){
	return us.save(user);
	}
	
	@DELETE ("/usuario")
	
	
	
	
}
