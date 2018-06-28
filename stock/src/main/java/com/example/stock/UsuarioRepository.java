package com.example.stock;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
	
@RepositoryRestResource(path="usuarios")

public interface UsuarioRepository extends JpaRepository <Usuario, Long>{
		List<Usuario> findByNombre(String nombre);
	}
