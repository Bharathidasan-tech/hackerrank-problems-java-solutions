package com.cnsi.hacker.solutions;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class Result {

	public static String findDay(int month, int day, int year) {

		Calendar calc = Calendar.getInstance();

		calc.set(year, month - 1, day);
		Date dayOfWeek = calc.getTime();

		SimpleDateFormat outFormat = new SimpleDateFormat("EEEE");
		String daysName = outFormat.format(dayOfWeek);

		return daysName.toUpperCase();

	}

}

public class FindDay {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Month");
		int month = scanner.nextInt();

		System.out.println("Enter Day");
		int day = scanner.nextInt();

		System.out.println("Enter Year");
		int year = scanner.nextInt();

		String res = Result.findDay(month, day, year);

		System.out.println("The Day Name is = " + res);

	}

}
