package com.FivePoints.demo.entities;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "admin")
public class Admin extends Personnels implements Serializable {
	@JsonIgnore
	@ManyToOne(cascade=CascadeType.ALL)
	private Agences agence;
	
	public Admin() {
		super();
	}

	public Agences getAgence() {
		return agence;
	}

	public void setAgence(Agences agence) {
		this.agence = agence;
	}

}
