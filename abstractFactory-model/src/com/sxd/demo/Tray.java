package com.sxd.demo;

import java.util.ArrayList;

/**
 * @author Shixiaodong
 * @date 2018/4/12 22:23
 */
public abstract class Tray extends Item {

    protected ArrayList tray = new ArrayList();

    public Tray(String caption) {
        super(caption);
    }

    public void add(String item) {
        tray.add(item);
    }

}
