package com.FivePoints.demo.services;

import java.util.List;

import com.FivePoints.demo.entities.Agences;
import com.FivePoints.demo.entities.Finance;

public interface ServicesFinance {

	public List<Finance> findAll();
	public void save(Finance entity);
	public Finance getOne(int id);
	public boolean existsById(int id);
	public void deleteById(int id);
	public void delete(Finance entity);
	public void deleteAll();
	public void Update(Finance entity);
	/*-------------CRUD SPECIFIQUE-------------*/
	public Finance findByAgences(int agence);
}
