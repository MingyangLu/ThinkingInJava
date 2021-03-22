package com.cywri.main;
import java.util.ArrayList;
import java.util.List;

import static com.cywri.utils.Print.*;

public class Test {

    public static void main(String[] args){
        ArrayList<String> arrayList1 = new ArrayList<>();
        List<String> arrayList2 = new ArrayList<>();
        int[] arr = new int[]{2,2,2,0,1};
        int result = minArray(arr);
        print();
    }

    public static int minArray(int[] numbers) {
        int len = numbers.length;
        if (len == 1) return numbers[0];
        int low = 0, middle, high = len - 1;
        while (high > low) {
            middle = (low + high) / 2;
            if (numbers[middle - 1] > numbers[middle] && numbers[middle + 1] >= numbers[middle]) {
                return numbers[middle];
            } else if (numbers[middle - 1] <= numbers[middle] && numbers[middle] <= numbers[middle + 1]
                    && numbers[middle + 1] <= numbers[0]) {
                high = middle - 1;
            } else if (numbers[middle - 1] <= numbers[middle] && numbers[middle] <= numbers[middle + 1]
                    && numbers[middle + 1] > numbers[0]) {
                low = middle + 1;
            }
        }
        return numbers[0];
    }
}
