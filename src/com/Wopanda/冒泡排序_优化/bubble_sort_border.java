package com.Wopanda.冒泡排序_优化;

import java.util.Arrays;

/**
 * @program: 基础算法
 * @description:
 * @author: jiangzq
 * @create: 2019-12-01 17:33
 **/
public class bubble_sort_border {
    public static void main(String[] args) {
        int[] array = new int[]{5, 8, 6, 3, 9, 2, 1, 7};
        bubbleSort(array);
        System.out.print(Arrays.toString(array)+" ");
    }

    private static void bubbleSort(int[] array) {
        //记录最后一次交换的位置
        int lastExchangeIndex = 0;
        //无序数列的边界，每次比较只需要比到这里为止
        int sortBorder = array.length - 1;//取为新的数组范围
        for (int i = 0; i < array.length - 1; i++) {
            //有序标记，每一轮的初始值都是true
            boolean isSorted = true;
            for (int j = 0; j < sortBorder; j++) {
                int temp ;
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    //因为有元素进行交换，所以不是有序的，标记变为false
                    isSorted = false;
                    //更新为最后一次交换元素的位置
                    lastExchangeIndex = j;
                }
            }
            sortBorder = lastExchangeIndex;//最后一次交换的位置为数组新长度的范围
            if (isSorted) {
                break;
            }
        }
    }
}
