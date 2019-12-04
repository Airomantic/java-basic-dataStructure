package com.Wopanda.无重复数字组合;

/**
 * @program: 基础算法
 * @description: 有1、2、3、4四个数字，能组成多少个互不相同且一个数字中无重复数字的三位数？
 * @author: jiangzq
 * @create: 2019-11-28 17:06
 **/
public class Test_noRepeat_combination {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                for (int m = 1; m < 5; m++) {
                    if (i != j && j != m && i != m) {
                        count++;
                        System.out.println(i*100+j*10+m);
                    }
                }
            }
        }
        System.out.println("共有="+count);
    }
}
