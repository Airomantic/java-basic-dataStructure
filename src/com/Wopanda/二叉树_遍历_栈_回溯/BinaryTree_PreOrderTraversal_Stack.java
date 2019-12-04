package com.Wopanda.二叉树_遍历_栈_回溯;

import java.util.Arrays;
import java.util.Stack;

/**
 * @program: 基础算法
 * @description:
 * @author: jiangzq
 * @create: 2019-11-30 22:09
 **/
public class BinaryTree_PreOrderTraversal_Stack {
    public static void main(String[] args) {
        BinaryTree_PreOrderTraversal_Stack preOrderTraversal_stack = new BinaryTree_PreOrderTraversal_Stack();
       // preOrderTraversal_stack.preOrderWithStack(new TreeNode());

    }

    /**
     *  二叉树非递归前序遍历
     * @param root 根结点
     */
    private static void preOrderWithStack(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode treeNode = root;
        while (treeNode != null||!stack.isEmpty()) {
            //迭代访问结点的左孩子，并入栈
            while (treeNode != null) {
                System.out.println(treeNode.data);
                stack.push(treeNode);//入栈，参数都为tree
                treeNode = treeNode.leftChild;
            }
            //如果结点没有左孩子，则弹出栈顶结点，访问结点的右孩子
            if (!stack.isEmpty()) {
                treeNode = stack.pop();
                treeNode = treeNode.rightChild;
            }
        }
    }

    public static class TreeNode {
        int data;
        TreeNode leftChild;
        TreeNode rightChild;

        TreeNode(int data) {
            this.data = data;
        }
    }
}
