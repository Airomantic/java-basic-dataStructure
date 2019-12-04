package com.Wopanda.递归求阶乘;

import java.util.Scanner;

/**
 * @program: 基础算法
 * @description:
 * @author: jiangzq
 * @create: 2019-11-29 09:29
 **/
public class Test_factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int in = Integer.parseInt(scanner.nextLine());
        System.out.println(factorial(in));
    }

    public static int factorial(int i) {
        if (i == 1) {
            return 1;
        } else {
            return i * factorial(i - 1);
        }
    }
}
