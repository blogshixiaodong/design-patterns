package com.sxd.demo;

/**
 * @author Shixiaodong
 * @date 2018/4/12 22:34
 */
public class ListLink extends Link {

    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<div>Link</div>";
    }
}
