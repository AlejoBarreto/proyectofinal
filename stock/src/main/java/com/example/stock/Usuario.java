package com.example.stock;

import java.util.Set;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@Table(name="Usuarios")
public class Usuario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private String nombre;
	private String apellido;
	
	@OneToMany (mappedBy="usuario")
	private Set <Producto> productos;
	
	@Transient
	private String clave;
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setApellido(String apellido){
		this.apellido = apellido;
	}
	
	public String getNombre() {
      return nombre;
    }
	
	public String getApellido() {
		return apellido;
	}
}

