package com.FivePoints.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.FivePoints.demo.ImplRepositry.ImplRepositryAchat;
import com.FivePoints.demo.ImplRepositry.ImplRepositryAgences;
import com.FivePoints.demo.ImplRepositry.ImplRepositryFinance;
import com.FivePoints.demo.entities.Achat;
import com.FivePoints.demo.entities.Agences;
import com.FivePoints.demo.entities.Finance;


@RestController
@RequestMapping("/achat")
public class ControlerAchat {
	
	@Autowired
	private ImplRepositryAchat implRepositryAchat;
	
	@Autowired
	private ImplRepositryAgences implRepositryAgences;
	
	@Autowired
	private ImplRepositryFinance implRepositryFinance;

	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public List<Achat> FindAll()
	{
		//System.out.println("aymen");
		return  implRepositryAchat.findAll();
	}
	
	@RequestMapping(value="/add/{lieu}",method=RequestMethod.POST)
	public void saveAchat(@RequestBody Achat achat ,@PathVariable("lieu") String lieu)
	{
		Agences agences = new Agences();
		agences= implRepositryAgences.findByLieu(lieu);
		Finance finance = new Finance();
		finance= implRepositryFinance.findByAgences(agences.getId());
		achat.setFinance(finance);
		implRepositryAchat.save(achat);
	}
	
	@RequestMapping(value="/getId/{idA}",method=RequestMethod.GET)
	public Achat getOne(@PathVariable("idA") Integer id) {
		Achat a = new Achat();
		a=implRepositryAchat.getOne(id);
		return a;
	}
	
	@RequestMapping(value="/existsId/{idA}",method=RequestMethod.POST)
	public boolean existsById(@PathVariable("idA") int id) {
		return implRepositryAchat.existsById(id);
	}
 
	@RequestMapping(value="/delOneById/{idA}",method=RequestMethod.DELETE)
	public void deleteById(@PathVariable("idA") int id)
	{
		implRepositryAchat.deleteById(id);
	}
 
	@RequestMapping(value="/delOne",method=RequestMethod.DELETE)
 	public void delete(@RequestBody Achat entity) {
 		implRepositryAchat.delete(entity);
 	}
	
	@RequestMapping(value="/delAll",method=RequestMethod.DELETE)
 	public void deleteAll() {
 		implRepositryAchat.deleteAll();
 	}
	
	@RequestMapping(value="/update",method=RequestMethod.PUT)
 	public void Update(@RequestBody Achat entity)
 	{
 		implRepositryAchat.save(entity);
 	}
	
	
}
