package com.creasypita.sort;

import com.creasypita.Util.RadomIntUtils;

import java.util.Arrays;

/**
 * 需要频发创建数组，效率差
 */

public class MergeSortV2 {

    public static void main(String[] args) throws Exception {
        int n = 200000;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = RadomIntUtils.randInt(0, 100);
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

    public static int[] sort(int[] sourceArray) throws Exception {
        // 对 arr 进行拷贝，不改变参数内容 需要频发创建数组，效率差
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

        if (arr.length < 2) {
            return arr;
        }
        int middle = (int) Math.floor(arr.length / 2);

        int[] left = Arrays.copyOfRange(arr, 0, middle);
        int[] right = Arrays.copyOfRange(arr, middle, arr.length);

        return merge(sort(left), sort(right));
    }

    protected static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0;
        while (left.length > 0 && right.length > 0) {
            if (left[0] <= right[0]) {
                result[i++] = left[0];
                left = Arrays.copyOfRange(left, 1, left.length);
            } else {
                result[i++] = right[0];
                right = Arrays.copyOfRange(right, 1, right.length);
            }
        }

        while (left.length > 0) {
            result[i++] = left[0];
            left = Arrays.copyOfRange(left, 1, left.length);
        }

        while (right.length > 0) {
            result[i++] = right[0];
            right = Arrays.copyOfRange(right, 1, right.length);
        }

        return result;
    }
}
