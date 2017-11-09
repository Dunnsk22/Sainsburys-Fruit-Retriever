package com.sainsburys.test.runner;

import com.sainsburys.test.dom.retrievers.DocumentModelRetriever;
import com.sainsburys.test.dom.retrievers.SainsburysDocumentModelRetriever;
import com.sainsburys.test.model.FreshFruits;

public class ApplicationRunner {
	

	public static void main(String[] args) throws Exception {
		String url = "https://jsainsburyplc.github.io/serverside-test/site/www.sainsburys.co.uk/webapp/wcs/stores/servlet/gb/groceries/berries-cherries-currants6039.html";
		DocumentModelRetriever documentObjectModel = new SainsburysDocumentModelRetriever(url);
		FreshFruits fruits = documentObjectModel.retrieveProductsFromDocument();
		System.out.println(fruits.buildJsonResponse());
	}

}
