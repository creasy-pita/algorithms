package com.creasypita.sort;

/**
 * Created by lujq on 7/8/2023.
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] a = {3,4,2,9,8};
//        int[] a = {2,3,4,8,9};
        sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void sort(int[] a){
        // 总共要经过 N-1 轮比较
        for (int i = 0; i < a.length - 1; i++) {
            //先初始最小索引的为i
            int minIndex = i;
            // 每轮需要比较的次数 N-i-1
            for (int j = i + 1; j < a.length; j++) {
                if (a[minIndex] > a[j]) {
                    minIndex = j ;
                }
            }
            //放到本次得到的最小的数排好序队列的末尾
            if (i != minIndex) {
                int temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
        }
    }
}
