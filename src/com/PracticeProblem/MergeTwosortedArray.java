package com.PracticeProblem;
import java.util.Arrays;
public class MergeTwosortedArray {
    public static void main(String[] args){
        int []a = {1,2,3,4};
        int []b ={5,9,6,8};
        int []c = new int[a.length + b.length];
        int i=0; int j=0; int k=0;
        while(i<a.length && j<b.length){
            if(a[i] < b[j]){
                c[k++] = a[i++];
            }else{
                c[k++] = b[j++];
            }
        }
        while(i<a.length){
            c[k++] = a[i++];
        }
        while(j<b.length){
            c[k++] = b[j++];
        }
        for(int d : c){
            System.out.print(d+" ");
        }
    }
}
