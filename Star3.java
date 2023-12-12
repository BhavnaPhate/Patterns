package logicalProgramming;

import java.util.Scanner;

public class Star3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int num=sc.nextInt();
		
		for(int i=1; i<=num; i++ ) {
			
			for(int j=i; j<=num; j++) {
				System.out.print("* ");
			}
			System.out.println();	
		}
	}

}
