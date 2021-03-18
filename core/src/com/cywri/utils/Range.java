package com.cywri.utils;

public class Range {

    public static int[] range(int n){
        int[] result = new int[n];
        for (int i = 0; i < n; i++)
            result[i] = i;
        return result;
    }

    public static int[] range(int start, int end){
        int n = end - start;
        int[] result = new int[n];
        for (int i = 0; i < n; i++)
            result[i] = start + i;
        return result;
    }

    public static int[] range(int start, int end, int step){
        int n = (end - start)/step;
        int[] result = new int[n];
        for (int i = 0; i < n; i++)
            result[i] = start + i * step;
        return result;
    }
}
