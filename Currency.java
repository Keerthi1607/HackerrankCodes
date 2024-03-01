package com.hackerrank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Currency {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();

		NumberFormat usFormatter = NumberFormat.getCurrencyInstance(Locale.US);
		String UScurrency = usFormatter.format(payment);
		NumberFormat inFormatter = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
		String Indiacurrency = inFormatter.format(payment);
		NumberFormat chFormatter = NumberFormat.getCurrencyInstance(Locale.CHINA);
		String Chinacurrency = chFormatter.format(payment);
		NumberFormat frFormatter = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		String Francecurrency = frFormatter.format(payment);
		System.out.println("US: " + UScurrency);
		System.out.println("INDIA: " + Indiacurrency);
		System.out.println("CHINA: " + Chinacurrency);
		System.out.println("FRANCE: " + Francecurrency);
	}
}
