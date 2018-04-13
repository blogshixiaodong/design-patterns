package com.sxd.demo;

/**
 * @author Shixiaodong
 * @date 2018/4/13 23:12
 */

/*
* 负责显示的类
* */
public class Display {
    private DisplayImpl impl;

    public Display(DisplayImpl impl) {
        this.impl = impl;
    }

    public void open() {
        impl.rawOpen();
    }

    public void print() {
        impl.rawPrint();
    }

    public void close() {
        impl.rawClose();
    }

    public final void display() {
        open();
        print();
        close();
    }

}
