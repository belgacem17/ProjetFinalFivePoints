package com.FivePoints.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.FivePoints.demo.ImplRepositry.ImplRepositryCharge;
import com.FivePoints.demo.entities.Charge;


@RestController
@RequestMapping("/charge")
public class ControlerCharge {
	
	@Autowired
	private ImplRepositryCharge implRepositryCharge;
	

	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public List<Charge> FindAll()
	{
		//System.out.println("aymen");
		return  implRepositryCharge.findAll();
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public void saveUser(@RequestBody Charge user)
	{
		implRepositryCharge.save(user);
	}
	
	@RequestMapping(value="/getId/{idA}",method=RequestMethod.POST)
	public Charge getOne(@PathVariable("idA") int id) {
		
		return implRepositryCharge.getOne(id);
	}
	
	@RequestMapping(value="/existsId/{idA}",method=RequestMethod.POST)
	public boolean existsById(@PathVariable("idA") int id) {
		return implRepositryCharge.existsById(id);
	}
 
	@RequestMapping(value="/delOneById/{idA}",method=RequestMethod.DELETE)
	public void deleteById(@PathVariable("idA") int id)
	{
		implRepositryCharge.deleteById(id);
	}
 
	@RequestMapping(value="/delOne",method=RequestMethod.DELETE)
 	public void delete(@RequestBody Charge entity) {
 		implRepositryCharge.delete(entity);
 	}
	
	@RequestMapping(value="/delAll",method=RequestMethod.DELETE)
 	public void deleteAll() {
 		implRepositryCharge.deleteAll();
 	}
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
 	public void Update(@RequestBody Charge entity)
 	{
 		implRepositryCharge.save(entity);
 	}
}
