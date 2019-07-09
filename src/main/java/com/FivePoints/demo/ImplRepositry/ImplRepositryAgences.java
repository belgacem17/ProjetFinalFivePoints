package com.FivePoints.demo.ImplRepositry;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FivePoints.demo.entities.Agences;
import com.FivePoints.demo.repositories.RepositryAgences;
import com.FivePoints.demo.services.ServicesAgences;

@Service("implRepositryAgences")
public class ImplRepositryAgences implements ServicesAgences{

	@Autowired
	RepositryAgences repositryAgences ;
	@Override
	public List<Agences> findAll() {
		return repositryAgences.findAll();
	}

	@Override
	public void save(Agences entity) {
		repositryAgences.save(entity);		
	}

	@Override
	public Agences getOne(int id) {
		// TODO Auto-generated method stub
		return repositryAgences.getOne(id);
	}
	
	@Override
	public boolean existsById(int id) {
		// TODO Auto-generated method stub
		return repositryAgences.existsById(id);
	}

	@Override
	public void deleteById(int id) {
		repositryAgences.deleteById(id);
	}

	@Override
	public void delete(Agences entity) {
		repositryAgences.delete(entity);
	}

	@Override
	public void deleteAll() {
		repositryAgences.deleteAll();
	}

	@Override
	public void Update(Agences entity) {
		repositryAgences.save(entity);		
	}

	@Override
	public Agences findByLieu(String lieu) { 
		return repositryAgences.findByLieu(lieu);
	}

}
