package com.FivePoints.demo.ImplRepositry;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FivePoints.demo.entities.Agences;
import com.FivePoints.demo.entities.Finance;
import com.FivePoints.demo.repositories.RepositryFinance;
import com.FivePoints.demo.services.ServicesFinance;

@Service("implRepositryFinance")
public class ImplRepositryFinance implements ServicesFinance{

	@Autowired
	RepositryFinance repositryFinance;
	
	@Override
	public List<Finance> findAll() {
		// TODO Auto-generated method stub
		return repositryFinance.findAll();
	}

	@Override
	public void save(Finance entity) {
		repositryFinance.save(entity);
	}

	@Override
	public Finance getOne(int id) {
		// TODO Auto-generated method stub
		return repositryFinance.getOne(id);
	}

	@Override
	public boolean existsById(int id) {
		// TODO Auto-generated method stub
		return repositryFinance.existsById(id);
	}

	@Override
	public void deleteById(int id) {
		repositryFinance.deleteById(id);
	}

	@Override
	public void delete(Finance entity) {
		repositryFinance.delete(entity);
	}

	@Override
	public void deleteAll() {
		repositryFinance.deleteAll();
	}

	@Override
	public void Update(Finance entity) {
		repositryFinance.save(entity);
	 }

	@Override
	public Finance findByAgences(int agence) {
	
		return repositryFinance.findByAgences(agence);
	}

}
