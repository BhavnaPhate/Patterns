package logicalProgramming;

import java.util.Scanner;

public class Star11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int num=sc.nextInt();
		
		for(int i=1; i<=num; i++ ) {
			
			for(int j=i; j>1;j--) {
				System.out.print("  ");
			}
			for(int k=num; k>=i; k--) {
				System.out.print("* ");
			}
			System.out.println();
	}
	}

}
