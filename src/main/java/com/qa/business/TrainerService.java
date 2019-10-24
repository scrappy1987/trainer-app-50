package com.qa.business;

import org.springframework.stereotype.Service;

import com.qa.persistence.domain.Trainer;

@Service
public class TrainerService {

	public Trainer getAllTrainers() {

		return new Trainer("Jim", "Gordon");
	}

	public Trainer addNewTrainer() {
		return new Trainer("Jim", "Gordon");
	}

	public Trainer updateTrainer() {
		return new Trainer("Jim", "Gordon");
	}

	public Trainer deleteTrainer() {
		return new Trainer("Jim", "Gordon");
	}
}
