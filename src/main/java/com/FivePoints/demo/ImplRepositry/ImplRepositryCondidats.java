package com.FivePoints.demo.ImplRepositry;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FivePoints.demo.entities.Condidats;
import com.FivePoints.demo.repositories.RepositryCandidats;
import com.FivePoints.demo.services.ServicesCandidats;

@Service("implRepositryCondidats")
public class ImplRepositryCondidats implements ServicesCandidats{

	@Autowired
	RepositryCandidats repositryGeneric;

	//private Condidats condidats;
	 

	@Override
	public void save(Condidats entity) {
		repositryGeneric.save(entity);
		
	}

	@Override
	public Condidats getOne(int id) {
		return repositryGeneric.getOne(id);
	}

	@Override
	public boolean existsById(int id) {
		// TODO Auto-generated method stub
		return repositryGeneric.existsById(id);
	}

	@Override
	public void deleteById(int id) {
		repositryGeneric.deleteById(id);
		
	}

	@Override
	public void delete(Condidats entity) {
		repositryGeneric.delete(entity);
		
	}

	@Override
	public void deleteAll() {
		repositryGeneric.deleteAll();
		
	}

	@Override
	public void Update(Condidats entity) {
		repositryGeneric.deleteAll();
		
	}

	@Override
	public List<Condidats> findAll() {
		// TODO Auto-generated method stub
		return repositryGeneric.findAll();
	}

	@Override
	public List<Condidats> CondidatsNotPay() {
		// TODO Auto-generated method stub
		return repositryGeneric.CondidatsNotPay();
	}



}
