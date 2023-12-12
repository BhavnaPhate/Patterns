package logicalProgramming;

import java.util.Scanner;

public class PyramidPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		int num=sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println("  ");
		}
		for(int i=num-1; i>=1; i--) {
			
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println("  ");
		}
	}
}
