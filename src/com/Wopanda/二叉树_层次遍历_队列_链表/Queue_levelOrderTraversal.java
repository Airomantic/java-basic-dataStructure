package com.Wopanda.二叉树_层次遍历_队列_链表;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: 基础算法
 * @description:
 * @author: jiangzq
 * @create: 2019-12-01 08:40
 **/
public class Queue_levelOrderTraversal {

    public static void main(String[] args) {

    }

    public static void levelOrderTraversal(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root); //offer()将指定的元素插入此队列
        while (!queue.isEmpty()) {
            //poll()检索并删除此队列的头
            //如果此队列为空，则返回{@code null}。
            //@return 此队列的头，如果此队列为空，则return{@code null}
            //{@link#poll poll}只在队列为空情况下引发异常
            TreeNode treeNode = queue.poll();
            System.out.println(treeNode.data);
            if (treeNode.leftChild != null) {
                //offer()将指定的元素插入此队列
                //因此，在不违反容量限制的情况下,当使用容量受限队列时，此方法通常是优于{@link#add}，后者只能插入元素,通过抛出异常
                queue.offer(treeNode.leftChild);
            }
            if (treeNode.rightChild != null) {
                queue.offer(treeNode.rightChild);
            }
        }
    }
    public static class TreeNode{
        int data;
        TreeNode leftChild;
        TreeNode rightChild;

        TreeNode(int data) {
            this.data = data;
        }
    }
}
