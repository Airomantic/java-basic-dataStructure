package com.Wopanda.二叉树_遍历_链表_递归;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @program: 基础算法
 * @description: 每一个层级的不同遍历就是一个递归
 *       前序遍历方式输入：{3,2,9,null,null,10,null,null,8,null,4}
 *                       3
 *               2                 8
 *          9        10      null      4
 *      null null null null
 *       result =
 *           前序遍历：
 *            3 2 9 10 8 4
 *           中序遍历：
 *            9 2 10 3 8 4
 *           后序遍历：
 *            9 10 2 4 8 3
 *             前序遍历方式输入：{1,2,4,null,null,5,null,null,3,null,6}
 *                         1
 *                 2               3
 *            4       5       null     6
 *       null null null null
 *           result =
 *              前序遍历：
 *               1 2 4 5 3 6
 *              中序遍历：
 *              4 2 5 1 3 6
 *              后序遍历：
 *              4 5 2 6 3 1
 * @author: jiangzq
 * @create: 2019-11-30 17:44
 **/
public class BinaryTree_traversal {
    public static void main(String[] args) {
        LinkedList<Integer> inputList = new LinkedList<Integer>(Arrays.asList(new
                Integer[]
                //前序遍历
                    //    {3,2,9,null,null,10,null,null,8,null,4}
                        {1,2,4,null,null,5,null,null,3,null,6}
                ));
        TreeNode treeNode = createBinaryTree(inputList);
        System.out.println("前序遍历：");
        preOrderTraveral(treeNode);
        System.out.println();
        System.out.println("中序遍历：");
        inOrderTraversal(treeNode);
        System.out.println();
        System.out.println("后序遍历：");
        postOrderTraveral(treeNode);
    }

    /**
     *  左->右->父
     * @param treeNode
     */
    private static void postOrderTraveral(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        postOrderTraveral(treeNode.leftChild);
        postOrderTraveral(treeNode.rightChild);
        System.out.print(treeNode.data+" ");
    }

    /**
     *  左->父->右
     * @param treeNode
     */
    private static void inOrderTraversal(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        inOrderTraversal(treeNode.leftChild);
        System.out.print(treeNode.data+" ");
        inOrderTraversal(treeNode.rightChild);
    }

    /**
     *  父->左->右
     * @param treeNode
     */
    private static void preOrderTraveral(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        System.out.print(treeNode.data+" ");
        preOrderTraveral(treeNode.leftChild);
        preOrderTraveral(treeNode.rightChild);
    }

    /**
     * 构建二叉树
     * @param inputList 输入序列
     * @return
     */
    private static TreeNode createBinaryTree(LinkedList<Integer> inputList) {
        TreeNode treeNode = null;
        if (inputList == null || inputList.isEmpty()) {
            return null;
        }
        //removeFirst()从LinkedList列表中删除并返回第一个元素，即逐个取出元素放入二叉树中
        Integer data = inputList.removeFirst();
        if (data != null) {
            treeNode = new TreeNode(data);
            treeNode.leftChild = createBinaryTree(inputList);
            treeNode.rightChild = createBinaryTree(inputList);
        }
        return treeNode;
    }

    /**
     * 定义一个树结点
     */
    public static class TreeNode {
        int data;
        TreeNode leftChild;
        TreeNode rightChild;

        TreeNode(int data) {
            this.data = data;
        }
    }
}
