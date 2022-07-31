package com.code.assessment.Roman;

import java.util.Scanner;
import com.code.assessment.palindrom.PalindromCheck;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RomanConversion {

	private static Logger logger = LogManager.getLogger(PalindromCheck.class);
	
		// Function to covert number to Roman
		public static String numberToRoman(int num)
		{
			if (num>3999)
			{
				return "invalid entry";
			}
			
			// storing Roman values of digits from 
			//unit(0-9), tens, hundred, and thousand
			
			String m[] = { "", "M", "MM", "MMM"};
			String c[] = { "", "C", "CC", "CCC", "CD",
						"D", "DC", "DCC", "DCCC", "CM" };
			String x[] = { "", "X", "XX", "XXX", "XL",
						"L", "LX", "LXX", "LXXX", "XC" };
			String i[] = { "", "I", "II", "III", "IV",
						"V", "VI", "VII", "VIII", "IX" };

			// Converting to Roman
			String thousands = m[num / 1000];
			String hundreds = c[(num % 1000) / 100];
			String tens = x[(num % 100) / 10];
			String ones = i[num % 10];

			String ans = thousands + hundreds + tens + ones;

			return ans;
		}

		public static void main(String[] args)
		{
			 Scanner input = new Scanner(System.in);
	    	 logger.info("Enter the Number:");
	    	 int number = input.nextInt();
	    	 input.close();
	    	 
	    	 logger.info(numberToRoman(number));
		}
}



