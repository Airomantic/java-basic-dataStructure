package com.Wopanda.数组中间插入元素;

/**
 * @program: 基础算法
 * @description:
 * @author: jiangzq
 * @create: 2019-11-29 10:10
 **/
public class Test_Array_insert {
    //记住都不能final
    private int[] array;
    private int size;

    public Test_Array_insert(int capacity) {
        this.array = new int[capacity];
        size = 0;
    }

    public static void main(String[] args) {
        Test_Array_insert myArray = new Test_Array_insert(10);

        myArray.insert(9, 4);
        myArray.insert(10, 1);
        myArray.insert(8, 2);
        myArray.insert(0, 3);
        myArray.output();
    }

    private void output() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

    private void insert(int element, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("数组实际元素超出范围！！");
        }
        for (int i = size - 1; i >= index; i++) {
            array[i + 1] = array[i];
        }
        array[index] = element;
        size++;
    }
}

