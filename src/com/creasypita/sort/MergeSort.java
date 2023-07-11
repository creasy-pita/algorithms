package com.creasypita.sort;

import com.creasypita.Util.RadomIntUtils;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int n = 20;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = RadomIntUtils.randInt(0, 100);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("------------------------------------------------------------");
        int[] reArr = sort(a);
        for (int i = 0; i < reArr.length; i++) {
            System.out.println(reArr[i]);
        }
    }

    public static int[] sort(int[] sourceArr) {
        int[] arr = Arrays.copyOf(sourceArr, sourceArr.length);
        sort(arr, 0, arr.length - 1);
        return arr;
    }

    /**
     *
     * @param sourceArr
     * @param left 左边界（起始）索引位置
     * @param right 右边界（结束）索引位置
     * @return
     */
    public static void sort(int[] sourceArr, int left, int right) {
        if (left == right) {
            return;
        }
        //middle 取中间值， 注意不是 right-middle /2,这样就走不到递归出口了
        int middle = (right + left) / 2;
        sort(sourceArr, left, middle);
        sort(sourceArr, middle + 1, right);
        merge(sourceArr, left, middle, right);

    }

    /**
     * 两个有序子序列进行合并排序，返回一个有序序列
     * @param sourceArr
     * @param left left->middle为合并排序左半部分
     * @param middle
     * @param right middle+1 到 right 为合并排序右半部分
     * @return
     */
    public static void merge(int[] sourceArr, int left, int middle, int right) {
        int[] tempArr = new int[right - left + 1];
        int i = left, j = middle + 1;
        int m = 0;
        while (i <= middle && j <= right) {
            if (sourceArr[i] <= sourceArr[j]) {
                tempArr[m++] = sourceArr[i++];
            } else {
                tempArr[m++] = sourceArr[j++];
            }

        }
        while (i <= middle) {
            tempArr[m++] = sourceArr[i++];
        }
        while (j <= right) {
            tempArr[m++] = sourceArr[j++];
        }
        i = 0;
        // 回填排好序的部分
        for (int k = left; k <= right; k++) {
            sourceArr[k] = tempArr[i++];
        }
    }
}
