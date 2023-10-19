package com.java.app.urlLookup.service;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import java.util.List;
public class UrlService {
    //I use the BiMap by Google Guava, it already implements HashMap in a way that the value:key can be as key:key,and still maintain the HashMap proper of O(1).
    public static BiMap<String, String> urls = HashBiMap.create();
    BiMap<String, String> prettyUrls = HashBiMap.create();


    public void addUrl() {

        //Input data to populate for a test
        urls.put("/products", "/Fashion/");
        urls.put("/products?gender=female", "/Women/");
        urls.put("/products?tag=5678", "/Boat--Shoes/");
        urls.put("/products?brand=123", "/Adidas/");

    }

    public Object getPrettyUrl(List<String> inputUrls, boolean type) {
        String key = null;
        String value = null;
        if (type) {
            urls = urls.inverse();
        }
        for (String url : inputUrls) {
            if (urls.containsKey(url)) {
                key = url;
                value = urls.get(url);
                prettyUrls.put(key, value);
            } else {
                return inputUrls;
            }
        }
        return prettyUrls;
    }
}
