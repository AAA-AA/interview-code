package com.github.sort;

import java.util.Arrays;

/**
 * @author : hongqiangren.
 * @since: 2018/4/16 17:02
 */
public class HeapSort {


    public static void main(String[] args) {
        int[] arr = {11,7,18,3,5,4,10,9};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void sort(int[] array) {
        //1. 构建大顶堆
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            createHeap(array, i, array.length);
        }
        //2.调整堆结构+交换堆顶元素与末尾元素
        for (int j = array.length - 1; j > 0; j--) {
            swap(array, 0, j);//将堆顶元素与末尾元素进行交换
            createHeap(array, 0, j);//重新对堆进行调整
        }

    }

    private static void createHeap(int[] array, int i, int length) {
        int temp = array[i];
        for (int k = 2 * i + 1; k < length; k = k * 2 + 1) {
            if (k + 1 < length && array[k] < array[k + 1]) {//左节点小于右节点，指针移向右节点
                k++;
            }
            if (array[k] > temp) {
                array[i] = array[k];
                i = k;
            } else {
                break;
            }
        }
        array[i] = temp;//将temp值放到最终的位置
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


}
