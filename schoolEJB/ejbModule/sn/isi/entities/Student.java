package sn.isi.entities;

import java.io.Serializable;  
import java.util.ArrayList;
//import java.util.Date;
import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Student implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 100, nullable = false)
	private String firstname;
	@Column(length = 100, nullable = false)
	private String lastname;
	@Column(length = 100, nullable = false)
	private String birthdate;
	@Column(length = 100, nullable = false)
	private String phone;	
	
	@OneToMany(mappedBy ="student")
	private List<Inscription> inscription = new ArrayList<Inscription>();
	
	public Student() {
		super();
	}

	public Student(int id, String firstname, String lastname, String birthdate, String phone, List<Inscription> inscription) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthdate = birthdate;
		this.phone = phone;
		this.inscription = inscription;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String	 birthdate) {
		this.birthdate = birthdate;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public List<Inscription> getInscription() {
		return inscription;
	}
	public void setInscription(
			List<Inscription> inscription) {
		this.inscription = inscription;
	}
	

}
