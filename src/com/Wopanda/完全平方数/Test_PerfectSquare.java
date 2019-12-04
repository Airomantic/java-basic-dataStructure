package com.Wopanda.完全平方数;

/**
 * @program: 基础算法
 * @description:
 * @author: jiangzq
 * @create: 2019-11-29 09:19
 **/
public class Test_PerfectSquare {
    public static void main(String[] args) {
        for (int i = -100; i < 10000; i++) {
            if (Math.sqrt(i + 100) % 1 == 0 && Math.sqrt(i + 268) % 1 == 0) {//保证开出了的数都为整数
                System.out.println(i);
            }
        }
    }
}
