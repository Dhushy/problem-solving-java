package com.code.assessment;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.code.assessment.Roman.RomanConversion;


@SpringBootTest

public class RomanConversionTest {

	@Test
	void convertNumberToRoman() {
		String expectedValue = "MMMCCLIX";
		String actualValue = RomanConversion.numberToRoman(3259);
		assertEquals(expectedValue,actualValue);
		
	}
	@Test
	void convertNumberToRomanTestInvalid() {
		String expectedValue = "invalid entry";
		String actualValue = RomanConversion.numberToRoman(4000);
		assertEquals(expectedValue,actualValue);
		
	}
}
