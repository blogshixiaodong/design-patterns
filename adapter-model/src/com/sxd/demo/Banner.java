package com.sxd.demo;

/**
 * @author Shixiaodong
 * @date 2018/4/7 23:12
 */

/*
* 原始对象
* */

public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }

}
