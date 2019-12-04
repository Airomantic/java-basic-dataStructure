package com.Wopanda.链表;

/**
 * @program: 基础算法
 * @description:
 * @author: jiangzq
 * @create: 2019-11-29 11:32
 **/
public class MyLinkedList {

    //头节点
    private Node head;
    //尾节点
    private Node last;
    private int size;

    /**
     * (/**然后回车)
     * @param data 插入元素
     * @param index 插入位置
     */
    public void insert(int data, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("超出链表节点范围！！");
        }
        Node inserted_node = new Node(data);
        if (size == 0) {//空链表
            head = inserted_node;
            last = inserted_node;
        } else if (index==0) {//插入头部
            inserted_node.next = head;
            head = inserted_node;//成为新头节点
        } else if (size == index) {//插入尾部
            last.next = inserted_node;
            last = inserted_node;//成为新尾节点
        } else {
            //插入中间
            Node previous_node = get(index - 1);//获取前节点
            inserted_node.next = previous_node.next;//使新插入节点的指针取代前节点的指针，即取代它指向下一个节点
            previous_node.next = inserted_node;//前节点指针指向新插入的节点
        }
        size++;
    }

    public void output() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public Node remove(int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("超出链表节点范围！");
        }
        Node removed_node = null;
        if (index == 0) {
            //删除头节点
            removed_node = head;
            head = head.next;
        } else if (index == size - 1) {
            //删除尾节点
            Node previous_node = get(index - 1);
            removed_node = previous_node.next;
            previous_node.next = null;
            last = previous_node;
        } else {
            //删除中间节点
            Node previous_node = get(index - 1);
            //previous_node.next指向的是要删除的节点，previous_node.next.next是要删除节点的指针，指向删除节点的下一个节点
            Node next_node = previous_node.next.next;
            removed_node = previous_node.next;
            previous_node.next = next_node;//删除节点的前节点指针指向删除节点的下一个节点
        }
        size--;
        return removed_node;
    }

    /**
     * 链表查找元素
     * @param index 查找元素
     * @return
     */
    private Node get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("超出链表节点范围!");
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
}
