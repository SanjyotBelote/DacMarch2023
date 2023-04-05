package org.example.main;
import java.util.Scanner;

public class Program2{
	static Scanner sc = new Scanner(System.in);
		@SuppressWarnings("unused")
		private static void printRecord(int[] arr){
				for(int index = 0;index<arr.length;++index)
			//	length is property which returns 
				System.out.println(arr [index]);
				
	}
		public static void main(String [] args){
		int arr[] =new int [ ] {10,20,30};//allocated at heap
		Object arr1;
		Program.printRecord( arr1 );//arr allocated at stack
		
		int arr1[] =new int [ ] {10,20,30};//allocated at heap
		Program.printRecord( arr1 );
		int arr2[] =new int [ ] {10,20,30,50,60};//allocated at heap
		Program.printRecord( arr2 );
		int arr3[] =new int [ ] {10,20,30,50};//allocated at heap
		Program.printRecord( arr3 );
		}
		
		public static void main2(String [] args) {
			int arr[] =new int [ ] {10,20,30};
			for(int index = 0;index<3;++index)
				
				System.out.println(arr [index]);			
		}

		public static void main1(String[ ] args){
			int arr[] ={10,20,30};
		}	
}
