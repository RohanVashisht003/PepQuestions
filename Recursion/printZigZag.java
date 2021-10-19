package Recursion;

import java.util.Scanner;

public class printZigZag {

	public static void pzz(int n) {
		if(n==0) {
			return;
		}
		System.out.print("pre"+n+" ");
		pzz(n-1);
		System.out.print("in"+n+" ");
		pzz(n-1);
		System.out.print("post"+n+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		pzz(x);
	}

}
