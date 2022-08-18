package com.c4.ud25.controller;

import java.io.Console;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.MBeanServerNotFoundException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c4.ud25.dto.Fabricante;
import com.c4.ud25.service.FabricantesServiceImpl;

@RestController
@RequestMapping("/api")
public class FabricantesController {

	@Autowired
	FabricantesServiceImpl fabricantesServiceImpl;
	
	@GetMapping("/fabricantes")
	public List<Fabricante> listarFabricantes(){
		return fabricantesServiceImpl.listarFabricantes();
	}
	
	@PostMapping("/fabricantes")
	public Fabricante guardarFabricante(@RequestBody Fabricante fabricante) {
		return fabricantesServiceImpl.guardarFabricante(fabricante);
	}
	
	@GetMapping("/fabricantes/{id}")
	public Fabricante fabricanteXId(@PathVariable(name="id") Long id) {
		
		Fabricante fabricante = new Fabricante();
		
		fabricante=fabricantesServiceImpl.fabricanteXID(id);
		
		return fabricante;
	}
	
	@PutMapping("/fabricantes/{id}")
	public Fabricante actualizarFaricante(@PathVariable(name="id") Long id, @RequestBody Fabricante fabricante) {
		
		Fabricante fabricanteSel = new Fabricante();
		Fabricante fabricanteAct = new Fabricante();
		
		fabricanteSel=fabricantesServiceImpl.fabricanteXID(id);
		
		fabricanteSel.setNombre(fabricante.getNombre());
		
		fabricanteAct= fabricantesServiceImpl.actualizarFabricante(fabricanteSel);
		
		return fabricanteAct;
		
	}
	
	@DeleteMapping("/fabricantes/{id}")
	public String eliminarFabricante(@PathVariable(name="id")Long id) {
				
		try {
			fabricantesServiceImpl.eliminarFabricante(id);
			return "Fabricante borrado";
		}catch (Exception e) {
			return "ERROR: no puedes eliminar un fabricante sin haver eliminado sus productos antes.";
		}
		
	}
	
}
