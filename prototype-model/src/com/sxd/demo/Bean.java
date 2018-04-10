package com.sxd.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shixiaodong
 * @date 2018/4/10 22:17
 */


public class Bean implements Cloneable {

    private String name = "sxd";

    private InnerClass innerClass = new InnerClass();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bean getClone() {
        Bean bean = null;
        try {
            bean = (Bean)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return bean;
    }

    public InnerClass getInnerClass() {
        return innerClass;
    }

    public void setInnerClass(InnerClass innerClass) {
        this.innerClass = innerClass;
    }
}
