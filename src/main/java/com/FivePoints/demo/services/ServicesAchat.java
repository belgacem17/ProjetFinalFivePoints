package com.FivePoints.demo.services;

import java.util.List;

import com.FivePoints.demo.entities.Achat;

public interface ServicesAchat {

	public List<Achat> findAll();
	public void save(Achat entity);
	public Achat getOne(int id);
	public boolean existsById(int id);
	public void deleteById(int id);
	public void delete(Achat entity);
	public void deleteAll();
	public void Update(Achat entity);
	/*-------------CRUD SPECIFIQUE-------------*/
	
}
