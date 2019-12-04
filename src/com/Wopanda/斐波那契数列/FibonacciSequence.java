package com.Wopanda.斐波那契数列;

/**
 * @program: 基础算法
 * @description: 古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
 *                          假如兔子都不死，问每个月的兔子总数为多少？
 * @author: jiangzq
 * @create: 2019-11-05 10:44
 **/
public class FibonacciSequence {
    public static void main(String[] args) {
        int  f1=1,f2=2, f;
        int M = 30;
        /*System.out.println(1);//从第三个月算起，第一个月只生了一个，总数为3
        System.out.println(2);//第四个月->第二个月又生了一个，总数为4*/
        for (int i = 3; i < M; i++) {
            f = f2;
            f2 = f1 + f2;//生的加上父母
            f1 = f;//父母的数量赋给下一代
            System.out.println(f2);
        }
    }


}
