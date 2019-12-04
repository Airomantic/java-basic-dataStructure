package com.Wopanda.快速排序_单边循环;

import java.util.Arrays;

/**
 * @program: 基础算法
 * @description: 单边循环
 * @author: jiangzq
 * @create: 2019-12-02 09:04
 **/
public class Unilateral_quickSort {
    public static void main(String[] args) {
        int[] array = new int[]{3, 9, 4, 5, 7, 8, 6, 1, 0};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(int[] array, int startIndex, int endIndex) {
        //递归条件结束时：startIndex 大于或等于 endIndex
        if (startIndex >= endIndex) {
            return;
        }
        //得到基准元素
        int pivotIndex = partition(array, startIndex, endIndex);
        //根据基准元素，分成两部分进行递归排序
        quickSort(array, startIndex, pivotIndex-1);
        quickSort(array,pivotIndex+1,endIndex);
    }

    private static int partition(int[] array, int startIndex, int endIndex) {
        //取第1个位置（也可以选择随机位置）的元素作为基准元素
        int pivot = array[startIndex];
        int mark = startIndex;

        for (int i = startIndex + 1; i <= endIndex; i++) {
            if (array[i] < pivot) {
                mark++;
                int p = array[mark];
                array[mark] = array[i];
                array[i] = p;
            }
        }
        array[startIndex] = array[mark];
        array[mark] = pivot;//一轮过后，mark指向的元素和基准元素交换成为新的基准数
        return mark;
    }
}
