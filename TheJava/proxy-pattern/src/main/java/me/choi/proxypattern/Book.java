package me.choi.proxypattern;

/**
 * Project : proxy-pattern
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 8:03 오후
 */
public class Book {

    private final String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
