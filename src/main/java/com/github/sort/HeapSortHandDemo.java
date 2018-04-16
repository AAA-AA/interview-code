package com.github.sort;

import java.util.Arrays;

/**
 * @author : hongqiangren.
 * @since: 2018/4/16 23:34
 */
public class HeapSortHandDemo {

    public static void main(String[] args) {
        int[] arr = {11,7,18,3,5,4,10,9};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void sort(int[] arr) {
        //1.构建堆
        for (int i = arr.length/2 -1;i >=0;i--) {
            adjustHeap(arr,i,arr.length);
        }
        //2.交换后继续调整堆
        for (int i = arr.length-1;i >=arr.length-2;i--) {
            swap(arr,0,i);
            adjustHeap(arr,0,i);
        }
    }

    private static void swap(int[] arr, int i, int m) {
        int temp = arr[i];
        arr[i] = arr[m];
        arr[m] = temp;
    }

    private static void adjustHeap(int[] arr, int i, int length) {//交换后每次调整时size会减一
        int temp = arr[i];
        for(int k = 2*i+1;k < length; k = 2*k+1) {
            if (k+1 < length && arr[k] < arr[k+1]) {
                k++;
            }
            if (arr[k] > temp) {
                arr[i] = arr[k];
                i = k;
            }
        }
        arr[i] = temp;
    }
}
