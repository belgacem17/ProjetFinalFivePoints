package com.FivePoints.demo.services;

import java.util.List;

import com.FivePoints.demo.entities.Charge;

public interface ServicesCharge {

	public List<Charge> findAll();
	public void save(Charge entity);
	public Charge getOne(int id);
	public boolean existsById(int id);
	public void deleteById(int id);
	public void delete(Charge entity);
	public void deleteAll();
	public void Update(Charge entity);
	
}
