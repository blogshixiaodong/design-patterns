package com.sxd.demo;

import java.util.HashMap;

/**
 * @author Shixiaodong
 * @date 2018/4/10 21:54
 */
public class Manager {

    private HashMap<String, Object> showCase = new HashMap<>();

    public void register(String name, Product product) {
        showCase.put(name, product);
    }

    public Product create(String productName) {
        Product p = (Product)showCase.get(productName);
        return p.createClone();
    }

}
