package com.ceiba.proing.maestros.dao.decl;

import java.util.List;

import com.ceiba.proing.dm.maestros.Genero;

public interface GeneroDAO {

	/**
	 * 
	 * @return
	 */
	public List<Genero> buscar();

	/**
	 * 
	 * @param id
	 * @return
	 */
	public Genero buscarPorId(long id);

}