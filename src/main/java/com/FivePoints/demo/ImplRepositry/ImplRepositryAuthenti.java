package com.FivePoints.demo.ImplRepositry;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FivePoints.demo.entities.Authentification;
import com.FivePoints.demo.repositories.RepositryAuthent;
import com.FivePoints.demo.services.ServicesAuthenti;

@Service("ImplRepositryAuthenti")
public class ImplRepositryAuthenti implements ServicesAuthenti{

	@Autowired
	RepositryAuthent repositryAuthent;

	@Override
	public List<Authentification> findAll() {
		 
		return repositryAuthent.findAll();
	}

	@Override
	public void save(Authentification entity) {
		repositryAuthent.save(entity);
		
	}

	@Override
	public Authentification getOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(int id) {
		// TODO Auto-generated method stub
		return false;
	} 
	 
 
}
