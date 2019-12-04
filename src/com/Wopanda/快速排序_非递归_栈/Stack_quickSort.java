package com.Wopanda.快速排序_非递归_栈;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @program: 基础算法
 * @description: 栈实现快速排序
 *              这里是HashMap<>, LinkedHashMap 是数组+双向链表
 *              HashMap<> 数组 + 链表 为的是避免哈希冲突
 *              而散列表的key则是以字符串类型为主，需要借用一个“中转站”-哈希函数，把key和数组下标进行转换
 *              如给出一个长度为8的数组：
 *              key=001121时,
 *              index = HashCode("00921")%Array.length=1420036703%8 =7
 *              当key = this时，
 *              index= HashCode("this")%Array.length=3559070%8 =6
 *              写操作（put) 插入的是键值对
 *              读操作（get）查找的是Entry在散列表对应的“值”
 *              扩容（resize):
 *                 Capacity ：HashMap的当前长度
 *                 LoadFactor: HashMap的负载因子，默认值为0.75f
 *              衡量HashMap需要进行扩容的条件：
 *                 HashMap.Size >= Capacity×LoadFactor
 * @author: jiangzq
 * @create: 2019-12-02 10:02
 **/
public class Stack_quickSort {
    public static void main(String[] args) {
        int[] array = new int[]{4, 9, 2, 6, 1, 5, 3, 7, 8, 0};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    /**
     *  分治-单边循环
     * @param array
     * @param startIndex
     * @param endIndex
     */
    private static void quickSort(int[] array, int startIndex, int endIndex) {
        //用一个集合栈来代替递归的函数栈
        Stack<Map<String, Integer>> quickSort_stack = new Stack<>();
        //整个数列的起止下标，以哈希的形式入栈
        Map rootParam = new HashMap();
        rootParam.put("startIndex", startIndex);
        rootParam.put("endIndex", endIndex);
        quickSort_stack.push(rootParam);

        //循环结束条件：栈为空时
        while (!quickSort_stack.isEmpty()) {
            //栈顶元素出栈，得到起止下标
            Map<String, Integer> param = quickSort_stack.pop();
            //得到基准元素位置
            int pivotIndex = partition(array, param.get("startIndex"), param.get("endIndex"));
            //根据基准元素分成两部分，把每一部分的起止下标入栈
            if (param.get("startIndex") < pivotIndex - 1) {
                Map<String, Integer> leftParam = new HashMap<>();
                leftParam.put("startIndex", param.get("startIndex"));
                quickSort_stack.push(leftParam);
            }
            if (pivotIndex + 1 < param.get("endIndex")) {
                Map<String, Integer> rightParam = new HashMap<>();
                rightParam.put("startIndex", pivotIndex);
                rightParam.put("endIndex", param.get("endIndex"));
                quickSort_stack.push(rightParam);
            }
        }
       //因为方法是void所有不用 return;
    }

    private static int partition(int[] array, Integer startIndex, Integer endIndex) {
        //取第一个位置（也可以选择随机位置）的元素作为基准元素
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
        array[mark] = pivot;
        return mark;
    }
}
