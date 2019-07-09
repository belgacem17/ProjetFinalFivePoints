package com.FivePoints.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.FivePoints.demo.ImplRepositry.ImplRepositryConge;
import com.FivePoints.demo.entities.Conge;


@RestController
@RequestMapping("/conge")
public class ControlerConge {
	
	@Autowired
	private ImplRepositryConge implRepositryConge;
	

	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public List<Conge> FindAll()
	{ 
		return  implRepositryConge.findAll();
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public void saveUser(@RequestBody Conge user)
	{
		implRepositryConge.save(user);
	}
	
	@RequestMapping(value="/getId/{idA}",method=RequestMethod.POST)
	public Conge getOne(@PathVariable("idA") int id) {
		
		return implRepositryConge.getOne(id);
	}
	
	@RequestMapping(value="/existsId/{idA}",method=RequestMethod.POST)
	public boolean existsById(@PathVariable("idA") int id) {
		return implRepositryConge.existsById(id);
	}
 
	@RequestMapping(value="/delOneById/{idA}",method=RequestMethod.DELETE)
	public void deleteById(@PathVariable("idA") int id)
	{
		implRepositryConge.deleteById(id);
	}
 
	@RequestMapping(value="/delOne",method=RequestMethod.DELETE)
 	public void delete(@RequestBody Conge entity) {
 		implRepositryConge.delete(entity);
 	}
	
	@RequestMapping(value="/delAll",method=RequestMethod.DELETE)
 	public void deleteAll() {
 		implRepositryConge.deleteAll();
 	}
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
 	public void Update(@RequestBody Conge entity)
 	{
 		implRepositryConge.save(entity);
 	}
}
