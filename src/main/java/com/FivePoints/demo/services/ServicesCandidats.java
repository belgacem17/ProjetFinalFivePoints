package com.FivePoints.demo.services;

import java.util.List;

import com.FivePoints.demo.entities.Condidats;

public interface ServicesCandidats {

	public List<Condidats> findAll();
	public void save(Condidats entity);
	public Condidats getOne(int id);
	public boolean existsById(int id);
	public void deleteById(int id);
	public void delete(Condidats entity);
	public void deleteAll();
	public void Update(Condidats entity);
	/*-------------CRUD SPECIFIQUE-------------*/
	public List<Condidats> CondidatsNotPay();
}
