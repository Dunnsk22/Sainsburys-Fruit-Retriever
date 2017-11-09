package com.sainsburys.tests;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sainsburys.test.model.FreshFruit;
import com.sainsburys.test.model.FreshFruits;

public class JsonRetrieverTest {
	
	List<FreshFruit> productsList = new ArrayList<FreshFruit>();
	private final String APPLES_JSON_REPONSE = "{\"results\":[{\"item-name\":\"Sainsbury's Apples\",\"details\":\"by Sainsbury's apples\",\"price\":1.75,\"calories\":\"33\"}],\"total\":1.75}";
	
	@Test
	@Parameters({"calories", "price", "itemTitle", "itemDescription"})
	public void jsonResponseShouldContainAppleProductDetails( String calories, double price, String itemTitle, String itemDescription ) {
		FreshFruit appleProduct = new FreshFruit(calories, price, itemTitle, itemDescription);
		productsList.add(appleProduct);
		FreshFruits products = new FreshFruits(productsList);
		Assert.assertEquals(APPLES_JSON_REPONSE, products.buildJsonResponseForTest());
	}
	
	@Test
    public void testJsonContainsTotalField() {
        String json = gscraper.scrape();
        assertTrue(json.contains("total") && json.contains("results"));
    }
	
}