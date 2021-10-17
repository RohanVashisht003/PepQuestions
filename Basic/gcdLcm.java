package Basic;

import java.util.Scanner;

public class gcdLcm {

	public static int gcd(int n1, int n2) {
		 int rem=0;
		while(n1%n2!=0) {
			rem = n1%n2;
			n1 = rem;
			n2 = n1;
		}
		return rem;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		System.out.println(gcd(n1,n2));
	}

}
