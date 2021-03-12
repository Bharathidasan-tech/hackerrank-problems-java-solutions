package com.cnsi.hacker.solutions;

import java.math.BigInteger;
import java.util.Scanner;


public class PrimeTest {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BigInteger value = scanner.nextBigInteger();

		if (value.isProbablePrime(100)) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}

		/*
		 * if (!bigInt.isProbablePrime(value)) {
		 * if ((value != 0) && (value != 0)) {
		 * for (int i = 2; i < value; i++) {
		 * if ((value % i) == 0) {
		 * System.out.println("not prime");
		 * break;
		 * } else {
		 * System.out.println("prime");
		 * break;
		 * }
		 * }
		 * }
		 * }
		 */

		scanner.close();
	}

}
