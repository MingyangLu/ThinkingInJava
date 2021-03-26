package com.cywri.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class BTS {

    public static void main(String[] args){
        int[] arr = {2, 4, 3, 6, 8, 7, 5};
        ArrayList<Integer> arrayList = new ArrayList<>();
        Node node = BTS.arrayToBts(arr);
        arrayList = BTS.printBtsArr(node, arrayList);
        arrayList.forEach((Integer item) -> {
            System.out.println("输出："+item);
        });
    }

    public static ArrayList<Integer> printBtsArr(Node node, ArrayList<Integer> result){
        if (node.getLeft() != null){
            printBtsArr(node.getLeft(),result);
        }
        if (node.getRight() != null){
            printBtsArr(node.getRight(),result);
        }
        result.add(node.getValue());
        return result;
    }

    public static Node arrayToBts(int posarr[]){
        int len = posarr.length;
        Node node = new Node();
        if (len == 1){
            node.setValue(posarr[0]);
            return node;
        }
        int mainValue = posarr[len-1];
        node.setValue(mainValue);
        int divideIndex = 0;

        for (int i = 0; i < len; i++){
            if(posarr[i] >= mainValue ){
                divideIndex = i;
                break;
            }
        }
        if(divideIndex != -1){
            int[] leftArr = Arrays.copyOfRange(posarr, 0, divideIndex);
            node.setLeft(arrayToBts(leftArr));
        }
        if(divideIndex < len -1){
            int[] rightArr = Arrays.copyOfRange(posarr, divideIndex, len-1);
            node.setRight(arrayToBts(rightArr));
        }
        return node;
    }
}

class Node{

    private Integer value;
    private Node left;
    private Node right;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}