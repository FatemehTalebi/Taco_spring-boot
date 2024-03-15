package com.technophaa.taco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.technophaa.taco.model.Ingredient;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, String>{

}
