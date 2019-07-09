package com.FivePoints.demo.ImplRepositry;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FivePoints.demo.entities.Charge;
import com.FivePoints.demo.repositories.RepositryCharge;
import com.FivePoints.demo.services.ServicesCharge;

@Service("implRepositryCharge")
public class ImplRepositryCharge implements ServicesCharge{

	@Autowired
	RepositryCharge repositryCharge;
	
	@Override
	public List<Charge> findAll() {
		return repositryCharge.findAll();
	}

	@Override
	public void save(Charge entity) {
		repositryCharge.save(entity);
		
	}

	@Override
	public Charge getOne(int id) {
		// TODO Auto-generated method stub
		return repositryCharge.getOne(id);
	}

	@Override
	public boolean existsById(int id) {
		// TODO Auto-generated method stub
		return repositryCharge.existsById(id);
	}

	@Override
	public void deleteById(int id) {
		repositryCharge.deleteById(id);
		
	}

	@Override
	public void delete(Charge entity) {
		repositryCharge.delete(entity);
	}

	@Override
	public void deleteAll() {
		
		repositryCharge.deleteAll();	
	}

	@Override
	public void Update(Charge entity) {

		repositryCharge.save(entity);
	}

}
