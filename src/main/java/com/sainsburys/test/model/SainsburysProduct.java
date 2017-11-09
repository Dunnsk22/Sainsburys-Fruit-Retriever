package com.sainsburys.test.model;

import org.jsoup.nodes.Document;

import com.sainsburys.test.dom.retrievers.DocumentObjectModelController;

/**
 * @author Joshua Dunn
 * 
 * Super class that sits at the top of the Product Hierarchy. All Sainsburys
 * products havea title, price and description.
 */
public class SainsburysProduct {
	
	protected String sainsburysItemTitle;
	protected double sainsburysItemPrice;
	protected String sainsburysItemDescription;
	
	public SainsburysProduct( ) {}

	/**
	 * @param sainsburysItemDescription - Contains the description of an individual item
	 * @param sainsburysItemTitle - Contains the title of an individual item
	 * @param sainsburysItemPrice - Contains the price of an individual item
	 */
	public SainsburysProduct(String sainsburysItemDescription, String sainsburysItemTitle, double sainsburysItemPrice) {
		this.sainsburysItemDescription = sainsburysItemDescription;
		this.sainsburysItemPrice = sainsburysItemPrice;
		this.sainsburysItemTitle = sainsburysItemTitle;
	}
	

	// Constructor Overload/Underload
	public SainsburysProduct( Document sainsburysDocument ) throws Exception {
		sainsburysItemTitle = DocumentObjectModelController.getTitleFromDocument(sainsburysDocument);
		sainsburysItemPrice = DocumentObjectModelController.getItemPriceFromDocument(sainsburysDocument);
		sainsburysItemDescription = DocumentObjectModelController.getItemDescriptionFromDocument(sainsburysDocument);
	}
	
	/**
	 * @return the sainsburysItemTitle
	 */
	public String getSainsburysItemTitle() {
		return sainsburysItemTitle;
	}
	/**
	 * @param sainsburysItemTitle the sainsburysItemTitle to set
	 */
	public void setSainsburysItemTitle(String sainsburysItemTitle) {
		this.sainsburysItemTitle = sainsburysItemTitle;
	}
	/**
	 * @return the sainsburysItemPrice
	 */
	public double getSainsburysItemPrice() {
		return sainsburysItemPrice;
	}
	/**
	 * @param sainsburysItemPrice the sainsburysItemPrice to set
	 */
	public void setSainsburysItemPrice(double sainsburysItemPrice) {
		this.sainsburysItemPrice = sainsburysItemPrice;
	}
	/**
	 * @return the itemDescription
	 */
	public String getSainsburysItemDescription() {
		return sainsburysItemDescription;
	}
	/**
	 * @param itemDescription the itemDescription to set
	 */
	public void setSainsburysItemDescription(String sainsburysItemDescription) {
		this.sainsburysItemDescription = sainsburysItemDescription;
	}

}
