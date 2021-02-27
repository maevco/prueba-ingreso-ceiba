package com.ceiba.proing.bussines.maestros;

import java.util.List;

import javax.ejb.Local;

import com.ceiba.proing.dm.maestros.TipoIdentificacion;

@Local
public interface TipoIdentificacionBO {
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
