package RecursionInArrays;

import java.util.Scanner;

public class allIndicesOfArray {

	public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
		if (idx == arr.length) {
			return new int[fsf];
		}
		int[] iarr;
		if (x == arr[idx]) {
			iarr = allIndices(arr, x, idx + 1, fsf + 1);
			iarr[fsf] = idx;
		} else {
			iarr = allIndices(arr, x, idx + 1, fsf);
		}
		return iarr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int arr[] = new int[x];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int n = scn.nextInt();
		int ans[] = allIndices(arr, n, 0,0);
		for (int i = 0; i < ans.length; i++) {
		System.out.println(ans[i]);
		}
		
	}

}
