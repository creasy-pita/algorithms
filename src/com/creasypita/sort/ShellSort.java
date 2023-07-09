package com.creasypita.sort;

import java.util.Arrays;

/**
 * Created by lujq on 7/9/2023.
 */
public class ShellSort {

    public static void main(String[] args) throws Exception {
        int[] a = {3,4,2,9,8};
//        int[] a = {2,3,4,8,9};
        int[] reArr = sort(a);
        for (int i = 0; i < reArr.length; i++) {
            System.out.println(reArr[i]);
        }
    }

    public static int[] sort(int[] sourceArray) {
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        int length = arr.length;
        int temp;
        //增量从length/2开始，每次/2递减
        for (int step = length / 2; step >= 1; step = step / 2) {
            //上一个元素有step的距离
            for (int i = step; i < length; i++) {
                temp = arr[i];
                int j = i - step;
                while (j >= 0 && temp < arr[j]) {
                    arr[j + step] = arr[j];
                    j -= step;
                }
                arr[j + step] = temp;
            }
        }
        return arr;
    }
}
