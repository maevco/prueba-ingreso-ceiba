package com.ceiba.proing.bussines.maestros;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.NoResultException;

import com.ceiba.proing.dm.maestros.TipoIdentificacion;
import com.ceiba.proing.maestros.dao.decl.TipoIdentificacionDAO;

@Stateless(name = "tipoIdentificaionBO")
public class TipoIdentificacionBOImpl implements TipoIdentificacionBO {

	@Inject
	private TipoIdentificacionDAO tipoIdentificacionDAO;

	@Override
	public List<TipoIdentificacion> buscar() {
		try {
			return tipoIdentificacionDAO.buscar();			
		}catch (NoResultException e) {
			return null;
		}
		
	}

	@Override
	public TipoIdentificacion buscarPorId(long id) {
		try {
			return tipoIdentificacionDAO.buscarPorId(id);			
		}catch (NoResultException e) {
			return null;
		}
	}

}
