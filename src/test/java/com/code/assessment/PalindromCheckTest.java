package com.code.assessment;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.code.assessment.palindrom.PalindromCheck;

@SpringBootTest
public class PalindromCheckTest {

	@Test
	void isPalindromeCheckReturnTrue() {
		boolean actualValue = PalindromCheck.isPalindrome("madam");
		assertTrue(actualValue);
	}
	
	@Test
	void isPalindromeCheckReturnTrueForEmptyString() {
		boolean expectedValue = true;
		boolean actualValue = PalindromCheck.isPalindrome("");
		assertEquals(expectedValue,actualValue);
	}
	
	@Test
	void notPalindromeCheckReturn() {
		boolean expectedValue = false;
		boolean actualValue = PalindromCheck.isPalindrome("apple");
		assertEquals(expectedValue,actualValue);
	}
	
	@Test
	void isPalindromeCheckReturntrue_2() {
		boolean expectedValue = true;
		boolean actualValue = PalindromCheck.isPalindrome("Able was I ere I saw Elba");
		assertEquals(expectedValue,actualValue);
	}
	
	@Test
	void isPalindromeCheckReturntrue_3() {
		boolean expectedValue = true;
		boolean actualValue = PalindromCheck.isPalindrome("A man, a plan, a canal, Panama!");
		assertEquals(expectedValue,actualValue);
	}
	
	//Test Input 1 = "madam"
	//Test Input 2 = "Able was I ere I saw Elba"
	//Test Input 3 = "1881"
	//Test Input 4 = "A man, a plan, a canal, Panama!"
	//Test Input 5 = "noon"
	//Test Input 6 = ""
			

	

}
