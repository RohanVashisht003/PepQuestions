package Recursion;

import java.util.Scanner;

public class printDecreasing {

	public static void recursion(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		recursion(n - 1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		recursion(n1);
	}

}
