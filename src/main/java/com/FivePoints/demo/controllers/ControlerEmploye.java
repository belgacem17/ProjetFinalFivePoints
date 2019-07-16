package com.FivePoints.demo.controllers;


import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.FivePoints.demo.ImplRepositry.ImplRepositryEmploye;
import com.FivePoints.demo.entities.Employe; 

@RestController
@RequestMapping("/employe")
public class ControlerEmploye {
	
	@Autowired
	private ImplRepositryEmploye implRepositryEmploye;
	
	private Employe emp;

	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public List<Employe> FindAll()
	{
		//System.out.println("aymen");
		return  implRepositryEmploye.findAll();
	}
	
	@RequestMapping(value="/add",method=RequestMethod.PUT)
	public Employe saveEmploye(@RequestBody Employe employe) throws IOException
	{
		//employe=implRepositryEmploye.getOne(employe.getId());
   	  System.out.println(employe.getAdresse());
		employe.setPhoto(emp.getPhoto());
//		employe = uploadMultipartFile(file);
		implRepositryEmploye.save(employe);
		return employe;
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
	
	@RequestMapping(value="/file", method=RequestMethod.POST)
    public   void uploadMultipartFile(@RequestParam("photo") MultipartFile file) {
      try {
    	   
    	  Employe entity = new Employe();   
    	  byte[] bytes = ((MultipartFile) file).getBytes();
    	  entity.setPhoto( bytes);
    	  emp=entity;
    	  implRepositryEmploye.save(entity);
    	  
       
    } catch (  Exception e) {
     
    }    
    }
	
	@RequestMapping(value="/addem",
    method=RequestMethod.POST
    		, headers = {"content-type=application/x-www-form-urlencoded"}
    )
    public Employe register(@RequestBody MultiValueMap<String, String> formData) {
      try {
    	  Employe entity = new Employe();
    	  
//    	  byte[] bytes = ((MultipartFile) file).getBytes();
    	  // entity.setPhoto((byte[]) formData.getFirst("photo"));
    	  entity.setFirstName(String.valueOf(formData.getFirst("firstName")));
    	  System.out.println(formData.getFirst("firstName"));
    	  
    	  
    	  
    	  Set<String> keys = formData.keySet();

    	   for (String key : keys) {
    	      System.out.println("Key = " + key);
    	      System.out.println("Values = " + formData.get(key));
    	      String a = String.valueOf(formData.get(key));

    	      System.out.println("A : " + a);
    	    }
    // implRepositryEmploye.save(entity);
    	  
        return entity;
    } catch (  Exception e) {
      return null;
    }    
    }
}
