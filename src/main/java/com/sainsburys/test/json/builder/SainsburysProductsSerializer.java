package com.sainsburys.test.json.builder;

import java.lang.reflect.Type;
import com.google.gson.*;
import com.sainsburys.test.model.FreshFruits;


/**
 * JSON serializer for a collection of products, including the total unit price
 */
public class SainsburysProductsSerializer implements JsonSerializer<FreshFruits> {

    public JsonElement serialize(final FreshFruits products, final Type type, final JsonSerializationContext context) {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.add("results", context.serialize(products.getProducts()));
        jsonObject.addProperty("total", products.calculateTotalPriceOfItems());
        return jsonObject;
    }
}
