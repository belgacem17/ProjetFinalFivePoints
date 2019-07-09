package com.FivePoints.demo.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name = "employe")
public class Employe extends Personnels implements Serializable{

	@JsonIgnore
	@ManyToOne(cascade=CascadeType.ALL)
	private Agences agence;
	
	public Employe() {
		super();
	}

	public Agences getAgence() {
		return agence;
	}

	public void setAgence(Agences agence) {
		this.agence = agence;
	}

}
