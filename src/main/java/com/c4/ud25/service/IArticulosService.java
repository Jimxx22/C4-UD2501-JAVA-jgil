package com.c4.ud25.service;

import java.util.List;

import com.c4.ud25.dto.Articulo;

public interface IArticulosService {
	//Metodos del CRUD
	public List<Articulo> listarArticulos(); //Listar All 
	
	public Articulo guardarArticulo(Articulo articulo);	//Guarda un video CREATE
	
	public Articulo articuloXID(Long id); //Leer datos de un video READ
	
	public Articulo actualizarArticulo(Articulo articulo); //Actualiza datos del video UPDATE
	
	public void eliminarArticulo(Long id);// Elimina el video DELETE
}
