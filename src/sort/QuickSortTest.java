//package sort;
//
//import org.junit.Test;
//
//import edu.princeton.cs.introcs.In;
//import edu.princeton.cs.introcs.StdDraw;
//import edu.princeton.cs.introcs.StdIn;
//import edu.princeton.cs.introcs.StdOut;
//import edu.princeton.cs.introcs.StdRandom;
//import edu.princeton.cs.introcs.StdStats;
//
//public class QuickSortTest {
//
//	public void Test1(){
//		int[] arr= {6,3,2,9,30,5,8,4,19,13,1};
//
//		Quick.sort(arr, 0, arr.length-1);
//		for (int i : arr) {
//			System.out.println(i);
//		}
//	}
//
//	@Test
//	public void Test(){
//
//		Integer[] a = {6,3,2,9,30,5,8,4,191,1};
//		Quick.sort(a);
//		for (int i : a) {
//			System.out.print("->"+i);
//		}
//		StdRandom.shuffle(a);
//		for (int i : a) {
//			System.out.print("->"+i);
//		}
//		int n=100;
///*		StdDraw.setXscale(0,n);
//		StdDraw.setYscale(0,n*n);
//		StdDraw.setPenRadius(.01);
//		StdDraw.setPenColor(150,130,180);
//		for(int i=0;i<100;i++){
//			StdDraw.point(i, i);
//			StdDraw.point(i, i*i);
//			StdDraw.point(i, i*Math.log(i));
//		}
//		StdDraw.show(10000);*/
//
//	}
//}
