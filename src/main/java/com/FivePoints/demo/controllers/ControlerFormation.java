package com.FivePoints.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.FivePoints.demo.ImplRepositry.ImplRepositryCondidats;
import com.FivePoints.demo.ImplRepositry.ImplRepositryFormation;
import com.FivePoints.demo.ImplRepositry.ImplRepositryNiveau;
import com.FivePoints.demo.entities.Condidats;
import com.FivePoints.demo.entities.Formation;
import com.FivePoints.demo.entities.Niveau;


@RestController
@RequestMapping("/formation")
public class ControlerFormation {
	
	@Autowired
	private ImplRepositryFormation implRepositryFormation;
	
	@Autowired
	private ImplRepositryCondidats implRepositryCondidats;
	
	@Autowired
	private ImplRepositryNiveau implRepositryNiveau;
	

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
		Formation formation = new Formation();
		
		formation=implRepositryFormation.getOne(id);
	
		for(Condidats c : formation.getListCondidats())
		{
			c.setFormation(null);
			implRepositryCondidats.save(c);
		}
		 formation.setListCondidats(  new ArrayList<Condidats>()) ;
		 
		 for(Niveau c : formation.getListNiveau())
			{
				c.setFormation(null);
				implRepositryNiveau.save(c);
			}
			 formation.setListNiveau(  new ArrayList<Niveau>()) ;
			 formation.setAgence(null);
		implRepositryFormation.save(formation);
 		implRepositryFormation.deleteById(id);
	}
 
	@RequestMapping(value="/delOne",method=RequestMethod.DELETE)
 	public void delete(@RequestBody Formation entity) {
		
		Formation f = implRepositryFormation.getOne(entity.getId());
		
//		System.out.println(entity.getName());
		for(Condidats c : f.getListCondidats())
		{
			c.setFormation(null);
			
			implRepositryCondidats.save(c);
		}
		
		 for(Niveau n : f.getListNiveau())
			{
				n.setFormation(null);
				implRepositryNiveau.save(n);
			}
//		entity.getListCondidats().clear();;
//		implRepositryFormation.save(entity); 
 		implRepositryFormation.delete(entity);
 	}
	
	@RequestMapping(value="/delAll",method=RequestMethod.DELETE)
 	public void deleteAll() {
		List<Formation> Find = implRepositryFormation.findAll();
		
		for(Formation n : Find)
		{
			for(Condidats c : n.getListCondidats())
			{
				c.setFormation(null);
				
				implRepositryCondidats.save(c);
			}
			
			 for(Niveau i : n.getListNiveau())
				{
					i.setFormation(null);
					implRepositryNiveau.save(i);
				}
			n.setListNiveau(  new ArrayList<Niveau>()) ;
			n.setListCondidats(  new ArrayList<Condidats>()) ;
			implRepositryFormation.save(n); 
		}
		
 		implRepositryFormation.deleteAll();
 	}
	
	@RequestMapping(value="/update",method=RequestMethod.PUT)
 	public void Update(@RequestBody Formation entity)
 	{
		Formation f = implRepositryFormation.getOne(entity.getId());
		entity.setAgence(f.getAgence());
		
 		implRepositryFormation.save(entity);
 	}
}
