package sn.isi.dao;

import java.util.List;

import javax.ejb.Local;

import sn.isi.entities.Year;

@Local
public interface IYearLocal {

	public List<Year> liste();
	public int add (Year year);
}
