package com.p5.adoptions.service;

import com.p5.adoptions.repository.shelters.AnimalShelterRepository;
import org.springframework.stereotype.Service;

@Service
public class AnimalShelterService {

    private final AnimalShelterRepository animalShelterRepository;

    public AnimalShelterService(AnimalShelterRepository animalShelterRepository) {
        this.animalShelterRepository = animalShelterRepository;
    }
}
