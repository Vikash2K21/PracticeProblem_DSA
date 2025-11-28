package com.PracticeString;

public class CountWords {
    public static void main(String[] args) {
        String s = "I love java and also web technology";
        String []word = s.split(" ");
        int count = word.length;
//        for(int i=0; i<word.length; i++){
//            count++;
//        }
        System.out.println(count);
    }
}
