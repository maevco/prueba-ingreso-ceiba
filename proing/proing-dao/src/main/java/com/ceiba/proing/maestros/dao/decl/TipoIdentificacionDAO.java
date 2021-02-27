package com.ceiba.proing.maestros.dao.decl;

import java.util.List;

import com.ceiba.proing.dm.maestros.TipoIdentificacion;

public interface TipoIdentificacionDAO {

	/**
	 * 
	 * @return
	 */
	public List<TipoIdentificacion> buscar();

	/**
	 * 
	 * @param id
	 * @return
	 */
	public TipoIdentificacion buscarPorId(long id);

}
