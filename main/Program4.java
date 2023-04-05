package org.example.main;

import java.util.Scanner;

public class Program4 {
	static Scanner sc = new Scanner(System.in);
	private static void acceptRecord(int[] arr) {
		if( arr != null ) {// if there is no null then execution begins
			for( int index = 0; index < arr.length; ++ index ) {
				System.out.print("Enter element	:	");
				arr[ index ] = sc.nextInt();
			}
		}
	}
	private static void printRecord(int[] arr) {
		if( arr != null ) {//if there is no null then execution begins
			for( int index = 0; index < arr.length; ++ index )
				System.out.print( arr[ index ]+"	");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		//int[] arr = null;
		int[] arr = new int[ 3 ];
	
		Program.acceptRecord( arr );
	
		Program.printRecord(arr);
	}
	public static void main1(String[] args) {
		int[] arr = new int[ 3 ];
		
		for( int index = 0; index < arr.length; ++ index ) {
			System.out.print("Enter element	:	");
			arr[ index ] = sc.nextInt();
		}
		Program.printRecord(arr);
	}
}
