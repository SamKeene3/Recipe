package com.qa.business.service;

import javax.inject.Inject;

import com.qa.persistence.repository.RecipeRepo;
import org.apache.log4j.Logger;

public class RecipeImpl implements RecipeService {

	@Inject
	private RecipeRepo repo;

	public String getAllRecipe() {
		return repo.getAllRecipe();
	}

	@Override
	public String addRecipe(String recipe) {
		if (recipe.contains("Peanuts")) {

			return "Can't Add This as Allergic";
		}
		return repo.createRecipe(recipe);
	}

	@Override
	public String deleteRecipe(Long id) {
		return repo.deleteRecipe(id);
	}

	public void setRepo(RecipeRepo repo) {
		this.repo = repo;
	}

	@Override
	public int cycleRecipe(String title) {

		return repo.cycleRecipe(title);

	}

	@Override
	public String getARecipe(Long id) {
		return repo.getARecipe(id);

	}

	@Override
	public String updateRecipe(String recipe, Long id) {
		return repo.updateRecipe(recipe, id);
	}

	
}
