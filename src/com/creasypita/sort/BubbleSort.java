package com.creasypita.sort;

/**
 * Created by lujq on 7/8/2023.
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] a = {3,4,2,9,8};
        sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void sort(int[] a){
        for (int i = 0; i < a.length - 1; i++) {
            /**
             重点是相邻元素j和j+1比较，那么j的边界在哪里，这里去感受下，是 a.length - 1 -i,
             而不是 a.length -i;
             */
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
