package sn.isi.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sn.isi.entities.Cours;

@Stateless
public class CoursDao implements ICoursLocal {

	@PersistenceContext(unitName="schoolEJB")
	private EntityManager em;
	
	@Override
	public List<Cours> liste() {
		// TODO Auto-generated method stub
		return em.createQuery("SELECT C from Cours c")
				 .getResultList();
	}

	@Override
	public int add(Cours cours) {
		// TODO Auto-generated method stub
		int ok = 0;
		 try {
			 //em.getTransaction().begin();
			 em.persist(cours);
			 //em.getTransaction().commit();
			 ok = 1;
			 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	

}
