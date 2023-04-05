package org.example.main;

public class Program {
	private static void printRecord(int[] arr) {
		if (arr != null) {
			for( int element : arr )  ///print with for int
				System.out.print(element+"	");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 100, 20, 50 };
		Program.printRecord(arr); // create a copy 
	}
}
