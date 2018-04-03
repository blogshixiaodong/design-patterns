package com.sxd;

/**
 * @author Shixiaodong
 * @date 2018/4/2 23:46
 */

/*
 * 饿汉式
 * 避免多线程的问题，在类被装载时就实例化对象
 * */
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("无法直接new对象");
    }

    public static Singleton getInstance() {
        return singleton;
    }

}
