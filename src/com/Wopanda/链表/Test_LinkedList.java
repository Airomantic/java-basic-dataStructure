package com.Wopanda.链表;

/**
 * @program: 基础算法
 * @description:
 * @author: jiangzq
 * @create: 2019-11-29 11:31
 **/
public class Test_LinkedList {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.insert(3, 0);//这里的index不是下标，但也是表示第几个位置的标志
        myLinkedList.remove(0);
        myLinkedList.output();
    }
}
