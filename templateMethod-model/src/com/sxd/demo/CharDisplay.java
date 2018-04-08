package com.sxd.demo;

/**
 * @author Shixiaodong
 * @date 2018/4/8 23:15
 */
public class CharDisplay extends AbstractDisplay {
    @Override
    public void open() {
        System.out.println("CharDisplay is open.");
    }

    @Override
    public void print() {
        System.out.println("CHAR.");
    }

    @Override
    public void close() {
        System.out.println("CharDisplay is close.");
    }
}
