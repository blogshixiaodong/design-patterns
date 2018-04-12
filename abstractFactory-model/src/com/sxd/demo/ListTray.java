package com.sxd.demo;

/**
 * @author Shixiaodong
 * @date 2018/4/12 22:35
 */
public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        return "<div>" + tray.toString() + "</div>";
    }
}
