package com.FivePoints.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.FivePoints.demo.ImplRepositry.ImplRepositryAdmin;
import com.FivePoints.demo.ImplRepositry.ImplRepositryAgences;
import com.FivePoints.demo.entities.Admin;
import com.FivePoints.demo.entities.Agences;


@RestController
@RequestMapping("/admin")
public class ControlerAdmin {
	
	@Autowired
	private ImplRepositryAdmin implRepositryAdmin;
	
	@Autowired
	private ImplRepositryAgences implRepositryAgences;
	
	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public List<Admin> FindAll()
	{
		//System.out.println("aymen");
		return  implRepositryAdmin.findAll();
	}
	
	@RequestMapping(value="/add/{lieu}",method=RequestMethod.POST)
	public void saveUser(@RequestBody Admin admin, @PathVariable("lieu") String lieu)
	{
		Agences agences = new Agences();
		agences= implRepositryAgences.findByLieu(lieu);
		admin.setAgence(agences);
		implRepositryAdmin.save(admin);
	}
	
	@RequestMapping(value="/getId/{idA}",method=RequestMethod.POST)
	public Admin getOne(@PathVariable("idA") int id) {
		
		return implRepositryAdmin.getOne(id);
	}
	
	@RequestMapping(value="/existsId/{idA}",method=RequestMethod.POST)
	public boolean existsById(@PathVariable("idA") int id) {
		return implRepositryAdmin.existsById(id);
	}
 
	@RequestMapping(value="/delOneById/{idA}",method=RequestMethod.DELETE)
	public void deleteById(@PathVariable("idA") int id)
	{
		implRepositryAdmin.deleteById(id);
	}
 
	@RequestMapping(value="/delOne",method=RequestMethod.DELETE)
 	public void delete(@RequestBody Admin entity) {
 		implRepositryAdmin.delete(entity);
 	}
	
	@RequestMapping(value="/delAll",method=RequestMethod.DELETE)
 	public void deleteAll() {
 		implRepositryAdmin.deleteAll();
 	}
	
	@RequestMapping(value="/update",method=RequestMethod.PUT)
 	public void Update(@RequestBody Admin entity)
 	{
 		implRepositryAdmin.save(entity);
 	}
}
