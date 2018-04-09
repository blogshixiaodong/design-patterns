package com.sxd.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shixiaodong
 * @date 2018/4/9 22:48
 */
public class IDCardFactory extends Factory {

    private List<String> ownersList = new ArrayList<String>();

    //实现父类的抽象方法
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println("register " + ((IDCard) product).getOwner() + "'s IDCard");
        ownersList.add(((IDCard)product).getOwner());
    }

    //子类自定义方法
    public List<String> getOwnersList() {
        return ownersList;
    }

}
