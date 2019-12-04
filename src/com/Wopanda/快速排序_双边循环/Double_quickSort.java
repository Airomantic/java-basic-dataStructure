package com.Wopanda.快速排序_双边循环;

import java.util.Arrays;

/**
 * @program: 基础算法
 * @description:
 * @author: jiangzq
 * @create: 2019-12-01 21:38
 **/
public class Double_quickSort {
    public static void main(String[] args) {
        int[] array = new int[]{4, 9, 2, 1, 5, 3, 7, 8};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    /**
     *  递归
     * @param array
     * @param startIndex
     * @param endIndex
     */
    private static void quickSort(int[] array, int startIndex, int endIndex) {
        //递归结束条件：startIndex <= endIndex
        if (startIndex >= endIndex) {
            return;
        }
        //得到基准元素位置
        int pivotIndex = partition(array, startIndex, endIndex);
        //根据基准元素，分成两部分进行递归排序
        quickSort(array,startIndex,pivotIndex-1);
        quickSort(array,startIndex+1,pivotIndex);
    }

    /**
     *  分治 双边循环法
     * @param array          待交换的数组
     * @param startIndex     起始下标
     * @param endIndex       结束下标
     * @return
     */
    private static int partition(int[] array, int startIndex, int endIndex) {
        //取第一个位置（也可以选择随机位置）的元素作为基准元素
        int pivot = array[startIndex];
        int left = startIndex;
        int right = endIndex;

        while (left != right) {
            //控制right指针比较并左移
            while (left < right && array[right] > pivot) {
                right--;//如果右指针是比基准元素大，则不交换，继续左移
            }
            //控制left指针比较并右移
            while (left < right && array[left] <= pivot) {
                left++;//同样满足左边的数比基准元素小（右边的数比基准元素大），则向右移
            }
            //交换left和right指针所指向的元素
            if (left < right) {
                int p = array[left];
                array[left] = array[right];
                array[right] = p;
            }
        }
        //pivot和指针重合点交换
        array[startIndex] = array[left];
        array[left] = pivot;

        return left;
    }
}
