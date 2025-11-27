package com.PracticeProblem;

public class ThirdLargestOddNumber {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7};
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            int n = arr[i];
            if(n % 2 == 0) continue;

            if(n > max1){
                max3 = max2;
                max2 = max1;
                max1 = n;
            }
            else if(n > max2 && n != max1){
                max3 = max2;
                max2 = n;
            }
            else if(n > max3 && n != max2 && n != max1){
                max3 = n;
            }
        }
        System.out.println(max3);
    }
}
