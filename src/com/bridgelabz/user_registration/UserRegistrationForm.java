package com.bridgelabz.user_registration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationForm {
	public static void main(String[] args) {
		// Master
		System.out.println("Welcome to User Registration program");
		// UC1:First Name
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your First Name: ");
		String firstName = sc.next();
		boolean res = Pattern.matches("^[A-Z][a-z]{2,}$", firstName);
		if (res) {
			System.out.println("Awesome! You have entered valid First Name");
		} else {
			System.out.println("Sorry! you have entered invalid First Name");
		}

		// UC2:Last Name
		System.out.println("Please enter your Last Name: ");
		String lastName = sc.next();
		boolean res1 = Pattern.matches("^[A-Z][a-z]{2,}$", lastName);
		if (res1) {
			System.out.println("Fantastic! You have entered valid Last Name");
		} else {
			System.out.println("Sorry! you have entered invalid Last Name");
		}
		sc.close();
	}
}
