package com.qa.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.persistence.domain.Trainer;
import com.qa.persistence.repository.TrainerRepository;

@Service
public class TrainerService {

	@Autowired
	private TrainerRepository repository;
	
	public List<Trainer> getAllTrainers() {
		return repository.findAll();
	}

	public Trainer addNewTrainer(Trainer trainer) {
		return repository.save(trainer);
	}

	public Trainer updateTrainer(Trainer trainer) {
		return repository.save(trainer);
	}

	public String deleteTrainer(Long trainerId) {
		repository.deleteById(trainerId);
		return "succesfully deleted";
	}
}
