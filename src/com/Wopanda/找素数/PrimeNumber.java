package com.Wopanda.找素数;

/**
 * @program: 基础算法
 * @description: 判断101-200之间有多少个素数，并输出所有素数。
 * 程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除， 则表明此数不是素数，反之是素数。
 * @author: jiangzq
 * @create: 2019-11-05 12:19
 **/
public class PrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i < 200; i += 2) {
            boolean flag = true;
            for (int j = 2; j < Math.sqrt(i); j++) {//即i/j
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {//除不断的为素数
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);//记录共有多个素数（23）
    }
}
