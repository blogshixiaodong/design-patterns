package com.sxd;

/**
 * @author Shixiaodong
 * @date 2018/4/3 0:11
 */

/*
* 懒汉式
* 用同步锁锁定函数，线程安全
* */
public class Singleton4 {
    private static Singleton4 singleton = null;

    private Singleton4() {
        System.out.println("无法直接实例化对象");
    }

    public static synchronized Singleton4 getInstance() {
        if(singleton == null) {
            singleton = new Singleton4();
        }
        return singleton;
    }
}
