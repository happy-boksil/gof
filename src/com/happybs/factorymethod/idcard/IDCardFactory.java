package com.happybs.factorymethod.idcard;

import com.happybs.factorymethod.framework.Factory;
import com.happybs.factorymethod.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {
    private List<IDCard> owners = new ArrayList();
    private int serial = 1;
    protected Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }
    protected void registerProduct(Product product) {
        owners.add((IDCard) product);
    }
    public List getOwners() {
        return owners;
    }

}
