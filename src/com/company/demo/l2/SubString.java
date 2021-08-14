package com.company.demo.l2;

public class SubString {

    public void findSolution(String s1, String s2)
    {
        int idx = 0;
        for (int i = 0; i < s1.length()-1; i++) {
            if(s1.charAt(i)==s2.charAt(0))
            {
                int j=1;
                idx = i;
                while ( j<s2.length() && s1.charAt(idx+1)==s2.charAt(j))
                {
                    idx++;
                    j++;
                }
                if(j==s2.length())
                {
                    System.out.println(idx-s2.length()+1);
                }
            }
        }
    }


}
