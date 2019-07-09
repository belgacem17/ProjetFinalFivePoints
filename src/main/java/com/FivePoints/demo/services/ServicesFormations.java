package com.FivePoints.demo.services;

import java.util.List;

import com.FivePoints.demo.entities.Formation;

public interface ServicesFormations {

	public List<Formation> findAll();
	public void save(Formation entity);
	public Formation getOne(int id);
	public boolean existsById(int id);
	public void deleteById(int id);
	public void delete(Formation entity);
	public void deleteAll();
	public void Update(Formation entity);
}
