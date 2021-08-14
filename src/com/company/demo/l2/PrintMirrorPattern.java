package com.company.demo.l2;

public class PrintMirrorPattern {

    public void findSolution(int n)
    {
        for (int i = 0; i < n; i++) {
            produceSpace(n-i);
            for (int j = i; j >=0; j--) {
                System.out.print(j);
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
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
