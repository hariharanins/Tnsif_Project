package com.tnsif.PlacementService;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional

public class PlacementService {
	@Autowired
	private PlacementRepository repo;
	//to insert the record
	public void InsertRecord(Placement place){
		 repo.save(place);
		
	}
		
		
	
	
	
 
	
	
}
