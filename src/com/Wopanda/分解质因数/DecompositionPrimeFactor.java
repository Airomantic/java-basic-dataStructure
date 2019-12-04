package com.Wopanda.分解质因数;

import java.util.Scanner;

/**
 * @program: 基础算法
 * @description: 题目：将一个正整数分解质因数。例如：输入90,打印出90=233*5。   
 * 程序分析：对n进行分解质因数，应先找到一个最小的质数k，然后按下述步骤完成：   
 *
 * (1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。   
 * (2)如果n <> k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数你n,重复执行第一步。  
 * (3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步。
 *
 * @author: jiangzq
 * @create: 2019-11-05 12:32
 **/
public class DecompositionPrimeFactor {//如：18=2*3*3；147=3*7*7；34=2*7
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = 2;
        while (n >= k) {
            if (n == k) {
                System.out.println(k);
                break;
            } else if (n % k == 0) {
                System.out.println(k);
                n = n / k;
            } else {
                k++;
            }
        }
    }
}
