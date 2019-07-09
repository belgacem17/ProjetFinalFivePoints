package com.FivePoints.demo.ImplRepositry;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FivePoints.demo.entities.Formation;
import com.FivePoints.demo.repositories.RepositryFormation;
import com.FivePoints.demo.services.ServicesFormations;

@Service("implRepositryFormation")
public class ImplRepositryFormation implements ServicesFormations{

	@Autowired
	RepositryFormation repositryFormation;
	
	@Override
	public List<Formation> findAll() {
		// TODO Auto-generated method stub
		return repositryFormation.findAll();
	}

	@Override
	public void save(Formation entity) {
		repositryFormation.save(entity);
	}

	@Override
	public Formation getOne(int id) {
		return repositryFormation.getOne(id);
	}



	@Override
	public boolean existsById(int id) {
		// TODO Auto-generated method stub
		return repositryFormation.existsById(id);
	}

	@Override
	public void deleteById(int id) {
		repositryFormation.deleteById(id);
	}

	@Override
	public void delete(Formation entity) {
		repositryFormation.delete(entity);
	}

	@Override
	public void deleteAll() {
		repositryFormation.deleteAll();
	}

	@Override
	public void Update(Formation entity) {
		repositryFormation.save(entity);	
	}


}
