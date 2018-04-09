package com.sxd.demo;

/**
 * @author Shixiaodong
 * @date 2018/4/9 22:46
 */
public class IDCard extends Product {

    private String owner;

    IDCard(String owner) {
        System.out.println("make " + owner + "'s IDCard.");
        this.owner = owner;
    }


    @Override
    public void use() {
        System.out.println("use " + owner + "'s IDCard.");
    }

    public String getOwner() {
        return owner;
    }
}
