package com.PracticeProblem;

import java.util.Arrays;

public class ZeroMoveFirst {
    public static void main(String[] args){
        int arr[] = {2,0,4,0,5,0,6,0};
        int arr1[] = new int[arr.length];
        int count = arr1.length-1;
        for(int i = arr.length-1; i>=0; i--){
            if(arr[i] != 0) {
                arr1[count--] = arr[i];
            }
        }

            System.out.println(Arrays.toString(arr1));


    }
}
