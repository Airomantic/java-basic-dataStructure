package com.Wopanda.循环队列;

/**
 * @program: 基础算法
 * @description:
 * @author: jiangzq
 * @create: 2019-11-30 11:08
 **/
    public class Test_circularQueue {
    private int[] array;
    private int front;
    private int rear;

    /**
     * 配置构造器，可以随意定制容量
     * @param capacity
     */
    public Test_circularQueue(int capacity) {
        this.array = new int[capacity];
    }


    public static void main(String[] args) throws Exception {
        Test_circularQueue test_circularQueue = new Test_circularQueue(6);
        test_circularQueue.enqueue(3);
        test_circularQueue.enqueue(9);
        test_circularQueue.enqueue(4);
        test_circularQueue.enqueue(100);

        test_circularQueue.dequeue();//出队-第一个数，3出去

        test_circularQueue.enqueue(1);
        test_circularQueue.enqueue(7);
//        test_circularQueue.enqueue(56);
        test_circularQueue.output();
    }

    private void output() {
        //i = (i + 1) % array.length表示在数组已定容量内i++逐增
        for (int i = front; i != rear; i = (i + 1) % array.length) {
            System.out.print(" "+array[i]);
            /*if ((i + 1) % array.length == 0) {
                System.out.println();
            }*/
        }
    }

    private int dequeue() throws Exception {
        if (rear == front) {
            throw new Exception("队列已空");
        }
        int dequeue_element = array[front];
        front = (front + 1) % array.length;
        return dequeue_element;
    }

    private void enqueue(int element) throws Exception {
        //(队尾下标+1)%数组长度=队头下标，代表该队列真的满了
        //注意：队尾指针指向的位置永远空出1位，队列最大容量比数组长度小1
        if ((rear + 1) % array.length == front) {
            throw new Exception("队列已满");
        }
        array[rear] = element;
        //没超出capacity=array.length，当前容量就是%（余除）之后的余数
        //+1依次递增
        rear = (rear + 1) % array.length;
    }
}
