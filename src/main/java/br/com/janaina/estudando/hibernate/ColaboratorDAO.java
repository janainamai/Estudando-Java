package br.com.janaina.estudando.hibernate;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class ColaboratorDAO {
	
	private static ColaboratorDAO instance; 
	private Session session;

	/**
	 * Method responsible for instantiating the CollaboratorDAO class.
	 * 
	 * @param session the database session.
	 * 
	 * @return instance
	 */
	public static ColaboratorDAO getInstance(Session session) {
		if (instance == null)
			instance = new ColaboratorDAO(session);
		return instance;
	}

	private ColaboratorDAO(Session session) {
		this.session = session;
	}

	public void insert(Colaborator objectToInsert) {
		session.save(objectToInsert);
	}

	public void delete(Colaborator objectToDelete) {
		if (!session.getTransaction().isActive())
			session.beginTransaction();
		session.delete(objectToDelete);
		session.getTransaction().commit();
	}

	public void update(Colaborator objectToUpdate) {
		if (!session.getTransaction().isActive())
			session.beginTransaction();
		session.update(objectToUpdate);
		session.getTransaction().commit();
	}
	
	public List<Colaborator> getAllWithCriteriaBuilder() {
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Colaborator> criteria = builder.createQuery(Colaborator.class);
		Query query = session.createQuery(criteria);
		List<Colaborator> selectedCollaborators = query.getResultList();
		return selectedCollaborators;
	}
	
	public List<Colaborator> getAllWithCriteriaRoot() {
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Colaborator> criteria = builder.createQuery(Colaborator.class);
		Root<Colaborator> root = criteria.from(Colaborator.class);
		Query query = session.createQuery(criteria);
		List<Colaborator> selectedCollaborators = query.getResultList();
		return selectedCollaborators;
	}
	
}
