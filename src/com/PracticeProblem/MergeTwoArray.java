package com.PracticeProblem;

import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int []a = {1,4,6,3,5};
        int[]b = {6,7,8,9,10};
        int []c = new int[a.length*2];
        int i=0; int j=0; int k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
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
        Arrays.sort(c);
        for(int d:c){
            System.out.print(d+" ");
        }
    }
}
