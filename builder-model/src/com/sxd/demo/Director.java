package com.sxd.demo;

/**
 * @author Shixiaodong
 * @date 2018/4/11 23:28
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /*
    * 感觉这个模式就是想避免参数的过多造成的混乱，
    * 然后把每个参数单独抽出来写一个方法
    * */
    public void construct() {
        builder.makeTitle("Title");
        builder.makeString("String");
        builder.makeItem("Item");
        builder.close();
    }

}
