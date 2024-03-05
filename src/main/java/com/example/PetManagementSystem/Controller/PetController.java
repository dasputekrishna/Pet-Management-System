package com.example.PetManagementSystem.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.PetManagementSystem.Model.Pet;
import com.example.PetManagementSystem.Service.PetService;

import java.util.List;


   
@RestController
@RequestMapping("/api/pets")
public class PetController {
	
	    @Autowired
	    private PetService petService;

	    @GetMapping
	    public List<Pet> getAllPets() {
	        return petService.getAllPets();
	    }

	    @GetMapping("/{id}")
	    public Pet getPetById(@PathVariable Long id) {
	        return petService.getPetById(id);
	    }

	    @PostMapping
	    public Pet addPet(@RequestBody Pet pet) {
	        return petService.saveOrUpdatePet(pet);
	    }

	    @PutMapping("/{id}")
	    public Pet updatePet(@PathVariable Long id, @RequestBody Pet pet) {
	        pet.setId(id); // Ensure the correct ID
	        return petService.saveOrUpdatePet(pet);
	    }

	    @DeleteMapping("/{id}")
	    public void deletePet(@PathVariable Long id) {
	        petService.deletePet(id);
	    }
	}



