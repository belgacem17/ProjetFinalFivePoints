package com.FivePoints.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.FivePoints.demo.ImplRepositry.ImplRepositryCondidats;
import com.FivePoints.demo.ImplRepositry.ImplRepositryFormation;
import com.FivePoints.demo.entities.Condidats;
import com.FivePoints.demo.entities.Formation;


@RestController
@RequestMapping("/condidats")
public class ControlerCondidats {
	
	@Autowired
	 ImplRepositryCondidats implRepositryCondidats;
	
	@Autowired
	 ImplRepositryFormation implRepositryFormation;
	
	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public List<Condidats> FindAll()
	{
		//System.out.println("aymen");
		return  implRepositryCondidats.findAll();
	}
	
	@RequestMapping(value="/add/{idF}",method=RequestMethod.POST)
	public void saveCondidats(@RequestBody Condidats condidats,@PathVariable("idF") int id)
	{
		Formation formation = new Formation();
		formation= implRepositryFormation.getOne(id);

		implRepositryCondidats.save(condidats);
	}
	
	@RequestMapping(value="/getId/{idC}",method=RequestMethod.POST)
	public Condidats getOne(@PathVariable("idC") int id) {
		
		return implRepositryCondidats.getOne(id);
	}
	
	@RequestMapping(value="/existsId/{idC}",method=RequestMethod.POST)
	public boolean existsById(@PathVariable("idC") int id) {
		return implRepositryCondidats.existsById(id);
	}
 
	@RequestMapping(value="/delOneById/{idC}",method=RequestMethod.DELETE)
	public void deleteById(@PathVariable("idC") int id)
	{
		implRepositryCondidats.deleteById(id);
	}
 
	@RequestMapping(value="/delOne",method=RequestMethod.DELETE)
 	public void delete(@RequestBody Condidats entity) {
 		implRepositryCondidats.delete(entity);
 	}
	
	@RequestMapping(value="/delAll",method=RequestMethod.DELETE)
 	public void deleteAll() {
 		implRepositryCondidats.deleteAll();
 	}
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
 	public void Update(@RequestBody Condidats entity)
 	{
 		implRepositryCondidats.save(entity);
 	}
	
	@RequestMapping(value="/NotPay",method=RequestMethod.POST)
	public List<Condidats> CondidatsNotPay() 	{
 		 
		return implRepositryCondidats.CondidatsNotPay();
 	}

}
