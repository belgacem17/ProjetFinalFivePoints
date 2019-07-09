package com.FivePoints.demo.services;

import java.util.List;

import com.FivePoints.demo.entities.Paiments;

public interface ServicesPaiment {

	public List<Paiments> findAll();
	public void save(Paiments entity);
	public Paiments getOne(int id);
	public boolean existsById(int id);
	public void deleteById(int id);
	public void delete(Paiments entity);
	public void deleteAll();
	public void Update(Paiments entity);
	
}
