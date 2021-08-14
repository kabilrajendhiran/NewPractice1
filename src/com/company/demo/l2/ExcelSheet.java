package com.company.demo.l2;

public class ExcelSheet {

    public void findSolution(int num)
    {
        String output="";
        while (num>0)
        {
            int rem = num%26;
            if(rem==0)
            {
                rem = rem + 26;
                output = (char)(rem+64) + output;
            }
            else
            {
                output = (char)(rem+64) + output;
            }
            num = num/26;
        }

        System.out.println(output);

    }

}
