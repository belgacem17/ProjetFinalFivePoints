package com.FivePoints.demo.services;

import java.util.List;

import com.FivePoints.demo.entities.Employe;

public interface ServicesEmploye {

	public List<Employe> findAll();
	public void save(Employe entity);
	public Employe getOne(int id);
	public boolean existsById(int id);
	public void deleteById(int id);
	public void delete(Employe entity);
	public void deleteAll();
	public void Update(Employe entity);
	
}
