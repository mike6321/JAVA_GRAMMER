package me.choi.baekjunlecture.class01;

import java.util.Scanner;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 10:22 오후
 */
public class B2741 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N  = scanner.nextInt();

        int i = 1;
        while (N > 0) {
            System.out.println(i);
            N--;
            i++;
        }
    }
}
