package com.FivePoints.demo.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="conge")
public class Conge implements Serializable{

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	 @Column(name = "dateDepart")
	 @Temporal(TemporalType.DATE)
	private Date dateDepart;
	 
	 @Column(name = "dateFin")
	 @Temporal(TemporalType.DATE)
	private Date dateFin;
	
	 
	 @OneToOne(cascade = CascadeType.ALL)
	    private Personnels personne;
	 
//	@OneToMany(mappedBy="conge",fetch=FetchType.LAZY)
//	private List<Personnels> listPersonnel = new ArrayList<Personnels>() ;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDateDepart() {
		return dateDepart;
	}
	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
//	public List<Personnels> getListPersonnel() {
//		return listPersonnel;
//	}
//	public void setListPersonnel(List<Personnels> listPersonnel) {
//		this.listPersonnel = listPersonnel;
//	}
	public Personnels getPersonne() {
		return personne;
	}
	public void setPersonne(Personnels personne) {
		this.personne = personne;
	}
	
}
