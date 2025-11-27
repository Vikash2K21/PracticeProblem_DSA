package com.PracticeProblem;

public class HigestFrequesncy {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,2,3,4,52,3,4};
        int maxFreq = 0;
        int element = arr[0];
        for(int i=0;i<arr.length;i++){
            int count = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > maxFreq){
                maxFreq = count;
                element = arr[i];
            }
        }
        System.out.println("Maximum frequesncy of the element : " +maxFreq);
        System.out.println("Element is : " +element);
    }
}
