package com.FivePoints.demo.ImplRepositry;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FivePoints.demo.entities.Paiments;
import com.FivePoints.demo.repositories.RepositryPaiment;
import com.FivePoints.demo.services.ServicesPaiment;

@Service("implRepositryPaiments")
public class ImplRepositryPaiments implements ServicesPaiment{

	@Autowired
	RepositryPaiment repositryPaiment;
	
	@Override
	public List<Paiments> findAll() {

		return repositryPaiment.findAll();
	}

	@Override
	public void save(Paiments entity) {
 		repositryPaiment.save(entity);
	}

	@Override
	public Paiments getOne(int id) {
 		return repositryPaiment.getOne(id);
	}


	@Override
	public boolean existsById(int id) {
		repositryPaiment.existsById(id);
		return false;
	}

	@Override
	public void deleteById(int id) {
		repositryPaiment.deleteById(id);
		
	}

	@Override
	public void delete(Paiments entity) {
		repositryPaiment.delete(entity);
		
	}

	@Override
	public void deleteAll() {
		repositryPaiment.deleteAll();
	}

	@Override
	public void Update(Paiments entity) {
		repositryPaiment.save(entity);
	}

}
