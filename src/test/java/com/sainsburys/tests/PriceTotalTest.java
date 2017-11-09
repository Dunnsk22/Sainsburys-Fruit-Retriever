package com.sainsburys.tests;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sainsburys.test.model.FreshFruit;
import com.sainsburys.test.model.FreshFruits;

public class PriceTotalTest {

	List<FreshFruit> productsList = new ArrayList<FreshFruit>();

	@Test
	@Parameters({"pineapplePrice", "applePrice"})
	public void jsonResponseShouldContainCorrectTotal( double pineapplePrice, double applePrice ) {
		FreshFruit pineapple = new FreshFruit("34", pineapplePrice ,"Pineapple", "Succulent Pineapples ready to eat.");
		FreshFruit apple = new FreshFruit("34", applePrice ,"Apple", "Succulent Apples ready to eat.");
		productsList.add(pineapple);
		productsList.add(apple);
		FreshFruits fruits = new FreshFruits(productsList);
		Assert.assertEquals(3.30, fruits.calculateTotalPriceOfItems());
		System.out.println("****** Price Total Test ******* \n");
		System.out.println(fruits.buildJsonResponse());

	}
	
}
