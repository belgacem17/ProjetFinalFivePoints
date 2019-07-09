package com.FivePoints.demo.ImplRepositry;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FivePoints.demo.entities.Achat;
import com.FivePoints.demo.repositories.RepositryAchat;
import com.FivePoints.demo.services.ServicesAchat;

@Service("implRepositryAchat")
public class ImplRepositryAchat implements ServicesAchat{

	@Autowired
	RepositryAchat repositryAchat;

	//private Achat Achat;
	 

	@Override
	public void save(Achat entity) {
		repositryAchat.save(entity);
		
	}

	@Override
	public Achat getOne(int id) {
		return repositryAchat.getOne(id);
	}

	@Override
	public boolean existsById(int id) {
		// TODO Auto-generated method stub
		return repositryAchat.existsById(id);
	}

	@Override
	public void deleteById(int id) {
		repositryAchat.deleteById(id);
		
	}

	@Override
	public void delete(Achat entity) {
		repositryAchat.delete(entity);
		
	}

	@Override
	public void deleteAll() {
		repositryAchat.deleteAll();
		
	}

	@Override
	public void Update(Achat entity) {
		repositryAchat.deleteAll();
		
	}

	@Override
	public List<Achat> findAll() {
		return repositryAchat.findAll();
	}
}
