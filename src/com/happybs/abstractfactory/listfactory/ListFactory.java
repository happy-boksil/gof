package com.happybs.abstractfactory.listfactory;

import com.happybs.abstractfactory.factory.Factory;
import com.happybs.abstractfactory.factory.Link;
import com.happybs.abstractfactory.factory.Page;
import com.happybs.abstractfactory.factory.Tray;

public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title,author);
    }
}
