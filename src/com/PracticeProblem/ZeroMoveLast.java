package com.PracticeProblem;

import java.util.Arrays;

public class ZeroMoveLast {
    public static void main(String[] args){
        int arr[] = {1,0,2,0,3,0,4,0,5,0,6,0,7,0};
        int arr1[] = new int[arr.length];
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                arr1[count++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
