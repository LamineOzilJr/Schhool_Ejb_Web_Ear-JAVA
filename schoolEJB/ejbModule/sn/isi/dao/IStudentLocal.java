package sn.isi.dao;

import java.util.List; 

import javax.ejb.Local;

import sn.isi.entities.Student;

@Local
public interface IStudentLocal {
	
	public List<Student> liste();
	public int add (Student student);
}
