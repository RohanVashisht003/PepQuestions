package RecursionInArrays;

import java.util.Scanner;

public class lastIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int arr[] = new int[x];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int n = scn.nextInt();
		System.out.println(lastIndex(arr, 0, n));
	}

	public static int lastIndex(int[] arr, int idx, int x) {
		if (idx == arr.length) {
			return -1;
		}
		int ans = lastIndex(arr, idx + 1, x);
		if (x == arr[idx] && ans == -1) {
			return idx;
		}

		return ans;
	}

}
