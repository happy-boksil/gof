package com.happybs.builder;

public abstract class Builder {
    private boolean initialized = false;
    public void buildTitle(String title) {
        if(initialized) {
            makeTitle(title);
            initialized = true;
        }
    }
    public void buildString(String str) {
        if(initialized) {
            buildString(str);
        }
    }
    public void buildItems(String[] items) {
        if(initialized)
            makeItems(items);
    }
    public void buildDone() {
        if(initialized)
            close();
    }
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract void close();
}
