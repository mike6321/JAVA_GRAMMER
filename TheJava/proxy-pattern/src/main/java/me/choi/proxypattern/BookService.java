package me.choi.proxypattern;

/**
 * Project : proxy-pattern
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 8:04 오후
 */
public interface BookService {

    void rent(Book book);

    void returnRent(Book book);

}
