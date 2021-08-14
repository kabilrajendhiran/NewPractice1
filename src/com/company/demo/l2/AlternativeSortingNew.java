package com.company.demo.l2;

import java.util.Arrays;

public class AlternativeSortingNew {

    QuickSort quickSort = new QuickSort();

    int loopCount = 0;

    public void sortArr(int[] arr)
    {

        int n = arr.length;
        insertionSort(arr);

        for (int i = 0; i < n; i=i+2) {

            int j =n-1;
            int temp = arr[n-1];
            while (j>i)
            {
                arr[j--] = arr[j];
                loopCount++;
            }
            arr[i] = temp;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("loopCount = " + loopCount);
    }

    public void insertionSort(int[] arr)
    {
        for (int i = 1; i < arr.length; i++) {
            int j = i-1;
            int k = arr[i];

            while (j>=0 && k< arr[j])
            {
                loopCount++;
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = k;
        }
    }

    private void swap(int i, int j, int[] arr)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
