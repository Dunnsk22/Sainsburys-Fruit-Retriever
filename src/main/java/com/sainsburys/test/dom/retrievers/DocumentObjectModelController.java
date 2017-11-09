package com.sainsburys.test.dom.retrievers;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


/*
 * This class is purposely for controlling the Document Model and finding the relevant data
 * 
 * {Calories, Title, Description and Price}
 * 
 */

public class DocumentObjectModelController {
	
	
	/**
	 * @param productElement
	 * @return
	 * @throws ProductParseException
	 */
	public static String getTitleFromDocument(Document productElement) throws Exception {
		Element titleElement = productElement.select("h1").get(0);
		if (titleElement == null) {
			throw new Exception("The title for the item cannot be found...");
		}
			return titleElement.text();
	}

	public static double getItemPriceFromDocument(Document productElement) throws Exception {
		Element itemPrice = productElement.select(".pricePerUnit").get(0);
		if (itemPrice == null) {
			throw new Exception("The price for the item cannot be found...");
		} 
			String priceOfItem = itemPrice.text().replace("£", "").replace("/unit", "");
			return new Double(priceOfItem);
	}

	public static String getItemCaloriesFromDocument(Document kCalElement) throws Exception {
		String calories = kCalElement.select(".tableWrapper").select("tr").select(".tableRow0").select("td").text();
		if (calories == null) {
			throw new Exception("The Calories cannot be found for the item...");
		}
		return calories = calories.substring(0,calories.indexOf(" ")+1).replace("kcal", " calories");
	}

	public static String getItemDescriptionFromDocument(Document productElement) throws Exception {
		Element titleElement = productElement.select(".productText").first();
		if (titleElement == null) {
			throw new Exception("Cannot get description for the item...");
		} 
		return titleElement.text();
	}

}
