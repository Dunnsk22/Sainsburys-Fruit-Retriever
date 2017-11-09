package com.sainsburys.test.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sainsburys.test.json.builder.SainsburysProduct;
import com.sainsburys.test.json.builder.SainsburysProductsSerializer;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.List;

public class FreshFruits {

    private List<FreshFruit> products;

    /**
     * Builds new FreshFruits product
     * @param products List of products
     */
    public FreshFruits(List<FreshFruit> products) {
        this.products = products;
    }

    public List<FreshFruit> getProducts() {
        return products;
    }
    
    public void setProducts(List<FreshFruit> products) {
    	this.products = products;
    }

    /**
     * @return totalPrice - returns the sum of all products
     */
    public Double calculateTotalPriceOfItems() {
        Double totalPrice = new Double(0);
        for(FreshFruit product : products) {
        	totalPrice += product.getSainsburysItemPrice();
            DecimalFormat decimalPoints = new DecimalFormat("#.##");
            totalPrice = Double.valueOf(decimalPoints.format(totalPrice));
        }
        return totalPrice;
    }

    /**
     * Builds up json response String which uses Serializers to format
     * @return builder String
     */
    public String buildJsonResponse() {
        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(FreshFruits.class, new SainsburysProductsSerializer());
        builder.registerTypeAdapter(FreshFruit.class, new SainsburysProduct());
        builder.setPrettyPrinting();
        builder.disableHtmlEscaping();
        Gson gson = builder.create();
        return gson.toJson(this);
    }
    
    public String buildJsonResponseForTest() {
        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(FreshFruits.class, new SainsburysProductsSerializer());
        builder.registerTypeAdapter(FreshFruit.class, new SainsburysProduct());
        builder.disableHtmlEscaping();
        Gson gson = builder.create();
        return gson.toJson(this);
    }
}
