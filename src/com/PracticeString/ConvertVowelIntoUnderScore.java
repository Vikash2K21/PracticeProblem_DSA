package com.PracticeString;

public class ConvertVowelIntoUnderScore {
    public static void main(String[] args) {
        String s = "javadev";

        char ch[] = s.toCharArray();
        for(int i=0; i<s.length(); i++){
            if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u'){
                ch[i] = '_';
            }
        }
        System.out.println(ch);
    }
}
