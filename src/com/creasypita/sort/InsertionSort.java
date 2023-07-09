package com.creasypita.sort;

import java.util.Arrays;

/**
 * Created by lujq on 7/9/2023.
 */
public class InsertionSort {

    public static void main(String[] args) throws Exception {
        int[] a = {3,4,2,9,8};
//        int[] a = {2,3,4,8,9};
        int[] reArr = sort(a);
        for (int i = 0; i < reArr.length; i++) {
            System.out.println(reArr[i]);
        }
    }

    public static int[] sort(int[] sourceArray) throws Exception {
        // 对 arr 进行拷贝，不改变参数内容
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        int temp;
        // 从下标为1的元素开始选择合适的位置插入，因为下标为0的只有一个元素，默认是有序的
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            int j = i - 1;
            //从i的前一个（最右边）的元素开始比较,小于的向右移动一位
            //这里的边界是 从i-1开始到0与tmp比较
            while (j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }

    // v1
    public static int[] sort1(int[] sourceArray) throws Exception {
        // 对 arr 进行拷贝，不改变参数内容
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        /**
         * 外层i -> [1,n)
         * 内层j 从 i-1开始，如果a[i]大于等于a[j]则结束比较，然后从 到 0
         */
        for (int i = 1; i < arr.length; i++) {
            int j;
            for (j = i - 1; j >= -1; j--) {
                if (j == -1 || arr[i] >= arr[j]) {
                    break;
                }
            }
            //sourceArray[i]存储到temp; [j+1,i-1] 的值往后移一个位移；sourceArray[i]插入到a[j+1];
            int temp = arr[i];
            for (int m = i - 1; m >= j + 1 ; m--) {
                arr[m + 1] = arr[m];
            }
            arr[j+1] = temp;
        }
        return arr;
    }
}
