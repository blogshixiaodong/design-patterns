package com.sxd;

/**
 * @author Shixiaodong
 * @date 2018/4/3 0:30
 */

/*
 * 双重校验锁--jdk1.5
 * */
public class Singleton6 {
    private volatile static Singleton6 singleton = null;

    private Singleton6() {
        System.out.println("无法直接实例化对象");
    }

    public static Singleton6 getInstance() {
        if(singleton == null) {
            synchronized(Singleton6.class) {
                if(singleton == null) {
                    singleton = new Singleton6();
                }
            }
        }
        return singleton;
    }

}
