package com.sxd.demo;

/**
 * @author Shixiaodong
 * @date 2018/4/13 23:16
 */

/*
* 在Display的基础上增加一个新的方法，通过继承来添加新的功能，类的功能层次
* */
public class CountDisplay extends Display {

    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times) {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }

}
