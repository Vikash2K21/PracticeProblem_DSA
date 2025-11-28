package com.PracticeString;

public class RemoveVowels {
    public static void main(String[] args) {
        String s="javadev";
        String res = "";
        char ch[] = s.toCharArray();
        for(int i=0; i<ch.length; i++){
            if(ch[i]=='a'|| ch[i]=='e'|| ch[i]=='i'|| ch[i]=='o'|| ch[i]=='u'){
                continue;
            }
            else{
                res +=ch[i];
            }
        }
        System.out.println(res);
    }
}
