package com.sxd.demo;

/**
 * @author Shixiaodong
 * @date 2018/4/12 22:21
 */
public abstract class Link extends Item {

    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }

}
