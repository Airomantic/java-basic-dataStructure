package com.Wopanda.字母_数字_空格_其它字符_统计;

import java.util.Scanner;

/**
 * @program: 基础算法
 * @description:
 *     result =
 *        jefwjlsdkv 544687465132  54634jfdksjk
 *        字母数=17
 *         数字个数=17
 *         空格个数=3
 *        其它字符个数=0
 * @author: jiangzq
 * @create: 2019-11-28 16:45
 **/
public class Test_alphabet_number_space_other {
    public static void main(String[] args) {
        int alphabet_count = 0;
        int number_count = 0;
        int space_count = 0;
        int other_count = 0;
        Scanner input = new Scanner(System.in);
        String toString = input.nextLine();
        char[] c = toString.toCharArray();

        for (int i = 0; i < c.length; i++) {
            if (Character.isLetter(c[i])) {
                alphabet_count++;
            } else if (Character.isDigit(c[i])) {
                number_count++;
            } else if (Character.isSpaceChar(c[i])) {
                space_count++;
            } else {
                other_count++;
            }
        }
        System.out.println("字母数=" + alphabet_count);
        System.out.println("数字个数=" + number_count);
        System.out.println("空格个数=" + space_count);
        System.out.println("其它字符个数=" + other_count);
    }
}
