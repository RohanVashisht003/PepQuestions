package RecursionInArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class subsequencesOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		ArrayList<String> ans = gss(str);
		System.out.println(ans);
	}	

	public static ArrayList<String> gss(String str) {
		if (str.length() == 0) {
			ArrayList<String> bres = new ArrayList<String>();
			bres.add("");
			return bres;
		}

		char currchar = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> rres = gss(ros);
		ArrayList<String> mres = new ArrayList<String>();
		for (String rstr : rres) {
			mres.add("" + rstr);

		}
		for (String rstr : rres) {
			mres.add(currchar + rstr);
		}
		return mres;
	}
}
