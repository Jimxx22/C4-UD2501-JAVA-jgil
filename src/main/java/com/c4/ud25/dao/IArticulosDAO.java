package com.c4.ud25.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.c4.ud25.dto.Articulo;

public interface IArticulosDAO extends JpaRepository<Articulo, Long>{

}
