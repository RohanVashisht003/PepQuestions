package Recursion;

import java.util.Scanner;

public class factorial {

	public static int factorial(int n) {
		if (n == 1) {
			return n;
		}
		int f1 = factorial(n - 1);
		int ans = f1 * n;
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int ans = factorial(n1);
		System.out.println(ans);
	}

}
