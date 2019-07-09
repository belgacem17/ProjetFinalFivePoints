package com.FivePoints.demo.services;

import java.util.List;

import com.FivePoints.demo.entities.Agences;

public interface ServicesAgences {

	public List<Agences> findAll();
	public void save(Agences entity);
	public Agences getOne(int id);
	public boolean existsById(int id);
	public void deleteById(int id);
	public void delete(Agences entity);
	public void deleteAll();
	public void Update(Agences entity);
	public  Agences findByLieu(String lieu);
}
