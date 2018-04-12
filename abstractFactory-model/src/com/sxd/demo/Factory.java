package com.sxd.demo;

/**
 * @author Shixiaodong
 * @date 2018/4/12 22:27
 */

/*
* 通过实例化Factory的具体的工厂，由该工厂实例化所需要的相应的类
* */
public abstract class Factory {

    public static Factory getFactory(String factoryName) {
        Factory factory = null;
        try {
            factory = (Factory)Class.forName(factoryName).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }

    public abstract Link createLink(String caption, String url);

    public abstract Tray createTray(String caption);

}
