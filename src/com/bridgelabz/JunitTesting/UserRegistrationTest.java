package com.bridgelabz.JunitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {

	@Test
	void test() {
		UserRegistration userRegistration = new UserRegistration();

		@Test
		public void givenFirstName_WhenProper_ShouldReturnTrue() {
			boolean result = UserRegistration.firstName("Xyz");
			Assert.assertEquals(true, result);
		}

		@Test
		public void givenFirstName_WhenNotProper_ShouldReturnFlase() {
			boolean result = UserRegistration.firstName("Xyz");
			Assert.assertEquals(false, result);
		
	
	}

}
