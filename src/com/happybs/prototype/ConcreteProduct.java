package com.happybs.prototype;

import com.happybs.prototype.framework.Product;

public class ConcreteProduct implements Product {

    @Override
    public void use(String s) {
        System.out.println("use called");
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product)clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
