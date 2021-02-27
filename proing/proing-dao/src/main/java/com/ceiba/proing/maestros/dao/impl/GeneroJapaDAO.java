package com.ceiba.proing.maestros.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.ceiba.proing.dm.maestros.Genero;
import com.ceiba.proing.maestros.dao.decl.GeneroDAO;

public class GeneroJapaDAO implements GeneroDAO {

	@PersistenceContext(name = "proing-dm")
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Genero> buscar() {
		final String jpql = "SELECT g FROM Genero g";
		Query query = entityManager.createQuery(jpql);
		return query.getResultList();
	}

	@Override
	public Genero buscarPorId(long id) {
		return entityManager.find(Genero.class, id);
	}

}
