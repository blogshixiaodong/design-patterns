package com.sxd;

/**
 * @author Shixiaodong
 * @date 2018/4/3 0:02
 */

/*
 * 饿汉式
 * 在静态代码块中实例化对象，也是在类被装载时实例化对象
 * */
public class Singleton2 {
    private static Singleton2 singleton = null;
    static {
        singleton = new Singleton2();
    }

    private Singleton2() {
        System.out.println("无法直接实例化对象");
    }

    public static Singleton2 getInstance() {
        return singleton;
    }

}
