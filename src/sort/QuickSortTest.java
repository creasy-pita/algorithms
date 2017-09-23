package sort;

import org.junit.Test;

public class QuickSortTest {
	@Test
	public void Test(){
		int[] arr= {6,3,2,9,30,5,8,4,19,13,1};
		
		QuickSort.sort(arr, 0, arr.length-1);
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
