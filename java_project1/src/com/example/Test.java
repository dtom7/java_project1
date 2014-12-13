package com.example;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Test {

	public static void main(String[] args) {
		DateFormat df = DateFormat.getInstance();
		System.out.println("Current date/time is: " + df.format(new Date()));
		System.out.println("Default locale is " + Locale.getDefault());
	}

}
