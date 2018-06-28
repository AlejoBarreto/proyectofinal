package com.example.stock;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

	@Entity
	public class Producto {
	@ManyToOne
	private Usuario usuario;
	private int Id;
	private String nombre;
	private int cantidad;
	
	public void setCantidad (int cantidad) {
		this.cantidad= cantidad;
	}
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	public void setId(int id){
		this.Id = id;
	}
	
	public int getId() {
      return Id;
    }
	
	public String getNombre () {
		return nombre;
	}
	
	public int getCantidad () {
		return cantidad;
	}
	}	
