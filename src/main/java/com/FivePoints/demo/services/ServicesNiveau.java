package com.FivePoints.demo.services;

import java.util.List;

import com.FivePoints.demo.entities.Niveau;

public interface ServicesNiveau {

	public List<Niveau> findAll();
	public void save(Niveau entity);
	public Niveau getOne(int id);
	public boolean existsById(int id);
	public void deleteById(int id);
	public void delete(Niveau entity);
	public void deleteAll();
	public void Update(Niveau entity);
	
}
