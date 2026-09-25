package dao;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import model.Rol;

public class RolDAOImplement implements RolDAO {
	
	EntityManagerFactory fabric; 
	EntityManager em; 
	
	public RolDAOImplement() {
		fabric = Persistence.createEntityManagerFactory("Semana01");
		em = fabric.createEntityManager();
	}

	@Override
	public void create(Rol rol) {
		try {
			em.getTransaction().begin();
			em.persist(rol);
			em.getTransaction().commit();
		} catch (NullPointerException e) {
			em.getTransaction().rollback();
		}
	}

	@Override
	public void update(Rol rol) {
		try {
			em.getTransaction().begin();
			em.merge(rol);
			em.getTransaction().commit();
		} catch (NullPointerException e) {
			em.getTransaction().rollback();
		}
	}

	@Override
	public void delete(int id) {
		try {
			em.getTransaction().begin();
			em.remove(id);
			em.getTransaction().commit();
		} catch (NullPointerException e) {
			em.getTransaction().rollback();
		}
	}

	@Override
	public Rol find(int id) {
		return em.find(Rol.class, id);
	}

	@Override
	public List<Rol> findAll() {
		Query query = em.createNamedQuery("Rol.findAll");
		List<Rol> lista; 
		try {
			lista = query.getResultList();
		} catch (Exception e) {
			lista = null;
		}
		return lista;
	}

}
