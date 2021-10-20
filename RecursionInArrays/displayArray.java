package RecursionInArrays;

import java.util.Scanner;

public class displayArray {

	public static void printing(int arr[], int vidx) {
		if (vidx == arr.length) {
			return;
		}
		System.out.println(arr[vidx] + " ");
		printing(arr, vidx + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int arr[] = new int[x];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		printing(arr, 0);
	}

}
