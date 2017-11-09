package com.sainsburys.test.model;

import org.jsoup.nodes.Document;
import com.sainsburys.test.dom.retrievers.DocumentObjectModelController;

public class FreshFruit extends SainsburysProduct {

	private String calories;

	public FreshFruit( ) {}
	
	// Inherits from superclass -> SainsburysProduct
	public FreshFruit(String calories, double sainsburysItemPrice, String sainsburysItemDescription, String sainsburysItemTitle) {
		super(sainsburysItemTitle, sainsburysItemDescription, sainsburysItemPrice);
		this.calories = calories;
	}

	// Inherits from superclass -> SainsburysProduct
	public FreshFruit(Document sainsburysDocument) throws Exception {
		super(sainsburysDocument);
		calories = DocumentObjectModelController.getItemCaloriesFromDocument(sainsburysDocument);
	}

	/**
	 * @return the calories
	 */
	public String getCalories() {
		return calories;
	}

	/**
	 * @param calories the calories to set
	 */
	public void setCalories(String calories) {
		this.calories = calories;
	}	
	
}
