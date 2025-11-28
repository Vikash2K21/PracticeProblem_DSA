package com.PracticeProblem;

public class LCM_GCD {
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
        //int gcd = a*b/lcm;

       // System.out.println(gcd);
        int x = a;
        int y = b;
        while(x != y){
            if(x > y){
                x = x-y;
            }else{
                y = y-x;
            }
        }
        System.out.println("Gcd : "+x);
        System.out.println("Lcm : "+lcm);
    }
}
