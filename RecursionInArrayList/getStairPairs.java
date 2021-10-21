package RecursionInArrayList;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class getStairPairs {

	public static ArrayList<String> getStairPaths(int n) {
		if (n == 0) {
			ArrayList<String> re = new ArrayList<>();
			re.add("");
			return re;
		}
		if (n < 0) {
			ArrayList<String> re = new ArrayList<>();
			return re;
		}
		ArrayList<String> path1 = getStairPaths(n - 1);
		ArrayList<String> path2 = getStairPaths(n - 2);
		ArrayList<String> path3 = getStairPaths(n - 3);
		ArrayList<String> paths = new ArrayList<String>();
		for (String path : path1) {
			paths.add("1" + path);
		}
		for (String path : path2) {
			paths.add("2" + path);
		}
		for (String path : path3) {
			paths.add("3" + path);
		}
		return paths;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<String> ans = getStairPaths(n);
		System.out.println(ans);
	}

}
