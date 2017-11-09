package com.sainsburys.test.json.builder;

import java.lang.reflect.Type;
import com.google.gson.*;
import com.sainsburys.test.model.FreshFruits;


/**
 * JSON serializer for multiple fruits
 */
public class SainsburysProductsSerializer implements JsonSerializer<FreshFruits> {

    public JsonElement serialize(final FreshFruits freshFruits, final Type type, final JsonSerializationContext context) {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.add("results", context.serialize(freshFruits.getFreshFruits()));
        jsonObject.addProperty("total", freshFruits.calculateTotalPriceOfItems());
        return jsonObject;
    }
}
