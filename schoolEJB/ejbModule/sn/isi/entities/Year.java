package sn.isi.entities;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Year implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 100, nullable = false)
	private String name;
	
	@OneToMany(mappedBy ="year")
	private List<Inscription> inscription = new ArrayList<Inscription>();
	
	public Year() {
		super();
	}

	public Year(int id, String name, List<Inscription> inscription) {
		super();
		this.id = id;
		this.name = name;
		this.inscription = inscription;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public List<Inscription> getInscription() {
		return inscription;
	}
	public void setInscription(
			List<Inscription> inscription) {
		this.inscription = inscription;
	}
	

}
