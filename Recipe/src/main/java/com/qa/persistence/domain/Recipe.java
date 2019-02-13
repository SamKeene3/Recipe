package com.qa.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Recipe {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	
	private String ingredient;
	private String title;

	public Recipe() {

	}

	public Recipe(String title, String ingredient) {
		this.title = title;
		this.ingredient = ingredient;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIngredient() {
		return ingredient;
	}

	public void setIngrediants(String ingredient) {
		this.ingredient = ingredient;
	}


}
