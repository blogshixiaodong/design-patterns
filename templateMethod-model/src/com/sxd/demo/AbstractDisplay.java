package com.sxd.demo;

/**
 * @author Shixiaodong
 * @date 2018/4/8 23:13
 */
public abstract class AbstractDisplay {

    //抽象的方法具体细节由子类来实现
    public abstract void open();

    public abstract void print();

    public abstract void close();

    //final不可以被子类重载
    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }

}
