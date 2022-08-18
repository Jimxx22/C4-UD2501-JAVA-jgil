package com.c4.ud25.service;

import java.util.List;

import com.c4.ud25.dto.Fabricante;

public interface IFabricantesService {
	
	//Metodos del CRUD
	public List<Fabricante> listarFabricantes(); //Listar All 
	
	public Fabricante guardarFabricante(Fabricante fabricante);	//Guarda un cliente CREATE
	
	public Fabricante fabricanteXID(Long id); //Leer datos de un cliente READ
	
	public Fabricante actualizarFabricante(Fabricante fabricante); //Actualiza datos del cliente UPDATE
	
	public void eliminarFabricante(Long id);// Elimina el cliente DELETE

}
