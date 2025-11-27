package com.PracticeString;

public class isPalindrome {
    public static void main(String[] args) {
        String s = "mamojmam";

        int left =0;
        int right = s.length()-1;
        boolean flag = true;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                flag = false;
                break;
            }
            left++;
            right--;
        }
        if(flag){
            System.out.println("palinrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
