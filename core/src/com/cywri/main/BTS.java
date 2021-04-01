package com.cywri.main;

import java.util.ArrayList;
import java.util.Arrays;

public class BTS {

    public static void main(String[] args){
        int[] arr = {   7};
        ArrayList<Integer> arrayList = new ArrayList<>();
        TreeNode treeNode = BTS.arrayToBts(arr);
        arrayList = BTS.printBtsArr(treeNode, arrayList);
        arrayList.forEach((Integer item) -> {
            System.out.println("输出："+item);
        });
    }

    public static ArrayList<Integer> printBtsArr(TreeNode treeNode, ArrayList<Integer> result){
        if (treeNode.getLeft() != null){
            printBtsArr(treeNode.getLeft(),result);
        }
        if (treeNode.getRight() != null){
            printBtsArr(treeNode.getRight(),result);
        }
        result.add(treeNode.getValue());
        return result;
    }

    public static TreeNode arrayToBts(int posarr[]){
        int len = posarr.length;
        TreeNode treeNode = new TreeNode();
        if (len == 0){
            return null;
        }
        if (len == 1){
            treeNode.setValue(posarr[0]);
            return treeNode;
        }
        int mainValue = posarr[len-1];
        treeNode.setValue(mainValue);
        int divideIndex = 0;

        for (int i = 0; i < len; i++){
            if(posarr[i] >= mainValue ){
                divideIndex = i;
                break;
            }
        }
        if(divideIndex != 0){
            int[] leftArr = Arrays.copyOfRange(posarr, 0, divideIndex);
            treeNode.setLeft(arrayToBts(leftArr));
        }
        if(divideIndex < len -1){
            int[] rightArr = Arrays.copyOfRange(posarr, divideIndex, len-1);
            treeNode.setRight(arrayToBts(rightArr));
        }
        return treeNode;
    }
}

