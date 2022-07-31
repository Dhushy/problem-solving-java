package com.code.assessment.palindrom;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PalindromCheck {
	
	private static Logger logger = LogManager.getLogger(PalindromCheck.class);
		
	PalindromCheck(){
		
	}
	
	// A recursive function to check the Palindrome
    static boolean isPalindromeCheck(String str, int start, int end)
    {
    	
        // If first and last Character does not match return false
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        // If there are more than two character check the subString
        if (start < end + 1) {
            return isPalindromeCheck(str, start+ 1, end - 1);
        }
        return true;
    }
 
    public static boolean isPalindrome(String str)
    {
        
        str = str.toLowerCase();
   	 	str = str.replaceAll("[^a-zA-Z0-9]", "");
   	 	int n = str.length();
        
 
    // if a string is empty or equal to one considered as palindrome
        if (n == 0 || n == 1) {
            return true;
        }
        return isPalindromeCheck(str, 0, n - 1);
    }
    
    //main method
    public static void main(String args[])
    {	
    	//Test Input 1 = "madam"
    	//Test Input 2 = "Able was I ere I saw Elba"
    	//Test Input 3 = "1881"
    	//Test Input 4 = "A man, a plan, a canal, Panama!"
    	//Test Input 5 = "noon"
    	//Test Input 6 = ""
    	
    	 Scanner input = new Scanner(System.in);
    	 logger.info("Enter the string:");
    	 String string = input.nextLine();
    	 input.close();
    	  
        if (isPalindrome(string)) {
            logger.info("true");
        }
        else {
            logger.info("false");
        }
    }
}
