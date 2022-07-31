package com.code.assessment;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.code.assessment.fibonacci.FibonacciSum;



@SpringBootTest
public class FibonacciSumTest {
	
	
	@Test
	void calculateFibonacciSumReturnZero() {
		int expectedValue = 0;
		int actualValue = FibonacciSum.calculateFibonacciSum(0);
		assertEquals(expectedValue,actualValue);
	}
	
	@Test
	void calculateFibonacciSumReturnValue() {
		int expectedValue = 7;
		int actualValue = FibonacciSum.calculateFibonacciSum(4);
		assertEquals(expectedValue,actualValue);
		//assertTrue(actualValue);
	}
	
	@Test
	void calculateFibonacciSumReturnFalse() {
		int expectedValue = 0;
		int actualValue = FibonacciSum.calculateFibonacciSum(-1);
		assertEquals(expectedValue,actualValue);
		//assertTrue(actualValue);
	}
}
