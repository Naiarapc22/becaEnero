package edu.es.eoi.service;

import edu.es.eoi.entity.Recipe;

public interface PublishService {

	public Recipe publishRecipe();

	public void shareRecipe(Recipe recipe);

	public void valorateRecipe(Recipe recipe, Double valoration);

}
