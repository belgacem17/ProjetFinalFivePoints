package com.FivePoints.demo.ImplRepositry;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FivePoints.demo.entities.Employe;
import com.FivePoints.demo.repositories.RepositryEmploye;
import com.FivePoints.demo.services.ServicesEmploye;

@Service("implRepositryEmploye")
public class ImplRepositryEmploye implements ServicesEmploye {

	@Autowired
	RepositryEmploye repositryEmploye;
	
	@Override
	public List<Employe> findAll() {
		// TODO Auto-generated method stub
		return repositryEmploye.findAll();
	}

	@Override
	public void save(Employe entity) {
		repositryEmploye.save(entity);		
	}

	@Override
	public Employe getOne(int id) {
		// TODO Auto-generated method stub
		return repositryEmploye.getOne(id);
	}


	@Override
	public boolean existsById(int id) {
		// TODO Auto-generated method stub
		return repositryEmploye.existsById(id);
	}

	@Override
	public void deleteById(int id) {
		repositryEmploye.deleteById(id);
	}

	@Override
	public void delete(Employe entity) {
		repositryEmploye.delete(entity);
	}

	@Override
	public void deleteAll() {
		repositryEmploye.deleteAll();
	}

	@Override
	public void Update(Employe entity) {
		repositryEmploye.save(entity);
	}

}
