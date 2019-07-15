package com.FivePoints.demo.services;

import java.util.List;

import com.FivePoints.demo.entities.Authentification;

public interface ServicesAuthenti {

	public List<Authentification> findAll();
	public void save(Authentification entity);
	public Authentification getOne(int id);
	public boolean existsById(int id);
	/*-------------CRUD SPECIFIQUE-------------*/
	
}
