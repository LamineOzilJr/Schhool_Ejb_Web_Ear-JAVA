package sn.isi.dao;

import java.util.List;

import javax.ejb.Local;

import sn.isi.entities.Cours;

@Local
public interface ICoursLocal {

	public List<Cours> liste();
	public int add (Cours cours);

	
}
