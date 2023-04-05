package org.example.main;

import java.util.Arrays;

public class Program {
	public static void main(String[] args) {
		int[] arr = new int[ ] { 10, 20, 30 };
		System.out.println( Arrays.toString(arr) );
	}
	public static void main2(String[] args) {
		int[] arr = new int[ ] { 10, 20, 30 };
		String str = Arrays.toString(arr);
		System.out.println( str );
	}
	public static void main1(String[] args) {
		boolean[] arr1 = new boolean[3];
		System.out.println( arr1.toString());	//[Z@6d06d69c
		
		byte[] arr2 = new byte[3];
		System.out.println( arr2.toString());	//[B@7852e922
		
		char[] arr3 = new char[3];
		System.out.println( arr3.toString());	//[C@4e25154f

		short[] arr4 = new short[3];
		System.out.println( arr4.toString());	//[S@70dea4e

		int[] arr5 = new int[3];
		System.out.println( arr5.toString());	//[I@5c647e05
		
		float[] arr6 = new float[3];
		System.out.println( arr6.toString());	//[F@33909752

		double[] arr7 = new double[3];
		System.out.println( arr7.toString());	//[D@55f96302

		long[] arr8 = new long[3];
		System.out.println( arr8.toString());	//[J@3d4eac69
		
		String[] arr9 = new String[3];
		System.out.println( arr9.toString());	//[Ljava.lang.String;@42a57993

		int[][] arr10 = new int[3][3];
		System.out.println(arr10.toString());	//[[I@75b84c92
		
		int[][][] arr11 = new int[3][3][3];
		System.out.println(arr11.toString());	//[[[I@6bc7c054
	}
}
