package com.Wopanda.二叉堆_优先队列;


import java.util.Arrays;

/**
 * @program: 基础算法
 * @description:
 *  result =
 *     出队元素：74
 *     出队元素：10
 * @author: jiangzq
 * @create: 2019-12-01 15:45
 **/
public class Test_PriorityQueue {
    private int[] array;
    private int size;

    public Test_PriorityQueue() {
        //队列初始长度为32
        array = new int[32];
    }
    public static void main(String[] args) throws Exception {
        Test_PriorityQueue priorityQueue = new Test_PriorityQueue();
        //PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.enqueue(3);
        priorityQueue.enqueue(10);
        priorityQueue.enqueue(74);
       /*  priorityQueue.enqueue(20);*/

        System.out.println("出队元素：" + priorityQueue.dequeue());
        System.out.println("出队元素：" + priorityQueue.dequeue());
    }

    /**
     *  出队
     * @return
     */
    private int dequeue() throws Exception {
        if (size < 0) {
            throw new Exception("这个队列是空的");
        }
        //获取堆顶元素
        int head = array[0];
        //让最后一个元素移动到堆顶
        array[0] = array[--size];
        downAdjust();
        return head;
    }

    /**
     *  下沉 调整由parentIndex启动
     */
    private void downAdjust() {
        //temp保存父结点的值，用于最后的赋值
        int parentIndex = 0;
        int temp = array[parentIndex];//temp赋予父结点
        int childIndex = 1;
        while (childIndex < size) {
            //如果有右孩子(childIndex+1)，且右孩子大于左孩子的值，则定位到右孩子
            if (childIndex + 1 < size && array[childIndex + 1] > array[childIndex]) {
                childIndex++;
            }
            //如果父结点大于任何一个孩子的值，直接跳出
            if (temp>=array[childIndex])
                break;
            //无须真正交换，单向赋值即可
            array[parentIndex] = array[childIndex];
        }
        array[childIndex] = temp;
    }

    /**
     *  入队-堆的插入操作
     * @param key
     */
    private void enqueue(int key) {
        //队列长度超出范围，扩容resize
        if (size >= array.length) {
            resize();
        }
        array[size++] = key;
        upAdjust();
    }

    /**
     *  上浮 调整用childIndex启动
     */
    private void upAdjust() {
        int childIndex = size - 1;
        int parentIndex = (childIndex - 1) / 2;//由孩子结点找到父结点
        //temp保存插入的叶子结点值，用于最后的赋值,实现循环上浮
        int temp = array[childIndex];
        while (childIndex > 0 && temp > array[parentIndex]) {
            //无须真正交换，单向赋值即可
            array[childIndex] = array[parentIndex];
            childIndex = parentIndex;
            parentIndex = parentIndex / 2;
        }
        array[childIndex] = temp;//逐个循环上浮
    }

    private void resize() {
        //队列容量翻倍
        int newSize = this.size * 2;
        this.array = Arrays.copyOf(this.array, newSize);
    }
}
