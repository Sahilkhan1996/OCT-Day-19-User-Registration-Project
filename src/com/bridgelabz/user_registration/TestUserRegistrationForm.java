package com.bridgelabz.user_registration;

import org.junit.Assert;
import org.junit.Test;

public class TestUserRegistrationForm {

//UC10: all the methods which ends with 2 are sad methods and without 2 are happy methods
	UserRegistrationForm ur = new UserRegistrationForm();

	@Test
	public void testFirstName() throws InvalidUserDetailsException {
		String name = "Sahil";
		Assert.assertEquals(true, ur.checkFirstName(name)); // org.junit and select object class
	}

	@Test
	public void testFirstName2() throws InvalidUserDetailsException {
		String name = "sahil";
		Assert.assertNotEquals(true, ur.checkFirstName(name)); // org.junit and select object class
	}

	@Test
	public void testLastName() throws InvalidUserDetailsException {
		String name = "Khan";
		Assert.assertEquals(true, ur.checkLastName(name)); // org.junit and select object class
	}

	@Test
	public void testLastName2() throws InvalidUserDetailsException {
		String name = "khan";
		Assert.assertNotEquals(true, ur.checkLastName(name)); // org.junit and select object class
	}

	@Test
	public void testEmailAddress() throws InvalidUserDetailsException {
		String name = "sahilkhan199655@gmail.com";
		Assert.assertEquals(true, ur.checkEmailAddress(name)); // org.junit and select object class
	}

	@Test
	public void testEmailAddress2() throws InvalidUserDetailsException {
		String name = "Sahilkhan199655@gmail.com";
		Assert.assertNotEquals(true, ur.checkEmailAddress(name)); // org.junit and select object class
	}

	@Test
	public void testMobileNumber() throws InvalidUserDetailsException {
		String name = "+91 7775035369";
		Assert.assertEquals(true, ur.checkMobileNumber(name)); // org.junit and select object class
	}

	@Test
	public void testMobileNumber2() throws InvalidUserDetailsException {
		String name = "+91 77775035369";
		Assert.assertNotEquals(true, ur.checkMobileNumber(name)); // org.junit and select object class
	}

	@Test
	public void testPassword() throws InvalidUserDetailsException {
		String name = "Sahil7#12";
		Assert.assertEquals(true, ur.checkPassword(name)); // org.junit and select object class
	}

	@Test
	public void testPassword2() throws InvalidUserDetailsException {
		String name = "Sahil7##12";
		Assert.assertNotEquals(true, ur.checkPassword(name)); // org.junit and select object class
	}

}
