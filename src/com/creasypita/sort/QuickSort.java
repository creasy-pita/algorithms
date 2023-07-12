package com.creasypita.sort;

import com.creasypita.Util.RadomIntUtils;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int n = 2000000;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = RadomIntUtils.randInt(0, 10000000);
        }
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
        System.out.println("------------------------------------------------------------");
        Long startTime = System.currentTimeMillis();
        int[] reArr = sort(a);
        Long endTime = System.currentTimeMillis();
        Long elapsedTime = (endTime - startTime) ;
        System.out.println("该段总共耗时：" + elapsedTime + "ms");
//        for (int i = 0; i < reArr.length; i++) {
//            System.out.println(reArr[i]);
//        }
    }

    public static int[] sort(int[] A){
        int[] sourceArr = Arrays.copyOf(A, A.length);
        sort(sourceArr, 0, sourceArr.length -1);
        return sourceArr;
    }

    public static void sort(int[] sourceArr, int left, int right){
        if (left >= right) {
            return;
        }
        int p = partition(sourceArr, left, right);
        sort(sourceArr, left, p -1);
        sort(sourceArr, p+1, right);
    }

    public static int partition(int[] sourceArr, int left, int right){
        int p = (left + right)/2;
        int i = left;
        swap(sourceArr,p,right);
        for (int j = left; j < right; j++) {
            if(sourceArr[j] <= sourceArr[right]){
                swap(sourceArr, i, j);
                i++;
            }
        }
//        swap(sourceArr, p, right);
//        return p;
        swap(sourceArr, i, right);
        return i;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
