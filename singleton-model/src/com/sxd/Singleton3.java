package com.sxd;

/**
 * @author Shixiaodong
 * @date 2018/4/3 0:08
 */

/*
* 懒汉式
* 线程不安全，在未前一个线程准备实例化前可能有一个线程立即进入判断
* */
public class Singleton3 {
    private static Singleton3 singleton = null;

    private Singleton3() {
        System.out.println("无法直接实例化对象");
    }

    public static Singleton3 getInstance() {
        if(singleton == null) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            singleton = new Singleton3();
        }
        return singleton;
    }

}
