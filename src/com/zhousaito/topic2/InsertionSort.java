package com.zhousaito.topic2;

/**
 * Email: zhousaito@163.com
 * Created by zhousaito 2020/4/20 11:59
 * Version: 1.0
 * Description:
 */
//for j = 2 to A.length
//        key = A[j]
//        //Insert A[j] into the sorted sequence A[1..j-1].
//        i = j - 1
//        while i > 0 and A[i] > key
//          A[i+1] = A[i]
//          i = i - 1
//        A[i + 1] = key

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {31, 41, 59, 26, 41, 48};
        insertionSortLow(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    /**
     * 降序
     *
     * @param arr
     */
    public static void insertionSortLow(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
