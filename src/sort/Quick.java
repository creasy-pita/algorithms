package sort;

import javax.net.ssl.SSLEngineResult.Status;

import sun.net.www.content.text.plain;

public class Quick {
	
	public static void sort(Comparable[] a){
		sort(a, 0, a.length-1);
	}
	
	public static void exch(Comparable[] a,int i,int j){
		Comparable temp=a[i];
		a[i]=a[j];
		a[j] = temp;
	}
	
	public static boolean less(Comparable a,Comparable b){
		return a.compareTo(b)<0;
	}
	
	public static void sort(Comparable[] a, int lo,int hi){
		if(lo<hi){
			int i = partition(a, lo, hi);
			exch(a,i, lo);
			sort(a, lo, i-1);
			sort(a, i+1, hi);
		}
	}
	
	public static int partition(Comparable[] a,int lo,int hi){
		int i=lo,j=lo+1;
		while(j<=hi){
			//如果 j当前比较元素位置， 小于 arr[q] 则 i+1(即第一个比主元大的位置) 与 j交换,并i++
			if(less(a[j], a[lo])){
				exch(a,i+1, j);
				i++;
			}
			j++;
		}
		return i;
	}
	
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
