package com.sxd.demo;

/**
 * @author Shixiaodong
 * @date 2018/4/3 23:21
 */
public interface Iterator {
    //判断是否还有下一个元素
    public abstract boolean hasNext();
    //返回当前元素，且指针指向下一个元素
    public abstract Object next();
}
