package com.sxd;

/**
 * @author Shixiaodong
 * @date 2018/4/3 0:23
 */

/*
* 静态内部类，懒汉式
* 静态内部类只有第一次被使用时才被装载，也就是第一次调用getInstance时才被装载
*
*
* */

public class Singleton5 {
    private static class SingletonHoler {
        private static final Singleton5 singleton = new Singleton5();
    }

    private Singleton5() {
        System.out.println("无法直接实例化对象");
    }

    public static final Singleton5 getInstance() {
        return SingletonHoler.singleton;
    }

}
