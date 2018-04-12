package com.sxd.demo;

/**
 * @author Shixiaodong
 * @date 2018/4/11 23:35
 */

/*
* 实现父类的抽象方法，通过这些每个单独的方法逐步构建buffer对象
* */

public class TextBuilder extends Builder {

    private StringBuffer buffer = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        buffer.append(title);
    }

    @Override
    public void makeString(String string) {
        buffer.append(string);
    }

    @Override
    public void makeItem(String item) {
        buffer.append(item);
    }

    @Override
    public void close() {
        System.out.println(buffer.toString());
    }
}
