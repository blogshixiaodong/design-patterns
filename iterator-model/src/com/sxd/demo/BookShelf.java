package com.sxd.demo;

/**
 * @author Shixiaodong
 * @date 2018/4/3 23:27
 */
public class BookShelf implements Aggregate {
    private Book[] books;
    private int last = 0;

    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        books[last] = book;
        last++;
    }

    public int getBookCount() {
        return last;
    }

    @Override
    public Iterator iteraor() {
        return new BookShelfIterator(this);
    }
}
