package com.company.demo.l2;

public class RunLengthDecoding {

    public void decode(String s)
    {
        boolean flag = false;
        int num = 0;
        char res = ' ';

        for (int i = 0; i < s.length(); i++) {
            int c = convertToInt(s.charAt(i));

            while (c>=0 && c<=9)
            {
                num = num*10 + c;
                i++;
                c = convertToInt(s.charAt(i));
            }

            if(flag)
            {
                for (int j = 0; j < num; j++) {
                    System.out.print(res);
                }
                flag = false;
                num = 0;
            }

            if(c>9)
            {
                res = s.charAt(i);
                flag = true;
            }


        }
    }

    public int convertToInt(char c)
    {
        int d= c - '0';
        return d;
    }
}
