package com.sxd.demo;

/**
 * @author Shixiaodong
 * @date 2018/4/9 22:44
 */
public abstract class Factory {

    //工厂类对外开放的接口，且不允许子类重载
    public final Product create(String owner) {
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }

    //抽象方法的具体细节由子类负责实现，和Template Method类似
    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product product);
}
