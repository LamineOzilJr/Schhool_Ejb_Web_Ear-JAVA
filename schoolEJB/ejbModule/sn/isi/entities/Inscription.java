package sn.isi.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Inscription implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 100, nullable = false)
	private String details;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="Student_ID")
	private Student student;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="Year_ID")
	private Year year;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="Cours_ID")
	private Cours cours;
	
	/**
	 * @param id
	 * @param firstname
	 * @param lastname
	 * @param birthdate
	 * @param phone
	 */
	
	/**
	 * @param id
	 * @param name
	 */
	
	/**
	 * @param id
	 * @param name
	 * @param programme
	 */
	
	public Inscription() {
		super();
	}

	public Inscription(int id, String details, Student student, Year year, Cours cours) {
		super();
		this.id = id;
		this.details = details;
		this.student = student;
		this.year = year;
		this.cours = cours;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public Year getYear() {
		return year;
	}
	public void setYear(Year year) {
		this.year = year;
	}
	
	public Cours getCours() {
		return cours;
	}
	public void setCours(Cours cours) {
		this.cours = cours;
	}
}
