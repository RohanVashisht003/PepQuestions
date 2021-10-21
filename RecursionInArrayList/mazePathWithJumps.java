package RecursionInArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class mazePathWithJumps {

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
		ArrayList<String> diagonal = new ArrayList<>();

		ArrayList<String> paths = new ArrayList<>();

		for (int ms = 1; ms <= dc - sc; ms++) {
			horizontal = getMazePaths(sr, sc + ms, dr, dc);

			for (String hori : horizontal) {
				paths.add("h" + ms + hori);
			}
		}
		for (int ms = 1; ms <= dr - sr; ms++) {
			vertical = getMazePaths(sr + ms, sc, dr, dc);

			for (String verti : vertical) {
				paths.add("v" + ms + verti);
			}
		}
		for (int ms = 1; ms <= dc - sc && ms <= dr - sr; ms++) {

			diagonal = getMazePaths(sr + ms, sc + ms, dr, dc);

			for (String diag : diagonal) {
				paths.add("d" + ms + diag);
			}
		}

		return paths;
	}
}
