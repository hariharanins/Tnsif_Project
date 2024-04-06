package com.tnsif.PlacementService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class PlacementController {
	@Autowired
   private PlacementService Service;
		
			@PostMapping("/PlacementService")
			public void add (@RequestBody Placement place) {
				Service.InsertRecord(place);
			
			
			}
		}
	   
   

