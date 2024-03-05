package com.example.PetManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.PetManagementSystem.Model.Pet;


public interface PetRepository extends JpaRepository<Pet, Long> {
	
}



