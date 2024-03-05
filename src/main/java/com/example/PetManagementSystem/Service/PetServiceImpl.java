package com.example.PetManagementSystem.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PetManagementSystem.Model.Pet;
import com.example.PetManagementSystem.Repository.PetRepository;

import java.util.List;


@Service
public class PetServiceImpl {
	
	@Autowired
	 private PetRepository petRepository;

	 //@Override
	 public List<Pet> getAllPets() {
	     return petRepository.findAll();
	 }

	// @Override
	 public Pet getPetById(Long id) {
	     return petRepository.findById(id).orElse(null);
	 }

	// @Override
	 public Pet saveOrUpdatePet(Pet pet) {
	     return petRepository.save(pet);
	 }

	 //@Override
	 public void deletePet(Long id) {
	     petRepository.deleteById(id);
	 }
}
	












