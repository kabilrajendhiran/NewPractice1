package com.company.demo.l2;

public class XPrintPattern {

    public void printPattern(String s)
    {
        int length = s.length();
        int halfLength = s.length()/2;

        for (int i = 0; i < halfLength; i++) {
            printSpace(i);
            System.out.print(s.charAt(i));
            printSpace(length-(i*2)-2);
            System.out.println(s.charAt(length-1-i));
        }

        printSpace(halfLength);
        System.out.println(s.charAt(halfLength));

        for (int i = 0; i < halfLength; i++) {
            printSpace(halfLength-1-i);
            System.out.print(s.charAt(halfLength-1-i));
            printSpace((i*2)+1);
            System.out.println(s.charAt(halfLength+1+i));
        }

    }

    public void printSpace(int n)
    {
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }
    }


}
