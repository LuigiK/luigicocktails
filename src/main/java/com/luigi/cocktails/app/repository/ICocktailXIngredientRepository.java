package com.luigi.cocktails.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luigi.cocktails.app.model.TCocktailXIngredient;

public interface ICocktailXIngredientRepository extends JpaRepository<TCocktailXIngredient, Long> {

}