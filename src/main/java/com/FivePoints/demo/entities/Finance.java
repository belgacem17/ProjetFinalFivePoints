package com.FivePoints.demo.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="finance")
public class Finance implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "caisse")
	private long caisse;
	
	@OneToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Agences agences;
	
	@OneToMany(mappedBy="finance",fetch=FetchType.LAZY)
	private List<Achat> listAchat = new ArrayList<Achat>() ;
	
	@OneToMany(mappedBy="finance",fetch=FetchType.LAZY)
	private List<Paiments> listPaiments = new ArrayList<Paiments>() ;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getCaisse() {
		return caisse;
	}
	public void setCaisse(long caisse) {
		this.caisse = caisse;
	}
	public Agences getAgences() {
		return agences;
	}
	public void setAgences(Agences agences) {
		this.agences = agences;
	}
	public List<Achat> getListAchat() {
		return listAchat;
	}
	public void setListAchat(List<Achat> listAchat) {
		this.listAchat = listAchat;
	}
	
	public List<Paiments> getListPaiments() {
		return listPaiments;
	}
	public void setListPaiments(List<Paiments> listPaiments) {
		this.listPaiments = listPaiments;
	}
	
	
}
