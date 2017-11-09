package com.sainsburys.test.dom.retrievers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.w3c.dom.DOMException;

import com.sainsburys.test.model.FreshFruit;
import com.sainsburys.test.model.FreshFruits;

public class SainsburysDocumentModelRetriever implements DocumentModelRetriever {

    private String productsUri;
    private final String baseUrl = "https://jsainsburyplc.github.io/serverside-test/site/www.sainsburys.co.uk";

    public SainsburysDocumentModelRetriever(String productsUri) {
        this.productsUri = productsUri;
    }

    public FreshFruits retrieveProductsFromDocument() throws Exception {
        List<FreshFruit> products = new ArrayList<FreshFruit>();
        try {
            Document productsDocument = Jsoup.connect(productsUri).get();
            Elements productLinkElements = productsDocument.select(".product h3 a");

            for (Element productLinkElement : productLinkElements) {
                String productUri = productLinkElement.attr("href");
                String newUrl = productUri.replace(productUri.substring(0, 17), baseUrl);
                FreshFruit product = retrieveProductFromDocument(newUrl);
                products.add(product);
            }
            return new FreshFruits(products);
        } catch(IOException e) {
            throw new IOException(e);
        }
    }

    public FreshFruit retrieveProductFromDocument(String product) throws Exception {
        try {
            Document productDocument = connectToDocumentAndRetrieveHTML(product);
            return new FreshFruit(productDocument);
        } catch(Exception ex) {
            throw new Exception(ex);
        }
    }
    
    public Document connectToDocumentAndRetrieveHTML( String htmlPageSource ) throws DOMException, IOException {
    	Document sainsburysDocument = Jsoup.connect(htmlPageSource).get();
    	return sainsburysDocument;
    }
}
