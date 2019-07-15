package com.FivePoints.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.FivePoints.demo.ImplRepositry.ImplRepositryEmploye;
import com.FivePoints.demo.entities.Employe;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("/employe")
public class ControlerEmploye {
	
	@Autowired
	private ImplRepositryEmploye implRepositryEmploye;
	

	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public List<Employe> FindAll()
	{
		//System.out.println("aymen");
		return  implRepositryEmploye.findAll();
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public void saveEmploye(@RequestBody Employe employe)
	{
		
		implRepositryEmploye.save(employe);
	}
	
	@RequestMapping(value="/getId/{idA}",method=RequestMethod.POST)
	public Employe getOne(@PathVariable("idA") int id) {
		
		return implRepositryEmploye.getOne(id);
	}
	
	@RequestMapping(value="/existsId/{idA}",method=RequestMethod.POST)
	public boolean existsById(@PathVariable("idA") int id) {
		return implRepositryEmploye.existsById(id);
	}
 
	@RequestMapping(value="/delOneById/{idA}",method=RequestMethod.DELETE)
	public void deleteById(@PathVariable("idA") int id)
	{
		implRepositryEmploye.deleteById(id);
	}
 
	@RequestMapping(value="/delOne",method=RequestMethod.DELETE)
 	public void delete(@RequestBody Employe entity) {
 		implRepositryEmploye.delete(entity);
 	}
	
	@RequestMapping(value="/delAll",method=RequestMethod.DELETE)
 	public void deleteAll() {
 		implRepositryEmploye.deleteAll();
 	}
	
	@RequestMapping(value="/update",method=RequestMethod.PUT)
 	public void Update(@RequestBody Employe entity)
 	{
 		implRepositryEmploye.save(entity);
 	}
	
	
}
