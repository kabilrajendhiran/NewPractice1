package com.company.demo.l2;

import java.util.Arrays;

public class AlternativeSorting {
    int count1 = 0;
    int count2 = 0;
    int count = 0;

    public void findSolution(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i=i+2) {
            int maxIdx = findMax(i,arr);
            swap(i,maxIdx, arr);
            int minIdx = findMin(i+1, arr);
            swap(i+1,minIdx, arr);
            count++;
        }

        System.out.println(Arrays.toString(arr));

        System.out.println(count+count1+count2);
    }

    private int findMax(int startIdx, int[] arr)
    {
        int maxIdx = 0;
        int max = -99999;

        for (int i = startIdx; i < arr.length; i++) {
            if(max<arr[i])
            {
                max = arr[i];
                maxIdx = i;
            }
            count1++;
        }
        return maxIdx;
    }


    private int findMin(int startIdx, int[] arr)
    {
        int count = 0;
        int minIdx = 0;
        int min = 99999;

        for (int i = startIdx; i < arr.length; i++) {
            if(min>arr[i])
            {
                min = arr[i];
                minIdx = i;
            }
            count2++;
        }
        return minIdx;
    }

    private void swap(int i, int j, int[] arr)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
