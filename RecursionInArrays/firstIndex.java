package RecursionInArrays;

import java.util.Scanner;

public class firstIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int arr[] = new int[x];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int n = scn.nextInt();
		System.out.println(firstIndex(arr, 0, n));
	}

	public static int firstIndex(int[] arr, int idx, int x) {
		if (idx == arr.length) {
			return -1;
		}
		if (x == arr[idx]) {
			return idx;
		}
		int ans = firstIndex(arr, idx + 1, x);
		return ans;

	}

}
