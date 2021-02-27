package com.ceiba.proing.maestros.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.ceiba.proing.dm.maestros.Persona;
import com.ceiba.proing.maestros.dao.decl.PersonaDAO;

public class PersonaJpaDAO implements PersonaDAO {

	@PersistenceContext(name = "proing-dm")
	private EntityManager entityManager;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ems.sagem.dao.global.decl.PersonaDAO#buscar()
	 */

	@SuppressWarnings("unchecked")
	@Override
	public List<Persona> buscar() {
		final String jpql = "SELECT p FROM Persona p ";
		Query query = entityManager.createQuery(jpql);
		return query.getResultList();
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ems.sagem.dao.global.decl.PersonaDAO#buscarPorId(long)
	 */

	@Override
	public Persona buscarPorId(long id) {
		final String jpql = "SELECT p FROM Persona p WHERE p.id = :id";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("id", id);
		return (Persona) query.getSingleResult();
	}

	@Override
	public Persona grabar(Persona persona) {
		entityManager.persist(persona);
		return persona;
	}

	@Override
	public Persona editar(Persona persona) {
		entityManager.merge(persona);
		return persona;
	}

	@Override
	public Persona buscarUltimo() {
		final String jpql = "SELECT p FROM " + Persona.class.getSimpleName()+ " p WHERE p.id = (SELECT MAX(p2.id) FROM " + Persona.class.getSimpleName() + " p2 )";
		Query query = entityManager.createQuery(jpql);
		return (Persona) query.getSingleResult();
	}

	@Override
	public Persona buscarTipoNumeroIdentificacion(long tipoIdentificacionId, String numeroIdentificacion) {
		final String jpql = "SELECT p FROM Persona p JOIN p.tipoIdentificacion ti WHERE ti.id  = :tipoIdentificacionId AND p.numeroIdentificacion = :numeroIdentificacion";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("tipoIdentificacionId", tipoIdentificacionId);
		query.setParameter("numeroIdentificacion", numeroIdentificacion);
		return (Persona) query.getSingleResult();
	}

}
