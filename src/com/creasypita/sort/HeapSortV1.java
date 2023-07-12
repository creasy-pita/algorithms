package com.creasypita.sort;

import com.creasypita.Util.RadomIntUtils;

import java.util.Arrays;

/**
 * 大堆排序， 排序结果从小到大
 */
public class HeapSortV1 {

    public static void main(String[] args) {
        int n = 20;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = RadomIntUtils.randInt(0, 100);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        int[] reArr = sort(a);
        System.out.println("------------------------------------------------------------");
        for (int i = 0; i < reArr.length; i++) {
            System.out.println(reArr[i]);
        }
//        Long startTime = System.currentTimeMillis();
//        int[] reArr = sort(a);
//        Long endTime = System.currentTimeMillis();
//        Long elapsedTime = (endTime - startTime) ;
//        System.out.println("该段总共耗时：" + elapsedTime + "ms");
    }

    public static int[] sort(int[] sourceArray)  {
        // 对 arr 进行拷贝，不改变参数内容
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

        int len = arr.length;

        buildMaxHeap(arr, len);

        for (int i = len - 1; i > 0; i--) {
            swap(arr, 0, i);
            len--;
            heapify(arr, 0, len);
        }
        return arr;
    }

    private static void buildMaxHeap(int[] arr, int len) {
//     从中间位置到首位进行遍历，每一趟以i位置为首位构造大根堆
        for (int i = (int) Math.floor(len / 2); i >= 0; i--) {
            heapify(arr, i, len);
        }
    }

    /**
     * 构造最大堆（通过节点i元素下降的方式）
     * @param arr
     * @param i
     * @param len
     */
    private static void heapify(int[] arr, int i, int len) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;

        if (left < len && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < len && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, largest, len);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
