package RecursionInArrayList;

import java.util.*;

public class kpc {

	static ArrayList<String> al = new ArrayList<String>(
			Arrays.asList(".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"));

	public static ArrayList<String> getKPC(String str) {
		if (str.length() == 0) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> rstr = getKPC(ros);
		ArrayList<String> mstr = new ArrayList<String>();
		int index = ch-'0';
		String StringfromCh = al.get(index);
		for (int i = 0; i < StringfromCh.length(); i++) {
			char chString = StringfromCh.charAt(i);
			for (String rts : rstr) {
				mstr.add(chString + rts);
			}
		}
		return mstr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		ArrayList<String> ans = getKPC(str);
		System.out.println(ans);
	}

}
