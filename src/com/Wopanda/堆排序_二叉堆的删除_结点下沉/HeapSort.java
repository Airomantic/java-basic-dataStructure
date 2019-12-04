package com.Wopanda.堆排序_二叉堆的删除_结点下沉;

import java.util.Arrays;

/**
 * @program: 基础算法
 * @description: 二叉堆最大堆的删除->堆排序
 *        1.先把无序数组构建成最大堆                               时间复杂度=O(n)
 *        2.循环删除堆顶元素，移到集合尾部，调整堆产生新的堆顶     需n-1次循环，每次调用一次downAdjust()，则时间复杂度=（n-1)×logn=O(nlogn)
 *     result =
 *         [9, 8, 7, 3, 6, 5, 0, 1, 2, 4]
 *         [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 *
 *         堆排序和快速排序平均时间复杂度都是O(nlogn) ,都是不稳定排序
 *         快排最坏时间复杂度是O(n^2)
 *         堆排最坏时间复杂度也是O(nlogn)
 * @author: jiangzq
 * @create: 2019-12-03 16:32
 **/
public class HeapSort {
    public static void main(String[] args) {
        int[] array = new int[]{9, 2, 5, 1, 6, 7, 0, 8, 3, 4};
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     *  堆排序 （升序）
     * @param array 待调整的堆
     */
    private static void heapSort(int[] array) {
        //1.先把无序数组构建成最大堆
        for (int i = (array.length - 2) / 2; i >= 0; i--) {
            downAdjust(array,i,array.length);//注意这里的参数,i为父结点下标
        }
        System.out.println(Arrays.toString(array));
        //2.循环删除堆顶元素，移到集合尾部，调整堆产生新的堆顶
        for (int i = array.length - 1; i > 0; i--) {
            int temp = array[i];
            array[i] = array[0];
            array[0] = temp;
            //“下沉”调整最大堆，上面大的换到下面，下面小的换到堆顶依次...
            downAdjust(array, 0, i);
        }
    }

    /**
     *  “下沉” 调整->最大堆，即上面大下面依次从左往右减小
     * @param array 待调整的堆
     * @param parentIndex 要“下沉”的父结点
     * @param length 堆的有效大小
     */
    private static void downAdjust(int[] array, int parentIndex, int length) {
        //temp保存父结点，用于最后的赋值
        int temp = array[parentIndex];
        //由父结点下标得出左孩子下标
        int childIndex = 2 * parentIndex + 1;
        while (childIndex < length) {
            if ( childIndex + 1 < length && array[childIndex] < array[childIndex + 1]) {
                //一定得先比较childIndex + 1 < length，再满足该条件的之后，再判断array[childIndex] < array[childIndex + 1]
                childIndex++;
            }
            //如果父结点大于任何孩子的值，则直接跳出
            if (temp>=array[childIndex])
                break;
            //无须真正交换，单向赋值即可
            array[parentIndex] = array[childIndex];//孩子结点成为新的父结点，即下沉
            parentIndex = childIndex;
            //孩子结点成为新的父结点，则如此循环父结点下标parentIndex就是孩子结点childIndex
            childIndex = 2 * childIndex + 1;
        }
        array[parentIndex] = temp;
    }
}
