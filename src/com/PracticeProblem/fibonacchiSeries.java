package com.PracticeProblem;

public class fibonacchiSeries {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=10;
        int c = 0;
        System.out.print(a+" "+b+" ");
        for(int i=2; i<=n; i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }

    }
}
