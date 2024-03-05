package com.example.PetManagementSystem.Service;

import java.util.List;

import com.example.PetManagementSystem.Model.Pet;

//public class PetService { 
public interface PetService {
	
	    List<Pet> getAllPets();
	    Pet getPetById(Long id);
	    Pet saveOrUpdatePet(Pet pet);
	    void deletePet(Long id);
	    
	}



    

  
