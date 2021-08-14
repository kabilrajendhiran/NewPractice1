package com.company.demo.l2;

import java.util.Arrays;

public class ArraySortASCDES {


    public void findSolution(int[] arr)
    {
        int idx;
        for (int i = 0; i < arr.length-1; i=i+2) {
             idx = findMaxOddIdx(i,arr);
             swap(i,idx,arr);
             idx = findMinEvenIdx(i+1,arr);
             swap(i+1,idx,arr);
        }
        System.out.println(Arrays.toString(arr));
    }


    public int findMaxOddIdx(int start, int[] arr)
    {
        int max = -99999;
        int idx = start;
        for (int i = start; i < arr.length; i++) {
            if(arr[i]%2!=0)
            {
                if(arr[i]>max)
                {
                    max = arr[i];
                    idx = i;
                }
            }
        }

        return idx;

    }

    public int findMinEvenIdx(int start, int[] arr)
    {
        int min = 99999;
        int idx = start;
        for (int i = start; i < arr.length; i++) {
            if(arr[i]%2==0)
            {
                if(arr[i]<min)
                {
                    min = arr[i];
                    idx = i;
                }
            }
        }

        return idx;

    }

    public void swap(int i,int  j,int[] arr)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
