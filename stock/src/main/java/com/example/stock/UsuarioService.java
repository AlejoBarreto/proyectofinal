package com.example.stock;
import java.util.List;

public interface UsuarioService {
	
	public List<Usuario> findAll();
	public Usuario save(Usuario user);
}
