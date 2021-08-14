package com.company.demo.l2;

import java.util.Arrays;

public class UnionArray {

    public void findSolution(int[] arr1, int[] arr2)
    {
        int[] newArray = new int[arr1.length+arr2.length];

        int a=0,b=0;
        int i;
        for ( i = 0; i < newArray.length; i++) {

            if(a<arr1.length && b<arr2.length)
            {
                if(arr1[a]==arr2[b])
                {
                    newArray[i] = arr1[a];
                    a++;
                    b++;
                }

                else if(arr1[a]>arr2[b])
                {
                    newArray[i] = arr2[b];
                    b++;
                }
                else if (arr1[a]<arr2[b])
                {
                    newArray[i] = arr1[a];
                    a++;
                }
            }
            else
            {
                break;
            }

        }

        if(arr1.length!=a)
        {
            int diff = arr1.length - a;
            for (int j = 0; j < diff; j++) {
                newArray[j++] = arr1[a++];
            }
        }
        else if(arr2.length!=b)
        {
            int diff = arr2.length - b;
            for (int j = 0; j < diff; j++) {
                newArray[i++] = arr2[b++];
            }
        }



        System.out.println(Arrays.toString(newArray));
    }


}
