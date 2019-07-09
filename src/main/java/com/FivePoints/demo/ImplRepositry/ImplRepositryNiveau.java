package com.FivePoints.demo.ImplRepositry;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FivePoints.demo.entities.Niveau;
import com.FivePoints.demo.repositories.RepositryNiveau;
import com.FivePoints.demo.services.ServicesNiveau;

@Service("implRepositryNiveau")
public class ImplRepositryNiveau implements ServicesNiveau{

	@Autowired
	RepositryNiveau repositryNiveau;
	
	@Override
	public List<Niveau> findAll() {
		return repositryNiveau.findAll();
	}

	@Override
	public void save(Niveau entity) {
		repositryNiveau.save(entity);
	}

	@Override
	public Niveau getOne(int id) {
		// TODO Auto-generated method stub
		return repositryNiveau.getOne(id);
	}

	@Override
	public boolean existsById(int id) {
		// TODO Auto-generated method stub
		return repositryNiveau.existsById(id);
	}

	@Override
	public void deleteById(int id) {
		repositryNiveau.deleteById(id);
		
	}

	@Override
	public void delete(Niveau entity) {
		repositryNiveau.delete(entity);
	}

	@Override
	public void deleteAll() {
		repositryNiveau.deleteAll();
	}

	@Override
	public void Update(Niveau entity) {
		repositryNiveau.save(entity);
	}

}
