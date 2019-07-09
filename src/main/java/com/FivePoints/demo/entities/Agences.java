package com.FivePoints.demo.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="agence")
public class Agences implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	 @Column(name = "lieu")
	private String lieu;
	
	@OneToMany(mappedBy="agence",fetch=FetchType.LAZY)
	private List<Employe> listEmploye = new ArrayList<Employe>() ;
	
	@JsonIgnore
	@OneToOne(mappedBy="agence")
	private Admin admin;
	
	@OneToMany(mappedBy="agence",fetch=FetchType.LAZY)
	private List<Formation> listFormation = new ArrayList<Formation>() ;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public List<Employe> getListEmploye() {
		return listEmploye;
	}
	public void setListEmploye(List<Employe> listEmploye) {
		this.listEmploye = listEmploye;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public List<Formation> getListFormation() {
		return listFormation;
	}
	public void setListFormation(List<Formation> listFormation) {
		this.listFormation = listFormation;
	}
	
}
