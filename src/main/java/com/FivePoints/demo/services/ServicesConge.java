package com.FivePoints.demo.services;

import java.util.List;

import com.FivePoints.demo.entities.Conge;

public interface ServicesConge {

	public List<Conge> findAll();
	public void save(Conge entity);
	public Conge getOne(int id);
	public boolean existsById(int id);
	public void deleteById(int id);
	public void delete(Conge entity);
	public void deleteAll();
	public void Update(Conge entity);
	
}
