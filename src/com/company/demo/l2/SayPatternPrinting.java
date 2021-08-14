package com.company.demo.l2;

public class SayPatternPrinting {

    public void findSolution(int n)
    {
        if (n>0)
        {
            System.out.println(1);
        }
        if (n>1)
        {
            System.out.println(11);
        }

        if(n>3)
        {
            String number = "11$";

            String res = "";
            for (int i = 3; i < n; i++) {

                res = "";
                int j = 0;
                char num = number.charAt(j);
                int count = 0;
                while (j<number.length())
                {
                    if(num==number.charAt(j))
                    {
                        count++;
                    }
                    else
                    {
                        res =res + count+""+num;
                        count = 1;
                        num = number.charAt(j);
                    }

                    j++;
                }
                System.out.println(res);
                number = res+"$";

            }

        }

    }

}
