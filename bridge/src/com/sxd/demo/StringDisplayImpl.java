package com.sxd.demo;

/**
 * @author Shixiaodong
 * @date 2018/4/13 23:28
 */

/*
* 类的实现层次，通过继承父类实现其抽象方法，类的实现层次结构
* */
public class StringDisplayImpl extends DisplayImpl {

    private String string;

    private int width;

    public StringDisplayImpl(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine() {
        System.out.println("---line---");
    }

}
