package com.technophaa.taco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technophaa.taco.model.Ingredient;
import com.technophaa.taco.repository.IngredientRepository;
@Service
public class IngredientService {
	
	@Autowired
	private IngredientRepository ingredientRepository;

	public IngredientService(IngredientRepository ingredientRepository) {
		super();
		this.ingredientRepository = ingredientRepository;
	}
	
	public List<Ingredient> getAllIngredients(){
		return ingredientRepository.findAll();
	}
	

}
