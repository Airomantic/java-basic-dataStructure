package com.Wopanda.完数;

/**
 * @program: 基础算法
 * @description: 一个数如果恰好等于它的因子之和，这个数就称为 "完数 "。例如6=1＋2＋3
 *                找出1000以内所有的数
 *                result =
 *                    完数：6
 *                    完数：28
 *                    完数：496
 * @author: jiangzq
 * @create: 2019-11-28 17:17
 **/
public class Test_PerfectNumber {

    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            int t=0;//t的声明只能放在在这个位置
            for (int j = 1; j <=i / 2; j++) {
                if (i % j == 0) {
                    t += j;
                }
            }
            //注意：放在第一个for循环里面
            if (i == t) {
                System.out.println("完数："+i);
            }
        }
    }
}
