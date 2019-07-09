package com.FivePoints.demo.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="formation")
public class Formation implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	 @Column(name = "name")
	private String name;
	 @Column(name = "type")
	private String type;
	 @Column(name = "fileFormation")
	private String fileFormation;
	
	 @JsonIgnore
	@ManyToOne(cascade=CascadeType.ALL)
	private Agences agence;
	
	@OneToMany(mappedBy="formation",fetch=FetchType.LAZY)
	private List<Niveau> listNiveau = new ArrayList<Niveau>() ;
	
	@OneToMany(mappedBy="formation",fetch=FetchType.LAZY)
	private List<Condidats> listCondidats = new ArrayList<Condidats>() ;
	
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFileFormation() {
		return fileFormation;
	}
	public void setFileFormation(String fileFormation) {
		this.fileFormation = fileFormation;
	}
	public Agences getAgence() {
		return agence;
	}
	public void setAgence(Agences agence) {
		this.agence = agence;
	}
	public List<Niveau> getListNiveau() {
		return listNiveau;
	}
	public void setListNiveau(List<Niveau> listNiveau) {
		this.listNiveau = listNiveau;
	}
	public List<Condidats> getListCondidats() {
		return listCondidats;
	}
	public void setListCondidats(List<Condidats> listCondidats) {
		this.listCondidats = listCondidats;
	}

}
