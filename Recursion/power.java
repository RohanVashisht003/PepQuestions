package Recursion;

import java.util.Scanner;

public class power {

	public static int powerLogn(int x, int n) {
		if(n==0) {
			return 1;
		}
		int pnb2 = powerLogn(x, n / 2);
		int xpn = pnb2 * pnb2;
		if (n % 2 != 0) {
			xpn *= x;
		}
		return xpn;
	}

	public static int power(int x, int n) {
		if (n == 0) {
			return 1;
		}
		int ans = x * power(x, n - 1);
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int n = scn.nextInt();
		int ans = powerLogn(x, n);
		System.out.println(ans);
	}

}
