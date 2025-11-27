package com.PracticeString;

public class ReverseWord {
    public static void main(String[] args) {
        String s = "I love java";
        String res = "";
        String []word = s.split(" ");
        for(int i=word.length-1; i>=0; i--){
            res +=word[i]+ " ";
        }
       System.out.println("Reversed Sentence: "+res.trim());
    }
}
