package Basic;

import java.util.Scanner;

public class gcdLcm {

	public static void gcd(int n1, int n2) {
		int oriN1 = n1;
		int oriN2 = n2;
		
		while (n1%n2 != 0) {
			int rem = n1%n2;
			n2 = rem;
			n1 = n2;
		}
		int gcd = n2;
		int lcm = (oriN1 * oriN2) / gcd;
		System.out.println("GCD:" + gcd + "LCM:" + lcm);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		gcd(n1, n2);
	}
}
