package com.ceiba.proing.bussines.maestros;

import java.util.List;

import javax.ejb.Local;

import com.ceiba.proing.dm.maestros.Persona;

@Local
public interface PersonaBO {

	/**
	 * 
	 * @return
	 */
	public List<Persona> buscar();

	/**
	 * 
	 * @param id
	 * @return
	 */
	public Persona buscarPorId(long id);

	/**
	 * 
	 * @param persona
	 * @return
	 */
	public Persona grabar(Persona persona);
	
	/**
	 * 
	 * @param persona
	 * @return
	 */
	public Persona editar(Persona persona);
	
	/**
	 * 
	 * @return
	 */
	public Persona buscarUltimo();

	/**
	 * 
	 * @param tipoIdentificacion
	 * @return
	 */
	public Persona buscarTipoNumeroIdentificacion(long tipoIdentificacionId, String numeroIdentificacion);


}
