package com.ceiba.proing.bussines.maestros;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.NoResultException;

import com.ceiba.proing.dm.maestros.Genero;
import com.ceiba.proing.maestros.dao.decl.GeneroDAO;

@Stateless(name = "generoBO")
public class GeneroBOImpl  implements GeneroBO{

	@Inject 
	private GeneroDAO generoDAO;
	
	@Override
	public List<Genero> buscar() {
		try {
			return generoDAO.buscar();			
		}catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public Genero buscarPorId(long id) {
		try {
			return generoDAO.buscarPorId(id);			
		}catch (NoResultException e) {
			return null;
		}
	}

}
