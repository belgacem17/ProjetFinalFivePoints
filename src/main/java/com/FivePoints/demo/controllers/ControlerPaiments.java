package com.FivePoints.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.FivePoints.demo.ImplRepositry.ImplRepositryPaiments;
import com.FivePoints.demo.entities.Paiments;


@RestController
@RequestMapping("/Paiments")
public class ControlerPaiments {
	
	@Autowired
	private ImplRepositryPaiments implRepositryPaiments;
	

	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public List<Paiments> FindAll()
	{
		//System.out.println("aymen");
		return  implRepositryPaiments.findAll();
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public void saveUser(@RequestBody Paiments user)
	{
		implRepositryPaiments.save(user);
	}
	
	@RequestMapping(value="/getId/{idN}",method=RequestMethod.POST)
	public Paiments getOne(@PathVariable("idN") int id) {
		
		return implRepositryPaiments.getOne(id);
	}
	
	@RequestMapping(value="/existsId/{idN}",method=RequestMethod.POST)
	public boolean existsById(@PathVariable("idN") int id) {
		return implRepositryPaiments.existsById(id);
	}
 
	@RequestMapping(value="/delOneById/{idN}",method=RequestMethod.DELETE)
	public void deleteById(@PathVariable("idN") int id)
	{
		implRepositryPaiments.deleteById(id);
	}
 
	@RequestMapping(value="/delOne",method=RequestMethod.DELETE)
 	public void delete(@RequestBody Paiments entity) {
 		implRepositryPaiments.delete(entity);
 	}
	
	@RequestMapping(value="/delAll",method=RequestMethod.DELETE)
 	public void deleteAll() {
 		implRepositryPaiments.deleteAll();
 	}
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
 	public void Update(@RequestBody Paiments entity)
 	{
 		implRepositryPaiments.save(entity);
 	}
}
