package com.tnsif.PlacementService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.NoResultException;
@RestController
public class PlacementController {
	@Autowired
   private PlacementService Service;
	 @GetMapping("/PlacementService")
	   public List <Placement> list(){
		   return Service.listAll();
	   }
		
			@PostMapping("/PlacementService")
			public void add (@RequestBody Placement place) {
				Service.save(place);
			
			}
			 @GetMapping("/PlacementService/{id}")
			public ResponseEntity<Placement> get(@PathVariable Integer id)
			 {
				 
				try {
					 Placement P = Service.get(id);
					 return new ResponseEntity<Placement>(P,HttpStatus.OK);
				}
				catch(NoResultException e)
				{
					return new ResponseEntity<Placement>(HttpStatus.NOT_FOUND);
				}
			 }
			@DeleteMapping("/PlacementService/{id}")
             public void delete(@PathVariable Integer id)	
             {
				Service.delete(id);
             
				}
			 
			 }
     
	   


