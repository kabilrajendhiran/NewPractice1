package com.company.demo.l2;

public class OddNumbers {

    public void findSolution(int start, int end)
    {
        if(start%2==0)
        {
            start = start+1;
        }

        while (start<end)
        {
            System.out.print(start+" ");
            start = start + 2;

        }

    }
}
