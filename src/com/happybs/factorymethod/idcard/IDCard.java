package com.happybs.factorymethod.idcard;

import com.happybs.factorymethod.framework.Product;

public class IDCard extends Product {
    private String owner;
    private int serial;
    IDCard(String owner, int serial) {
        System.out.println(owner + "(" + serial + ")의 카드를 만듭니다.");
        this.owner = owner;
        this.serial = serial;
    }
    @Override
    public void use() {
        System.out.println(this.owner + "(" + this.serial + ")의 카드를 사용합니다.");
    }
    public String getOwner() {
        return owner;
    }
    public int getSerial() {
        return serial;
    }
}
