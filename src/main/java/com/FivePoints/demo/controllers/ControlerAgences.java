package com.FivePoints.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.FivePoints.demo.ImplRepositry.ImplRepositryAgences;
import com.FivePoints.demo.entities.Agences;
import com.FivePoints.demo.entities.Finance;


@RestController
@RequestMapping("/agences")
public class ControlerAgences {
	
	@Autowired
	private ImplRepositryAgences implRepositryAgences;
	

	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public List<Agences> FindAll()
	{
		//System.out.println("aymen");
		return  implRepositryAgences.findAll();
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String saveAgences(@RequestBody Agences agence)
	{
		if( implRepositryAgences.findByLieu(agence.getLieu())!= null)
		{
			implRepositryAgences.save(agence);
			return "Succes";
		}
		else {
			return "Exist";
		}
		
	}
	
	@RequestMapping(value="/getId/{idA}",method=RequestMethod.POST)
	public Agences getOne(@PathVariable("idA") int id) {
		
		return implRepositryAgences.getOne(id);
	}
	
	@RequestMapping(value="/existsId/{idA}",method=RequestMethod.POST)
	public boolean existsById(@PathVariable("idA") int id) {
		return implRepositryAgences.existsById(id);
	}
 
	@RequestMapping(value="/delOneById/{idA}",method=RequestMethod.DELETE)
	public void deleteById(@PathVariable("idA") int id)
	{
		implRepositryAgences.deleteById(id);
	}
 
	@RequestMapping(value="/delOne",method=RequestMethod.DELETE)
 	public void delete(@RequestBody Agences entity) {
 		implRepositryAgences.delete(entity);
 	}
	
	@RequestMapping(value="/delAll",method=RequestMethod.DELETE)
 	public void deleteAll() {
 		implRepositryAgences.deleteAll();
 	}
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
 	public void Update(@RequestBody Agences entity)
 	{
 		implRepositryAgences.save(entity);
 	}
	
	@RequestMapping(value="/find/{lieu}",method=RequestMethod.GET)
	public Agences find(@PathVariable("lieu") String lieu)
	{
		Agences agences = new Agences();
		agences= implRepositryAgences.findByLieu(lieu);
		//Finance finance = new Finance();
		System.out.println(agences.getId());
		return  agences; 
	}
}
