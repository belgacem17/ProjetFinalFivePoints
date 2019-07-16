package com.FivePoints.demo.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="authentification")
public class Authentification implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int  id;
	
	@OneToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Admin admin;
	
	@Column(name = "login")
	private String login;
	
	@Column(name = "mdp")
	private String mdp;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	


	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	
	
}
