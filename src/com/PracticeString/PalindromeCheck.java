package com.PracticeString;
public class PalindromeCheck {
    public static void main(String[] args) {
        String s = "mammam";
        String original = s;
        String rev = "";
        for(int i=s.length()-1; i>=0; i--){
            rev +=s.charAt(i);
        }
        if (original.equals(rev)) {

            System.out.println("Palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
