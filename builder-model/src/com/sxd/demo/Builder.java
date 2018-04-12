package com.sxd.demo;

/**
 * @author Shixiaodong
 * @date 2018/4/11 23:12
 */

/*
* 最近几个设计模式看的似懂非懂的感觉，这个Builder模式由有点像Template Method
* 看来需要找几个实例来看看了
* */

public abstract class Builder {

    public abstract void makeTitle(String title);

    public abstract void makeString(String string);

    public abstract void makeItem(String item);

    public abstract void close();

}
