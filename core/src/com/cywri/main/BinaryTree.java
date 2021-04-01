package com.cywri.main;

import java.util.Arrays;

public class BinaryTree {
    public static void main(String[] args){
        int[] dlr = {5,3,1,2,7,6,8};
        int[] ldr = {1,3,2,5,6,7,8};
        TreeNode treeNode = BinaryTree.rebuildBinaryTree(dlr, ldr);
        System.out.println("结束");
    }

    public static TreeNode rebuildBinaryTree(int[] dlr, int[] ldr){
        int len = dlr.length;
        TreeNode treeNode = new TreeNode();
        //找到根节点
        int root = dlr[0];
        treeNode.setValue(root);
        if (len == 1){
            return treeNode;
        }
        int devideIndex =  Arrays.binarySearch(ldr, root);

        if (devideIndex != 0){
            //分割前序遍历DLR数组左子树
            int[] dlrLeft = Arrays.copyOfRange(dlr, 1, devideIndex + 1);
            //分割中序遍历LDR数组左子树
            int[] ldrLeft = Arrays.copyOfRange(ldr, 0, devideIndex);

            treeNode.setLeft(BinaryTree.rebuildBinaryTree(dlrLeft, ldrLeft));
        }
        if (devideIndex != len -1 ){
            //分割前序遍历DLR数组右子树
            int[] dlrRight = Arrays.copyOfRange(dlr, devideIndex + 1, len);
            //分割中序遍历LDR数组右子树
            int[] ldrRight = Arrays.copyOfRange(ldr, devideIndex + 1, len);

            treeNode.setRight(BinaryTree.rebuildBinaryTree(dlrRight, ldrRight));
        }

        return treeNode;



    }
}
