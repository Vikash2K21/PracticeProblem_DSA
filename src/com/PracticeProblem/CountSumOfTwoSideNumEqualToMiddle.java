package com.PracticeProblem;

public class CountSumOfTwoSideNumEqualToMiddle {
    public static void main(String[] args) {
        int arr[] = {2,5,3,4,8,4,1,2};
        int count  = 0;
        for(int i=0; i<arr.length-2; i++){
            if(arr[i] + arr[i+2] == arr[i+1]){
                count++;
            }
        }
        System.out.println("Count:"+count);
    }
}
