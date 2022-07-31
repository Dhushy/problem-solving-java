package com.code.coinChange;

import java.util.Scanner;
import java.util.Vector;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.code.assessment.palindrom.PalindromCheck;

public class FindMinimumCoins {
	
	private static Logger logger = LogManager.getLogger(PalindromCheck.class);

	
    public static int findMinCoins(int[] coinsArr,int input)
    {
    	if(input >0) {
        int n = coinsArr.length;
        // Initialize result
        Vector<Integer> output = new Vector<>();

        // Traverse through all denomination
        for (int i = n - 1; i >= 0; i--)
        {
            // Find denominations
            while (coinsArr[i] <= input)
            {
            	input -= coinsArr[i];
            	output.add(coinsArr[i]);
            }
        }
        
        return output.size();
    	}else {
    		return 0;
    	}
    		
    }
    
    public static void main(String[] args) {

        int coinsArr[] = {1, 2, 5, 10, 20, 50, 100};
        
        Scanner input = new Scanner(System.in);
       	logger.info("Enter the Amount: "); 

       	int number = input.nextInt();
       	input.close();       	
       	logger.info("Number of coins  : "+ findMinCoins(coinsArr,number)); 
    }
}
