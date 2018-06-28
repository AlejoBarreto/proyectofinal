package com.example.stock;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImp implements UsuarioService{
		
		@Autowired
		private UsuarioRepository ur;

		public  List<Usuario> findAll(){
			return ur.findAll();
		}

		@Override
		public Usuario save(Usuario user) {
			// TODO Auto-generated method stub
			return null;
		}
}
