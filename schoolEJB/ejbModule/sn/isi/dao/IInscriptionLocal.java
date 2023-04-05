package sn.isi.dao;

import java.util.List;

import javax.ejb.Local;

import sn.isi.entities.Inscription;

@Local
public interface IInscriptionLocal {
	
	public List<Inscription> liste();
	public int add (Inscription inscription);
}
