package com.happybs.prototype;

import com.happybs.prototype.framework.Product;

public class ConcreteProduct implements Product {

    @Override
    public void use(String s) {

    }

    @Override
    public Product createClone() {
        return null;
    }
}
