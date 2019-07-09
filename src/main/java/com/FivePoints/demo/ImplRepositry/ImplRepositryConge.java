package com.FivePoints.demo.ImplRepositry;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FivePoints.demo.entities.Conge;
import com.FivePoints.demo.repositories.RepositryConge;
import com.FivePoints.demo.services.ServicesConge;

@Service("implRepositryConge")
public class ImplRepositryConge implements ServicesConge{

	@Autowired
	RepositryConge repositryConge;
	
	@Override
	public List<Conge> findAll() {
		// TODO Auto-generated method stub
		return repositryConge.findAll();
	}

	@Override
	public void save(Conge entity) {
		repositryConge.save(entity);
	}

	@Override
	public Conge getOne(int id) {
		// TODO Auto-generated method stub
		return repositryConge.getOne(id);
	}

	@Override
	public boolean existsById(int id) {
		// TODO Auto-generated method stub
		return repositryConge.existsById(id);
	}

	@Override
	public void deleteById(int id) {
		repositryConge.deleteById(id);
	}

	@Override
	public void delete(Conge entity) {
		repositryConge.delete(entity);
	}

	@Override
	public void deleteAll() {
		repositryConge.deleteAll();
	}

	@Override
	public void Update(Conge entity) {
		repositryConge.save(entity);
	}

}
