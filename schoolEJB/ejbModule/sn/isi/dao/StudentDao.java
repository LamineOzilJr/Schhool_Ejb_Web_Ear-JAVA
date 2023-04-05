package sn.isi.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sn.isi.entities.Student;

@Stateless
public class StudentDao implements IStudentLocal {

	@PersistenceContext(unitName="schoolEJB")
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Student> liste() {
		// TODO Auto-generated method stub
		return em.createQuery("SELECT s from Student s")
				 .getResultList();
	}

	@Override
	public int add(Student student) {
		// TODO Auto-generated method stub
		int ok = 0;
		 try {
			 //em.getTransaction().begin();
			 em.persist(student);
			 //em.getTransaction().commit();
			 ok = 1;
			 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ok;
	}
	
	

}
