package com.Wopanda.冒泡排序_优化;

import java.util.Arrays;

/**
 * @program: 基础算法
 * @description: 冒泡—鸡尾酒排序,鸡尾酒需要调酒，倒过来倒过去，像钟摆一样
 * @author: jiangzq
 * @create: 2019-12-01 20:59
 **/
public class bubble_sort_Cocktail {
    public static void main(String[] args) {
        int[] array = new int[]{3, 5, 9, 0, 2, 7, 2, 8, 6};
        cocktail_sort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void cocktail_sort(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length/2; i++) {
            //有序标记，每一轮的初始值都是true
            boolean isSorted = true;
            for (int j = i; j < array.length - 1-i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    //有元素交换，所以不是有序的，标记变为false
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
            //在偶数轮之前，将isSorted重新标记为true
            isSorted = true;
            //偶数轮，从右向左比较和交换
            for (int j = array.length - 1 - i; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    //因为有元素进行交换，所以不是有序的，标记变为false
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
    }
}
