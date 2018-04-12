package com.sxd.demo;

/**
 * @author Shixiaodong
 * @date 2018/4/12 22:19
 */
public abstract class Item {

    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();

}
