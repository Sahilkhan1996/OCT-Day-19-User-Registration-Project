package com.bridgelabz.user_registration;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestEmailAddress {
	boolean expected;
	String input;

	public TestEmailAddress(boolean expected, String input) {
		super();
		this.expected = expected;
		this.input = input;
	}

	@Test
	public void emailTest() {
		UserRegistrationForm form = new UserRegistrationForm();
		Assert.assertEquals(expected, form.checkEmailAddress(input));
	}

	@Parameterized.Parameters
	public static Object squareData() {
		return Arrays.asList(
				new Object[][] { 
					{true, "abc@yahoo.com"},
					{true, "abc-100@yahoo.com"},
					{true, "abc.100@yahoo.com"},
					{true, "abc111@abc.com"},
					{true, "abc-100@abc.net"},
					{true, "abc.100@abc.com.au"},
					{true, "abc@1.com"},
					{true, "abc@gmail.co"},
					{true, "abc+100@gmail.com"},
				});
	}
}
