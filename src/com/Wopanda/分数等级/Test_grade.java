package com.Wopanda.分数等级;

import java.util.Scanner;

/**
 * @program: 基础算法
 * @description:
 *      result =
 *       75
 *        B
 * @author: jiangzq
 * @create: 2019-11-28 16:13
 **/
public class Test_grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        String grade = score >= 90 ? "A" : score >= 60 ? "B" : "C";
        System.out.println(grade);
    }
}
