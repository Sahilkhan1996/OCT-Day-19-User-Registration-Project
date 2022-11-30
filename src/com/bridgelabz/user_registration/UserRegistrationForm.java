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
		String firstName = sc.nextLine();
		boolean res = Pattern.matches("^[A-Z][a-z]{2,}$", firstName);
		if (res) {
			System.out.println("Awesome! You have entered valid First Name");
		} else {
			System.out.println("Sorry! you have entered invalid First Name");
		}

		// UC2:Last Name
		System.out.println("Please enter your Last Name: ");
		String lastName = sc.nextLine();
		boolean lastNameCheck = Pattern.matches("^[A-Z][a-z]{2,}$", lastName);
		if (lastNameCheck) {
			System.out.println("Fantastic! You have entered valid Last Name");
		} else {
			System.out.println("Sorry! you have entered invalid Last Name");
		}

		// UC3: Email
		System.out.println("Please enter your Email Address: ");
		String email = sc.nextLine();
		String emailPattern = "^[a-z0-9]{3,}[+.-]?[a-z0-9]{0,}[@]{1,}[a-z0-9]{1,}[.]{1,}([a-z]{0,}[.]{0,})[a-z]{2,}$";
		boolean emailCheck = Pattern.matches(emailPattern, email);
		if (emailCheck) {
			System.out.println("Wonderfull! You have entered valid Email Address");
		} else {
			System.out.println("Sorry! you have entered invalid Email Address");
		}

		// UC4: Mobile Number
		System.out.println("Please enter your Mobile Number: ");
		String mobileNumber = sc.nextLine();
		String mobileNumberPattern = "^[+91]{3,}[ ][0-9]{10}$";
		boolean mnCheck = Pattern.matches(mobileNumberPattern, mobileNumber);
		if (mnCheck) {
			System.out.println("Flabbergasted! You have entered valid Mobile Number");
		} else {
			System.out.println("Sorry! you have entered invalid Mobile Number");
		}

		// Password:
		System.out.println("Please enter your Password: ");
		String password = sc.nextLine();
		// UC5: Password with the rule of minimum 8 characters
		// String passwordPattern="[A-Za-z0-9]{8,}$"; should have minimum 8 characters

		// UC6: Password with the rule of minimum 1 capital letter
		// String passwordPattern="^(?=.*[A-Z])([A-Za-z0-9]){8,}$";

		// UC7: Password with the rule of minimum 1 number in the password
		// String passwordPattern="^(?=.*[0-9])(?=.*[A-Z])([A-Za-z0-9]){8,}$";

		// UC8:Password with the rule of only 1 special character
		String passwordPattern = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[~!@#$%^&*()<>:{},.;'])([A-Za-z0-9~!@#$%^&*()<>:{},.;']){8,}$";
		boolean passwordCheck = Pattern.matches(passwordPattern, password);
		int count = 0;
		for (int i = 0; i < password.length(); i++) {
			if (!Character.isDigit(password.charAt(i)) && !Character.isLetter(password.charAt(i))
					&& !Character.isWhitespace(password.charAt(i))) {
				count++;
			}
		}

		if (passwordCheck) {
			if (count == 0 || count > 1) {
				System.out.println("Sorry! you have entered invalid Password");
			} else {
				System.out.println("Fantastic! You have entered valid Password");
			}
		} else {
			System.out.println("Sorry! you have entered invalid Password");
		}
		sc.close();
	}
}
