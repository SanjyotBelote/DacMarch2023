package org.example.main;

import java.util.Arrays;

public class Program7 {
	//Array Index Out Of BoundsException
	public static void main(String[] args) {
		int[] arr = new int[ ] { 5, 10, 15 };
		int element = arr[ arr.length ];	
		System.out.println( element );
	}
	//Array Index Out Of Bounds Exception
	public static void main2(String[] args) {
		int[] arr = new int[ ] { 20, 25, 30 };
		int element = arr[ 3 ];
		System.out.println( element );
	}
	//Array Index Out Of Bounds Exception
	public static void main1(String[] args) {
		int[] arr = new int[ ] { 10, 20, 30 };
		int element = arr[ -1 ];	
		System.out.println( element );
	}
}
