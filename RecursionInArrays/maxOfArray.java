package RecursionInArrays;

import java.util.Scanner;

public class maxOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int arr[] = new int[x];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println(maxOfArray(arr, 0));
	}

	public static int maxOfArray(int[] arr, int idx) {
		if (idx == arr.length - 1) {
			return arr[idx];
		}

		int currMax = maxOfArray(arr, idx + 1);
		if (currMax < arr[idx]) {
			currMax = arr[idx];
		}
		return currMax;
	}

}
