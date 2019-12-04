package com.Wopanda.数组超标_扩容插入;

/**
 * @program: 基础算法
 * @description:
 * @author: jiangzq
 * @create: 2019-11-29 10:39
 **/
public class Test_dilatation_insert {
    private int size;
    private int[] array;


    public Test_dilatation_insert(int capacity) {
        this.array = new int[capacity];
        size = 0;
    }

    public static void main(String[] args) {
        Test_dilatation_insert myArray_2 = new Test_dilatation_insert(10);
        myArray_2.insert(100, 3);
        myArray_2.output();
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
        //如果实际元素达到数组容量的上限，则对数组进行扩容
        if (size >= array.length) {
            resize();//调整大小
        }
        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = element;
        size++;
    }

    private void resize() {
        int[] array_new = new int[array.length];
        System.arraycopy(array, 0, array_new, 0, array.length);
        array = array_new;
    }
}
