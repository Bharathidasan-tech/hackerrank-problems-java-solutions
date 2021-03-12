package com.cnsi.hacker.solutions;

import java.util.Scanner;

public class LoopTwoExample {

	
	public static void main(String[] args) {

		// String display start

		String[] str = { "abc", "asdf", "bharathi", "dasn", "ktm", "java", "spring" };
		for (int i = 0, j = str.length - 1; i <= j; i++, j--) {
			System.out.println(str[i]);
			if (i != j) {
				System.out.println(str[j]);
			}
		}
		// string display end

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();

			int outPutVal = 0;
			for (int j = 0; j < n; j++) {
				if (j == 0) {
					outPutVal = outPutVal + (a + ((int) Math.pow(2, j) * b));
				} else {
					outPutVal = outPutVal + ((int) Math.pow(2, j) * b);
				}
				System.out.print(outPutVal + " ");
			}
			System.out.println();
		}
		in.close();

	}

}
