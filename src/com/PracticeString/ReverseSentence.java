package com.PracticeString;

public class ReverseSentence {
    public static void main(String[] args) {
        String s = "I love java";
        String str = "";
        char ch[] = s.toCharArray();
        for(int i=s.length()-1; i>=0;i--){
           str +=ch[i];
        }
        System.out.println(str);
    }
}
