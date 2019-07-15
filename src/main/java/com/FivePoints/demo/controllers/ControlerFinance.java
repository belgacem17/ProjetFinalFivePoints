package com.FivePoints.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.FivePoints.demo.ImplRepositry.ImplRepositryAgences;
import com.FivePoints.demo.ImplRepositry.ImplRepositryFinance;
import com.FivePoints.demo.entities.Agences;
import com.FivePoints.demo.entities.Finance;


@RestController
@RequestMapping("/finance")
public class ControlerFinance {
	
	@Autowired
	private ImplRepositryFinance implRepositryFinance;
 
	@Autowired
	private ImplRepositryAgences implRepositryAgences;

	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public List<Finance> FindAll()
	{
		//System.out.println("aymen");
		return  implRepositryFinance.findAll();
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public void saveFinance(@RequestBody Finance finance, @PathVariable("lieu") String lieu)
	{
		Agences agences = new Agences();
		agences= implRepositryAgences.findByLieu(lieu);
		finance.setAgences(agences);
		implRepositryFinance.save(finance);
	}
	
	@RequestMapping(value="/getId/{idA}",method=RequestMethod.POST)
	public Finance getOne(@PathVariable("idA") int id) {
		
		return implRepositryFinance.getOne(id);
	}
	
	@RequestMapping(value="/existsId/{idA}",method=RequestMethod.POST)
	public boolean existsById(@PathVariable("idA") int id) {
		return implRepositryFinance.existsById(id);
	}
 
	@RequestMapping(value="/delOneById/{idA}",method=RequestMethod.DELETE)
	public void deleteById(@PathVariable("idA") int id)
	{
		implRepositryFinance.deleteById(id);
	}
 
	@RequestMapping(value="/delOne",method=RequestMethod.DELETE)
 	public void delete(@RequestBody Finance entity) {
 		implRepositryFinance.delete(entity);
 	}
	
	@RequestMapping(value="/delAll",method=RequestMethod.DELETE)
 	public void deleteAll() {
 		implRepositryFinance.deleteAll();
 	}
	
	@RequestMapping(value="/update",method=RequestMethod.PUT)
 	public void Update(@RequestBody Finance entity)
 	{
 		implRepositryFinance.save(entity);
 	}
	
	@RequestMapping(value="/find/{lieu}",method=RequestMethod.GET)
	public Finance find(@PathVariable("lieu") String lieu)
	{
		Agences agences = new Agences();
		agences= implRepositryAgences.findByLieu(lieu);
		//Finance finance = new Finance();
		System.out.println(agences.getId());
	
		return null; 
	}
	
}
