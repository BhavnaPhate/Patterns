package logicalProgramming;

import java.util.Scanner;

public class Star4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int num=sc.nextInt();
		
		for(int i=1; i<=num; i++ ) {
			
			for(int j=num-i; j>=1; j--) {
				System.out.print("  ");
			}
			for(int k=1; k<i; k++) {
				System.out.print("* ");
			}
			System.out.println();
	}
}
}
