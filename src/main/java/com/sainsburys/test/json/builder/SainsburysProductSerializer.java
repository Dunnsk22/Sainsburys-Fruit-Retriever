package com.sainsburys.test.json.builder;

import com.google.gson.*;
import com.sainsburys.test.model.FreshFruit;
import com.sainsburys.test.model.FreshFruits;

import java.lang.reflect.Type;
import java.math.BigDecimal;

/**
 * Serializes a FreshFruitProduct to be displayed in the console.
 */
public class SainsburysProductSerializer implements JsonSerializer<FreshFruit> {

    public JsonElement serialize(FreshFruit product, Type type, JsonSerializationContext context) {
        JsonObject jsonBuilder = new JsonObject();
        jsonBuilder.addProperty("item-name", product.getSainsburysItemTitle());
        jsonBuilder.addProperty("details", product.getSainsburysItemDescription());
        jsonBuilder.addProperty("price", product.getSainsburysItemPrice());
        jsonBuilder.addProperty("calories", product.getCalories());
        return jsonBuilder;
    }
    
//    public JsonElement serialize(final FreshFruits freshFruits, final Type type, final JsonSerializationContext context) {
//        final JsonObject jsonObject = new JsonObject();
//        jsonObject.add("results", context.serialize(freshFruits.getFreshFruits()));
//        jsonObject.addProperty("total", freshFruits.calculateTotalPriceOfItems());
//        return jsonObject;
//    }

}
