package com.Wopanda.盛最多水的容器;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @program: 基础算法
 * @description:
 *         input = [2,4,1,9,3,8,2,1,4,7]
 *         result =
 *            42
 *         input = [1,8,6,2,5,4,8,3,7]
 *         result = 49
 * @author: jiangzq
 * @create: 2019-12-04 10:42
 **/
public class MaxCapacity {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] height = stringToIntegerArray(line);
            int ret = new Solution_capacity().maxCapacity(height);//注意这个类需要new进来，以保证构造否方法引入参数height变量
            String out = String.valueOf(ret);
            System.out.print(out);
        }
    }

    private static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }
        String[] parts = input.split(",");//去掉逗号后，parts是纯字符
        int[] output = new int[parts.length];//赋给output数组的size
        for (int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();//part为逐个修整过的单个字符
            output[index] = Integer.parseInt(part);//转换为整型在存入输出数组
        }
        return output;
    }
}
