package com.ceiba.proing.maestros.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.ceiba.proing.dm.maestros.TipoIdentificacion;
import com.ceiba.proing.maestros.dao.decl.TipoIdentificacionDAO;

public class TipoIdentificacionJpaDAO implements TipoIdentificacionDAO {

	@PersistenceContext(name = "proing-dm")
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<TipoIdentificacion> buscar() {
		final String jpql = "SELECT ti FROM TipoIdentificacion ti";
		Query query = entityManager.createQuery(jpql);
		return query.getResultList();
	}

	@Override
	public TipoIdentificacion buscarPorId(long id) {
		return entityManager.find(TipoIdentificacion.class, id);
	}

}
