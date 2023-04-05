package sn.isi.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sn.isi.entities.Year;

@Stateless
public class YearDao implements IYearLocal {

	private EntityManager em;
	
	@Override
	public List<Year> liste() {
		// TODO Auto-generated method stub
		return em.createQuery("SELECT Y from Year y")
				 .getResultList();
	}

	@Override
	public int add(Year year) {
		// TODO Auto-generated method stub
		int ok = 0;
		 try {
			// em.getTransaction().begin();
			 em.persist(year);
			 //em.getTransaction().commit();
			 ok = 1;
			 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	

}
