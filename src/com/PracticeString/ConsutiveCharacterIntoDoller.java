package com.PracticeString;

public class ConsutiveCharacterIntoDoller {
    public static void main(String[] args) {
        String s = "BOSSSSSS";
        String res = "";
        int count  = 0;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 's' || ch == 'S') {
                count++;
                if (count % 2 == 0) {
                    res += '$';
                } else {
                    res += ch;
                }

            }else {
                res += ch;
            }
        }
        System.out.println(res);
    }
}
