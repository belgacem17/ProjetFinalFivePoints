package com.FivePoints.demo.entities;

import java.io.File;
import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "personnels")
@Inheritance(strategy = InheritanceType.JOINED)
public class Personnels {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private int id;
	
	 @Column(name = "firstName")
	private String firstName;
	 
	 @Column(name = "lastName")
	private String lastName;
	 
	 @Column(name = "role")
	private String role;
	 
	 @Column(name = "email")
	private String email;
	 
	 @Column(name = "numTel")
	private String numTel;
	 
	 @Column(name = "dateRec")
	private Date dateRec;
	 
	 @Column(name = "salaire")
	private long salaire;
	 
	 @Column(name = "adresse")
	private String adresse;
	
	 @Lob
	 @Column(name = "photo")
		private File photo;
	 
	@JsonIgnore
	@ManyToOne(cascade=CascadeType.ALL)
	 private Conge conge;
	 
	public Personnels() {
		super(); 
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumTel() {
		return numTel;
	}
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	public Date getDateRec() {
		return dateRec;
	}
	public void setDateRec(Date dateRec) {
		this.dateRec = dateRec;
	}
	public long getSalaire() {
		return salaire;
	}
	public void setSalaire(long salaire) {
		this.salaire = salaire;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Conge getConge() {
		return conge;
	}
	public void setConge(Conge conge) {
		this.conge = conge;
	}
	
	 public File getPhoto() {
			return photo;
		}
		public void setPhoto(File photo) {
			this.photo = photo;
		}

}
