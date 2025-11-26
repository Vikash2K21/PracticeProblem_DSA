package com.PracticeProblem;

public class BinarySearchByRecursion {
    public static int binarySearch(int arr[], int st, int end, int key){
        if(st > end)
        return -1;
            int mid = (st + end)/2;
            if(arr[mid] == key) {
                return mid;
            }else if(arr[mid] >key) {
                return binarySearch(arr, st, mid - 1, key);
            }else{
                return binarySearch(arr, mid+1, end, key);
        }
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7};
        int key = 5;
        System.out.println("Index position is : "+binarySearch(arr,0,arr.length-1,key));
    }
}
