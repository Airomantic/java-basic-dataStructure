package com.Wopanda.九九乘法;

/**
 * @program: 基础算法
 * @description:
 * @author: jiangzq
 * @create: 2019-11-29 09:24
 **/
public class Test_Mnemonics {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+"×"+j+"="+i*j);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
