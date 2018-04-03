package com.sxd.demo;

/**
 * @author Shixiaodong
 * @date 2018/4/3 23:26
 */

/*
* 书的实体类
* */
public class Book {
    private String name;
    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
