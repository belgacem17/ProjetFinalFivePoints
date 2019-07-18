package com.FivePoints.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.FivePoints.demo.ImplRepositry.ImplRepositryNiveau;
import com.FivePoints.demo.entities.Niveau;


@RestController
@RequestMapping("/niveau")
public class ControlerNiveau {
	
	@Autowired
	private ImplRepositryNiveau implRepositryNiveau;
	

	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public List<Niveau> FindAll()
	{
		//System.out.println("aymen");
		return  implRepositryNiveau.findAll();
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public void saveNiveau(@RequestBody Niveau niveau)
	{
		
		implRepositryNiveau.save(niveau);
	}
	
	@RequestMapping(value="/getId/{idN}",method=RequestMethod.POST)
	public Niveau getOne(@PathVariable("idN") int id) {
		
		return implRepositryNiveau.getOne(id);
	}
	
	@RequestMapping(value="/existsId/{idN}",method=RequestMethod.POST)
	public boolean existsById(@PathVariable("idN") int id) {
		return implRepositryNiveau.existsById(id);
	}
 
	@RequestMapping(value="/delOneById/{idN}",method=RequestMethod.DELETE)
	public void deleteById(@PathVariable("idN") int id)
	{
		Niveau niveau = implRepositryNiveau.getOne(id);
		niveau.setFormation(null);
		implRepositryNiveau.save(niveau);
		
		implRepositryNiveau.deleteById(niveau.getId());
	}
 
	@RequestMapping(value="/delOne",method=RequestMethod.DELETE)
 	public void delete(@RequestBody Niveau entity) {
 		implRepositryNiveau.delete(entity);
 	}
	
	@RequestMapping(value="/delAll",method=RequestMethod.DELETE)
 	public void deleteAll() {
 		implRepositryNiveau.deleteAll();
 	}
	
	@RequestMapping(value="/update",method=RequestMethod.PUT)
 	public void Update(@RequestBody Niveau entity)
 	{
		Niveau n = implRepositryNiveau.getOne(entity.getId());
		entity.setFormation(n.getFormation());
 		implRepositryNiveau.save(entity);
 	}
}
