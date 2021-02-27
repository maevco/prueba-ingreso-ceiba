package com.ceiba.proing.bussines.maestros;

import java.util.List;

import javax.ejb.Local;

import com.ceiba.proing.dm.maestros.Genero;

@Local
public interface GeneroBO {
	
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
