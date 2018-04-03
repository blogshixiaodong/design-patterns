package com.sxd.demo;

/**
 * @author Shixiaodong
 * @date 2018/4/3 23:21
 */

/*
* 需要遍历的集合的接口，实现该接口的类将成为一个可以保存多个元素的集合
* */
public interface Aggregate {

    //遍历集合的迭代器
    public abstract Iterator iteraor();
}
