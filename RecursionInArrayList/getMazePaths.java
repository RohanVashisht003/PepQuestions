package RecursionInArrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class getMazePaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int r = scn.nextInt();
		int c = scn.nextInt();
		ArrayList<String> ans = getMazePaths(0, 0, r - 1, c - 1);
		System.out.println(ans);
	}

	public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
		if (sr == dr && sc == dc) {
			ArrayList<String> rstr = new ArrayList<>();
			rstr.add("");
			return rstr;
		}
		ArrayList<String> horizontal = new ArrayList<>();
		ArrayList<String> vertical = new ArrayList<>();
		if (sc < dc) {
			horizontal = getMazePaths(sr, sc + 1, dr, dc);
		}
		if (sr < dr) {
			vertical = getMazePaths(sr + 1, sc, dr, dc);
		}
		ArrayList<String> paths = new ArrayList<>();
		for (String hori : horizontal) {
			paths.add("h" + hori);
		}
		for (String verti : vertical) {
			paths.add("v" + verti);
		}
		return paths;
	}
}
