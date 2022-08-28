package bult_in.util;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		String str = "100,200,300,400";
		StringTokenizer st = new StringTokenizer(str, ",");
		
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		String exp = "x=100*(100+10)/3";
		StringTokenizer st2 = new StringTokenizer(exp, "x=*-+/()", false);
		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
	}
}
