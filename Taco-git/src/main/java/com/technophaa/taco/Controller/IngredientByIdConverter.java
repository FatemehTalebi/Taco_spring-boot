package com.technophaa.taco.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.technophaa.taco.model.Ingredient;
import com.technophaa.taco.repository.IngredientRepository;

@Component
public class IngredientByIdConverter implements Converter<String , Ingredient> {

	private IngredientRepository ingredientRepository;
	
	@Autowired
	public IngredientByIdConverter(IngredientRepository ingredientRepository) {
		super();
		this.ingredientRepository = ingredientRepository;
	}

	@Override
	public Ingredient convert(String id) {
		return ingredientRepository.findById(id).orElse(null);
	}
	

}
