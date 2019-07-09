package com.FivePoints.demo.services;

import java.util.List;

import com.FivePoints.demo.entities.Admin;

public interface ServicesAdmin {

	public List<Admin> findAll();
	public void save(Admin entity);
	public Admin getOne(int id);
	public boolean existsById(int id);
	public void deleteById(int id);
	public void delete(Admin entity);
	public void deleteAll();
	public void Update(Admin entity);
	
}
