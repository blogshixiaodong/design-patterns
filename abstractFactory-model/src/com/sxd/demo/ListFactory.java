package com.sxd.demo;

/**
 * @author Shixiaodong
 * @date 2018/4/12 22:32
 */

/*
* 负责返回Link和Tray的具体的实现类
* */
public class ListFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }
}
