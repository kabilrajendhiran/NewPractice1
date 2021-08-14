package com.company.demo.l2;

import java.util.Arrays;

public class QuickSort {
    private void swap(int i, int j,int[] arr)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private int partition(int start, int end, int[] arr)
    {
        int i = start -1;
        int pivot = arr[end];

        for (int j = start; j < end-1; j++) {
            if(arr[j]< pivot)
            {
                i++;
                swap(i,j,arr);
            }
        }
        swap(i+1,end,arr);

        return i+1;
    }

    public void quickSort(int start, int end, int[] arr)
    {
        if(start<end)
        {
            int pivot = partition(start,end,arr);
            quickSort(start,pivot-1,arr);
            quickSort(pivot+1,end,arr);
        }

    }
}
