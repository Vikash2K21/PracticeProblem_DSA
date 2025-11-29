package com.PracticeProblem;
import java.util.*;
public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        boolean flag = true;
        for(int i=2; i<num/2; i++){
            if(num%i == 0){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }

}
