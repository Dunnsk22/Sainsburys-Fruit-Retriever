package com.sainsburys.test.json.builder;

import com.google.gson.*;
import com.sainsburys.test.model.FreshFruit;

import java.lang.reflect.Type;
import java.math.BigDecimal;

/**
 * Serializes a FreshFruitProduct
 */
public class SainsburysProduct implements JsonSerializer<FreshFruit> {

    public JsonElement serialize(FreshFruit product, Type type, JsonSerializationContext context) {
        final JsonObject jsonBuilder = new JsonObject();
        jsonBuilder.addProperty("item-name", product.getSainsburysItemTitle());
        jsonBuilder.addProperty("details", product.getSainsburysItemDescription());
        jsonBuilder.addProperty("price", product.getSainsburysItemPrice());
        jsonBuilder.addProperty("calories", product.getCalories());
        return jsonBuilder;
    }

}
