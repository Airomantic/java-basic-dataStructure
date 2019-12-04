package com.Wopanda.回文数;

import java.util.Scanner;

/**
 * @program: 基础算法
 * @description:
 * @author: jiangzq
 * @create: 2019-11-29 09:34
 **/
public class Test_Palindromic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(versa(number));
    }

    /**
     *  versa 反的
     * @param number
     * @return
     */
    private static boolean versa(int number) {
        if (number < 0 || (number != 0 && number % 10 == 0))
            return false;
        int versa = 0;
        while (number > versa) {
            versa = versa * 10 + number % 10;
            number = number / 10;
        }
        return (number == versa || number == versa / 10);
    }
}
