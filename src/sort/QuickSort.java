package sort;

import javax.net.ssl.SSLEngineResult.Status;

import sun.net.www.content.text.plain;

public class QuickSort {
	
	public static void exchange(int[] arr, int x,int y){
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
	
	public static void sort(int[] arr, int q,int r){
		if(q<r){
			int i=q,j=q+1;
			while(j<=r){
				//如果 j当前比较元素位置， 小于 arr[q] 则 i+1(即第一个比主元大的位置) 与 j交换,并i++
				if(arr[j]< arr[q]){
					exchange(arr,i+1, j);
					i++;
				}
				j++;
			}
			exchange(arr,i, q);
			sort(arr, q, i-1);
			sort(arr, i+1, r);
		}
	}
	
	
}
