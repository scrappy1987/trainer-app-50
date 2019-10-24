package com.qa.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.business.TrainerService;
import com.qa.persistence.domain.Trainer;

@RestController
@RequestMapping("/trainerapp")
public class TrainerController {
	
	@Autowired
	private TrainerService service;
	
	@GetMapping(value = "trainer")
	public Trainer getAllTrainers(){
		
		return service.getAllTrainers();
	}
	 
	@PostMapping(value = "trainer")
	public Trainer addNewTrainer() {
		return service.addNewTrainer();
	}
	
	@PutMapping(value = "trainer")
	public Trainer updateTrainer() {
		return service.updateTrainer();
	}
	
	@DeleteMapping(value = "trainer")
	public Trainer deleteTrainer() {
		return service.deleteTrainer();
	}
}
