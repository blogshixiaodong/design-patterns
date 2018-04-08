package com.sxd.demo;

/**
 * @author Shixiaodong
 * @date 2018/4/8 23:17
 */
public class StringDisplay extends AbstractDisplay {
    @Override
    public void open() {
        System.out.println("String is open.");
    }

    @Override
    public void print() {
        System.out.println("STRING");
    }

    @Override
    public void close() {
        System.out.println("String is close");
    }

}
