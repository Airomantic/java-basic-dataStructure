package com.Wopanda.盛最多水的容器;

/**
 * @program: 基础算法
 * @description:
 * @author: jiangzq
 * @create: 2019-12-04 11:18
 **/
public class Solution_capacity {

    public int maxCapacity(int[] height) {
        int i = 0, j = height.length - 1, result = 0;
        while (i < j) {
            //如果左边的高度比右边的高度低，height[i] < height[j]正确，取“：”前面的式子，则i++继续往右（后）移动
            //如果左边的高度比右边的高度高，height[i] < height[j]错误，取“：”后面的式子，则j--继续往左（前）移动
            result = height[i] < height[j] ? Math.max(result, (j - i) * height[i++]) : Math.max(result, (j - i) * height[j--]);
        }
        return result;
    }
}
