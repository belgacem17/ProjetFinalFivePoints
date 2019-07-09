package com.FivePoints.demo.ImplRepositry;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FivePoints.demo.entities.Admin;
import com.FivePoints.demo.repositories.RepositryAdmin;
import com.FivePoints.demo.services.ServicesAdmin;

@Service("implRepositryAdmin")
public class ImplRepositryAdmin implements ServicesAdmin{

	@Autowired
	RepositryAdmin repositryAdmin;
	
	@Override
	public List<Admin> findAll() {
		// TODO Auto-generated method stub
		return repositryAdmin.findAll();
	}

	@Override
	public void save(Admin entity) {
		
		repositryAdmin.save(entity);
		
	}

	@Override
	public Admin getOne(int id) {
		 
		return repositryAdmin.getOne(id);
	}

	@Override
	public boolean existsById(int id) {
		 
		return repositryAdmin.existsById(id);
	}

	@Override
	public void deleteById(int id) {
		repositryAdmin.deleteById(id);
		
	}

	@Override
	public void delete(Admin entity) {
		repositryAdmin.delete(entity);
	}

	@Override
	public void deleteAll() {
		repositryAdmin.deleteAll();
		
	}

	@Override
	public void Update(Admin entity) {
		repositryAdmin.save(entity);
	}

}
