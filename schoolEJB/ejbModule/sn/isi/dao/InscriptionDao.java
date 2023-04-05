package sn.isi.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sn.isi.entities.Inscription;

@Stateless
public class InscriptionDao implements IInscriptionLocal {

	@PersistenceContext(unitName="schoolEJB")
	private EntityManager em;
	
	@Override
	public List<Inscription> liste() {
		// TODO Auto-generated method stub
		return em.createQuery("SELECT I from Inscription i")
				 .getResultList();
	}

	@Override
	public int add(Inscription inscription) {
		// TODO Auto-generated method stub
		int ok = 0;
		 try {
			 //em.getTransaction().begin();
			 em.persist(inscription);
			 //em.getTransaction().commit();
			 ok = 1;
			 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	

}
