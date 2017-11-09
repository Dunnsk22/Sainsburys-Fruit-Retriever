package com.sainsburys.test.dom.retrievers;

import java.io.IOException;

import org.jsoup.nodes.Document;
import org.w3c.dom.DOMException;

import com.sainsburys.test.model.FreshFruit;
import com.sainsburys.test.model.FreshFruits;

public interface DocumentModelRetriever {
	
	Document connectToDocumentAndRetrieveHTML( String document ) throws DOMException, IOException;
   
	FreshFruit retrieveProductFromDocument( String document ) throws Exception;
	
	FreshFruits retrieveProductsFromDocument(  ) throws Exception;
}
