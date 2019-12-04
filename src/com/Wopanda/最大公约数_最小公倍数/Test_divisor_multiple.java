package com.Wopanda.最大公约数_最小公倍数;

import java.util.Scanner;

/**
 * @program: 基础算法
 * @description:
 * @author: jiangzq
 * @create: 2019-11-28 16:18
 **/
public class Test_divisor_multiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        Test_divisor_multiple divisor_multiple = new Test_divisor_multiple();
        int i = divisor_multiple.divisor(a,b);
        System.out.println("最大公约数："+i);
        System.out.println("最小公倍数："+a*b/i);
    }

    private int divisor(int a, int b) {
        if (a < b) {
            int t = b;
            b = a;
            a = t;
        }
        while (b != 0) {
            if (a == b)
                return a;
                    int x = b;
                    b = a % b;//a>b
                    a = x;
        }
        return a;
    }
}
