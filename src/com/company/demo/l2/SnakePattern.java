package com.company.demo.l2;

public class SnakePattern {

    public void findSolution(int n)
    {
        int count = 0;
        System.out.println("==================================");
        for (int i = 1; i <=n*n; i++) {
            produceSpace((n-(count/n))*2);
            for (int j = i; j < i+n; j++) {
                System.out.print(j+" ");
                count++;
            }
            int c = count;
            System.out.println();
            produceSpace((n-(count/n))*2);
            for (int j = c+n; j >c; j--) {
                System.out.print(j+" ");
                count++;
            }

            i = count;
            System.out.println();
        }
    }

    public void produceSpace(int n)
    {
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }
    }

}
