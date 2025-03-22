package com.home.work4;

import java.util.Arrays;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        int[] arr = {7, 6, 5, 4, 3};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            int min=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[min]) {
                    min=j;
                    int temp=arr[min];
                    arr[min]=arr[i];
                    arr[i]=temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }

}
