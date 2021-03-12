package com.cnsi.hacker.solutions;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;


public class CurrencyFormatter {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();

		Locale ind_local = new Locale("en", "IN");

		NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat indFormat = NumberFormat.getCurrencyInstance(ind_local);
		NumberFormat chiFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat fraFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

		System.out.println("US " + usFormat.format(payment));
		System.out.println("INDIA  " + indFormat.format(payment));
		System.out.println("CHINA " + chiFormat.format(payment));
		System.out.println("FRANCE " + fraFormat.format(payment));

		scanner.close();
	}

}
