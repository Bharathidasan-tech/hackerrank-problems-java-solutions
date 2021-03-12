package com.cnsi.hacker.solutions;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Solution1 {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		double d = scan.nextDouble();
		scan.nextLine();
		String s = scan.nextLine();

		d = Double.valueOf(d);
		i = Integer.valueOf(i);
		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);

		String str = "0000048938493843894";
		String pattern = "###,###";
		DecimalFormat myFormatter = new DecimalFormat(pattern);
		String output = myFormatter.format(Double.parseDouble(str));
		System.out.println(output);

	}

}
