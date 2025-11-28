package com.PracticeProblem;

public class LCM {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int lcm = a > b ? a : b;
        while(true){
            if(lcm % a == 0 && lcm % b==0){
                break;
            }
            lcm++;
        }
        System.out.println(lcm);
    }
}
