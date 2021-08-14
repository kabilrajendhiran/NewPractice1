package com.company.demo.l2;

public class ReverseString {

    public String reverseWords(String s, int start, String res){
        String s1 = "";
        int i=start;
        while (i<s.length() && s.charAt(i)!=' ')
        {
            s1 =s1+ s.charAt(i);
            i++;
        }
        s1 = s1 + ' ';
        res = s1 + res;
        i++;
        if(i<s.length())
        {
            return reverseWords(s,i,res);
        }
        else
        {
            return res;
        }

    }


}
