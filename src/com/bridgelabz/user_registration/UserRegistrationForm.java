package com.bridgelabz.user_registration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationForm {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws InvalidUserDetailsException {
		// Master
		System.out.println("Welcome to User Registration program");
		UserRegistrationForm urf = new UserRegistrationForm();
		System.out.println("Please enter your First Name: ");
		String firstName = sc.nextLine();
		urf.checkFirstName(firstName);

		System.out.println("Please enter your Last Name: ");
		String lastName = sc.nextLine();
		urf.checkLastName(lastName);

		System.out.println("Please enter your Email Address: ");
		String email = sc.nextLine();
		urf.checkEmailAddress(email);

		System.out.println("Please enter your Mobile Number: ");
		String mobileNumber = sc.nextLine();
		urf.checkMobileNumber(mobileNumber);

		System.out.println("Please enter your Password: ");
		String password = sc.nextLine();
		urf.checkPassword(password);
		System.out.println("Thank you for using Registering user!");
		sc.close();
	}

	public boolean checkPassword(String password) throws InvalidUserDetailsException {
		// Password:
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
		boolean flag = false;

		if (passwordCheck) {
			if (count == 0 || count > 1) {
				throw new InvalidUserDetailsException("Sorry! you have entered invalid Password");

			} else {
				flag = true;
				System.out.println("Fantastic! You have entered valid Password");
			}
		} else {
			throw new InvalidUserDetailsException("Sorry! you have entered invalid Password");
		}
		return flag;

	}

	public boolean checkMobileNumber(String mobileNumber) throws InvalidUserDetailsException {
		// UC4: Mobile Number
		String mobileNumberPattern = "^[+91]{3,}[ ][0-9]{10}$";
		boolean mnCheck = Pattern.matches(mobileNumberPattern, mobileNumber);
		if (mnCheck) {
			System.out.println("Flabbergasted! You have entered valid Mobile Number");
		} else {
			throw new InvalidUserDetailsException("Sorry! you have entered invalid Mobile Number");
		}
		return mnCheck;
	}

	public boolean checkEmailAddress(String email) throws InvalidUserDetailsException {
		// UC3: Email
		String emailPattern = "^[a-z0-9]{3,}[+.-]?[a-z0-9]{0,}[@]{1,}[a-z0-9]{1,}[.]{1,}([a-z]{0,}[.]{0,})[a-z]{2,}$";
		/*
		 * UC9:Email Sample to check abc@yahoo.com abc-100@yahoo.com abc.100@yahoo.com
		 * abc111@abc.com abc-100@abc.net abc.100@abc.com.au abc@1.com abc@gmail.co
		 * abc+100@gmail.com
		 */
		boolean emailCheck = Pattern.matches(emailPattern, email);
		if (emailCheck) {
			System.out.println("Wonderfull! You have entered valid Email Address");
		} else {
			throw new InvalidUserDetailsException("Sorry! you have entered invalid Email Address");
		}
		return emailCheck;

	}

	public boolean checkLastName(String lastName) throws InvalidUserDetailsException {
		// UC2:Last Name
		boolean lastNameCheck = Pattern.matches("^[A-Z][a-z]{2,}$", lastName);
		if (lastNameCheck) {
			System.out.println("Fantastic! You have entered valid Last Name");
		} else {
			throw new InvalidUserDetailsException("Sorry! you have entered invalid Last Name");
		}
		return lastNameCheck;

	}

	public boolean checkFirstName(String firstName) throws InvalidUserDetailsException {
		// UC1:First Name
		boolean res = Pattern.matches("^[A-Z][a-z]{2,}$", firstName);
		if (res) {
			System.out.println("Awesome! You have entered valid First Name");
		} else {
			throw new InvalidUserDetailsException("Sorry! you have entered invalid First Name");
		}
		return res;

	}
}
