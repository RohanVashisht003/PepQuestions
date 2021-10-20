package Recursion;

import java.util.Scanner;

public class towerOfHanoi {

	public static void toh(int n, char src, char des, char help) {
		if (n == 0) {
			return;
		}
		toh(n - 1, src, help, des);
		System.out.println("Move" +n+"th disc from "+src + "->" + des);
		toh(n - 1, help, src, des);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		toh(n, 'A', 'B', 'C');
	}

}
