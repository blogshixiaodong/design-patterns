package com.sxd.demo;

/**
 * @author Shixiaodong
 * @date 2018/4/3 23:37
 */
public class Main {

    public static void setBook(BookShelf bookShelf, int size) {
        for (int i = 0; i < size; i++) {
            Book book = new Book(System.currentTimeMillis() + "");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bookShelf.appendBook(book);
        }
    }

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(5);
        setBook(bookShelf, 5);
        Iterator iterator = bookShelf.iteraor();
        while (iterator.hasNext()) {
            Book book = (Book)iterator.next();
            System.out.println(book);
        }

    }
}
