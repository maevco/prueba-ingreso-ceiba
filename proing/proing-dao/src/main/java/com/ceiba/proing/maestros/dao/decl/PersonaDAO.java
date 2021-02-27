package com.ceiba.proing.maestros.dao.decl;

import java.util.List;

import com.ceiba.proing.dm.maestros.Persona;

public interface PersonaDAO {

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
