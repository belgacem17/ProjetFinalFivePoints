package com.FivePoints.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.FivePoints.demo.ImplRepositry.ImplRepositryFormation;
import com.FivePoints.demo.entities.Formation;


@RestController
@RequestMapping("/formation")
public class ControlerFormation {
	
	@Autowired
	private ImplRepositryFormation implRepositryFormation;
	

	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public List<Formation> FindAll()
	{ 
		return  implRepositryFormation.findAll();
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public void saveUser(@RequestBody Formation user)
	{
		implRepositryFormation.save(user);
	}
	
	@RequestMapping(value="/getId/{idA}",method=RequestMethod.POST)
	public Formation getOne(@PathVariable("idA") int id) {
		
		return implRepositryFormation.getOne(id);
	}
	
	@RequestMapping(value="/existsId/{idA}",method=RequestMethod.POST)
	public boolean existsById(@PathVariable("idA") int id) {
		return implRepositryFormation.existsById(id);
	}
 
	@RequestMapping(value="/delOneById/{idA}",method=RequestMethod.DELETE)
	public void deleteById(@PathVariable("idA") int id)
	{
		implRepositryFormation.deleteById(id);
	}
 
	@RequestMapping(value="/delOne",method=RequestMethod.DELETE)
 	public void delete(@RequestBody Formation entity) {
 		implRepositryFormation.delete(entity);
 	}
	
	@RequestMapping(value="/delAll",method=RequestMethod.DELETE)
 	public void deleteAll() {
 		implRepositryFormation.deleteAll();
 	}
	
	@RequestMapping(value="/update",method=RequestMethod.PUT)
 	public void Update(@RequestBody Formation entity)
 	{
 		implRepositryFormation.save(entity);
 	}
}
