package com.sxd.demo;

/**
 * @author Shixiaodong
 * @date 2018/4/10 21:43
 */

/*
* 只有实现标记接口Cloneable才能clone，此时的clone是浅复制，深复制需要重载clone方法
* 且Object是没有实现Cloneable接口的
* */
public interface Product extends Cloneable {

    public abstract void use(String s);

    public abstract Product createClone();

}
