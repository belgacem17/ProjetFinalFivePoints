package com.FivePoints.demo.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="niveau")
public class Niveau implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	 @Column(name = "name")
	private String name;
	 @Column(name = "numNiveau")
	private int numNiveau;
	 @Column(name = "description")
	private String description;
	
	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Formation formation;
	
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
	public int getNumNiveau() {
		return numNiveau;
	}
	public void setNumNiveau(int numNiveau) {
		this.numNiveau = numNiveau;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Formation getFormation() {
		return formation;
	}
	public void setFormation(Formation formation) {
		this.formation = formation;
	}
	
	
}
