package com.FivePoints.demo.controllers;


import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.*;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
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
	public void saveEmploye(@RequestBody Employe employe) throws IOException
	{
		List<Employe> l= FindAll();
		emp=l.get(l.size()-1);
		// employe=implRepositryEmploye.getOne(emp.getId());
   	 
		employe.setPhoto(emp.getPhoto());
		employe.setTypeFile(emp.getTypeFile());
		employe.setNameFile(emp.getNameFile());
//		employe = uploadMultipartFile(file); 
		System.out.println(employe.getId());
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
		Employe emp = implRepositryEmploye.getOne(id);
		emp.setAgence(null);
		implRepositryEmploye.save(emp);
		implRepositryEmploye.deleteById(emp.getId());
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
		
		Employe empl= implRepositryEmploye.getOne(entity.getId());
		entity.setAgence(empl.getAgence());
	 		implRepositryEmploye.save(entity);

	 
 	}
	
	@RequestMapping(value="/file", method=RequestMethod.POST)
    public   void uploadMultipartFile(@RequestParam("photo") MultipartFile file) {
      try {
    	   
    	  Employe entity = new Employe();   
    	  byte[] bytes	 = ((MultipartFile) file).getBytes();
    	  entity.setTypeFile(file.getContentType());
    	  entity.setPhoto( bytes);
    	  entity.setNameFile(file.getOriginalFilename());
    	 System.out.println(entity.getTypeFile());
    	  implRepositryEmploye.save(entity);
    	  
       
    } catch (  Exception e) {
     
    }    
    }
	
//	@GetMapping("/downloadFile/{idE}")
//    public ResponseEntity<Resource> downloadFile(@PathVariable("idE") int idE) {
//        // Load file from database
//		
//        Employe employe= implRepositryEmploye.getOne(idE);
//        System.out.println(employe.getFirstName());
//        
//        return ResponseEntity.ok().body(new ByteArrayResource(employe.getPhoto()));
//    }
	
	@GetMapping("/downloadFile/{idE}")
    public ResponseEntity<Resource> downloadFile(@PathVariable("idE") int idE) {
        // Load file from database
		
        Employe employe= implRepositryEmploye.getOne(idE);
        System.out.println(employe.getFirstName());
//        return ResponseEntity.ok()
//        		.contentType(MediaType.parseMediaType(employe.getTypeFile()))
//                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + employe.getFirstName() + "\"")
//        		.body(new ByteArrayResource(employe.getPhoto()));
        
        return ResponseEntity.ok()
        		.contentType(MediaType.parseMediaType(employe.getTypeFile()))
        		.header(HttpHeaders.CONTENT_DISPOSITION,
                "attachment; filename=\"" + employe.getNameFile() + "\"")
        		.body(new ByteArrayResource(employe.getPhoto()));
    }
	
	@RequestMapping(value="/addem", method=RequestMethod.POST
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
