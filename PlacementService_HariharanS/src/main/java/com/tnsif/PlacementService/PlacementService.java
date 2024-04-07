package com.tnsif.PlacementService;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional

public class PlacementService {
	@Autowired
	private PlacementRepository repo;
	
	//get all the record from list
	public List<Placement> listAll(){
		return repo.findAll();
	}
	//save the record
	public void save(Placement place) {
		repo.save(place);
	}
	
	//to call or retrive  a specific record 
    public Placement get(Integer id) {
	return repo .findById(id).get();
    }
    // Deleting the particular record with id
    public void delete(Integer id)
    {
    	repo.deleteById(id);
    }
    
	
	
		
		
	
	
	
 
	
	
}
