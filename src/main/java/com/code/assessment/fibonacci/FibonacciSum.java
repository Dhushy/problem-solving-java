package com.code.assessment.fibonacci;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.code.assessment.palindrom.PalindromCheck;

public class FibonacciSum {
	
	private static Logger logger = LogManager.getLogger(PalindromCheck.class);

	public static int calculateFibonacciSum(int input) {
		if (input <= 0) {
			return 0;
		} else {
			int fibo[] = new int[input + 1];
			fibo[0] = 0;
			fibo[1] = 1;

			// Initialize result
			int sum = fibo[0] + fibo[1];

			// Add remaining terms
			for (int i = 2; i <= input; i++) {
				fibo[i] = fibo[i - 1] + fibo[i - 2];
				sum += fibo[i];
			}
			return sum;
		}

		
	}

	// Driver program to test above function
	public static void main(String args[]) {
	
	Scanner input = new Scanner(System.in);
   	System.out.print("Enter the Number: ");
   	int number = input.nextInt();
   	input.close();
   	
   	logger.info("Sum of Fibonacci: " + calculateFibonacciSum(number)); 
	}
}
