package me.choi.proxypattern;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Project : proxy-pattern
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 8:05 오후
 */
public class BookServiceTest {

    //BookService bookService = new BookRealSubject();
    //BookService bookService = new BookProxy3(new BookRealSubject());
    BookService bookService = (BookService) Proxy.newProxyInstance(BookService.class.getClassLoader(), new Class[]{BookService.class}, new InvocationHandler() {

        BookService bookService = new BookRealSubject();

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

            if (method.getName() == "rent") {
                System.out.println("###############################");
                Object invoke = method.invoke(bookService, args);
                System.out.println("###############################");

                return invoke;
            }
            System.out.println("****************************");
            Object invoke = method.invoke(bookService, args);
            System.out.println("****************************");

            return invoke;


        }


    });

    @Test
    public void di() {
        Book book = new Book("Effective Java");

        System.out.println();
        bookService.rent(book);
        System.out.println();
        bookService.returnRent(book);
    }
}