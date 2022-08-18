package com.c4.ud25.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c4.ud25.dao.IArticulosDAO;
import com.c4.ud25.dto.Articulo;

@Service
public class ArticulosServicesImpl implements IArticulosService{

	@Autowired
	IArticulosDAO iArticulosDAO;
	
	@Override
	public List<Articulo> listarArticulos() {
		// TODO Auto-generated method stub
		return iArticulosDAO.findAll();
	}

	@Override
	public Articulo guardarArticulo(Articulo articulo) {
		// TODO Auto-generated method stub
		return iArticulosDAO.save(articulo);
	}

	@Override
	public Articulo articuloXID(Long id) {
		// TODO Auto-generated method stub
		return iArticulosDAO.findById(id).get();
	}

	@Override
	public Articulo actualizarArticulo(Articulo articulo) {
		// TODO Auto-generated method stub
		return iArticulosDAO.save(articulo);
	}

	@Override
	public void eliminarArticulo(Long id) {
		// TODO Auto-generated method stub
		iArticulosDAO.deleteById(id);
	}

}
