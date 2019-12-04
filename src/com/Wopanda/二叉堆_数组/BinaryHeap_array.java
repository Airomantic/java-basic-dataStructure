package com.Wopanda.二叉堆_数组;

import java.util.Arrays;

/**
 * @program: 基础算法
 * @description: 原层次遍历：{1, 3, 2, 6, 5, 7, 8, 9, 10, 0}
 *                                1
 *                  3                            2
 *            6           5               7             8
 *        9      10    0
 *      result =
 *        [0, 1, 2, 6, 3, 7, 8, 9, 10, 5]
 *        图解：                  0
 *                  1                             2
 *            6            3               7             8
 *        9      10     5
 *               原层次遍历：{7, 1, 3, 10, 5, 2, 8, 9, 6}
 *                                7
 *                  1                             3
 *            10           5               2             8
 *        9       6
 *      result =
 *        [1, 5, 2, 6, 7, 3, 8, 9, 10]
 *        图解：                   1
 *                  5                              2
 *            6            7                3            8
 *        9       10
 * @author: jiangzq
 * @create: 2019-12-01 10:19
 **/
public class BinaryHeap_array {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 6, 5, 7, 8, 9, 10, 0};
        upAdjust(array);
        System.out.println(Arrays.toString(array));
        array = new int[]{7, 1, 3, 10, 5, 2, 8, 9, 6};//覆盖了之前的数组
        buildHeap(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     *  构建堆
     * @param array 待调整的堆
     */
    private static void buildHeap(int[] array) {
        //从最后一个非叶子结点开始，依次做“下沉”调整
        for (int i = (array.length - 2) / 2; i >= 0; i--) {
            downAdjust(array, i, array.length);
        }
    }

    /**
     *  下沉
     * @param array         待调整的堆
     * @param parentIndex   要“下沉”的父结点
     * @param length        堆的有效大小
     */
    private static void downAdjust(int[] array, int parentIndex, int length) {
        //temp保存父结点值，用于最后的赋值
        int temp = array[parentIndex];
        int childIndex = 2 * parentIndex + 1;
        while (childIndex < length) {
            //如果有右孩子，其右孩子小于左孩子的值，则定位到右孩子
            if (childIndex + 1 < length && array[childIndex + 1] < array[childIndex]) {
                childIndex++;//+1就从左孩子变成了右孩子
            }
            //如果父结点temp小于任何一个孩子的值，则直接跳出
            if (temp <= array[childIndex]) //注意没有{}
                break;
            //无须真正交换，单向赋值即可
            array[parentIndex] = array[childIndex];
            parentIndex = childIndex;
            childIndex = 2 * childIndex + 1;
        }
        array[parentIndex] = temp;
    }

    /**
     *  "上浮"调整
     * @param array 待调整的堆
     */
    private static void upAdjust(int[] array) {
        int childIndex = array.length - 1;//从叶子结点最右边的那个结点开始
        int parentIndex = (childIndex - 1) / 2;
        //temp保存插入的叶子结点值，用于最后的赋值
        int temp = array[childIndex];
        while (childIndex > 0 && temp < array[parentIndex]) {//当父结点大于孩子结点时，交换
            //无须真正交换，单向赋值即可
            array[childIndex] = array[parentIndex];//上浮
            childIndex = parentIndex;//下标变化
            parentIndex = (parentIndex - 1) / 2;//父结点下标变小，因为它是由孩子结点上浮造成的
        }
        array[childIndex] = temp;//把值从孩子结点上浮赋给新的孩子结点（父结点），如此循环
    }
}
