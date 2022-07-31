package com.code.assessment;
import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.code.coinChange.FindMinimumCoins;


@SpringBootTest
public class CoinChangeTest {
	@Test
	void findMinCoinsSize() {
		int coinsArr[] = {1, 2, 5, 10, 20, 50, 100};
		
		int expectedValue = 4;
		int actualValue = FindMinimumCoins.findMinCoins(coinsArr,91);
		assertEquals(expectedValue,actualValue);

	}
	
	@Test
	void findMinCoinsReturnZero() {
		int coinsArr[] = {1, 2, 5, 10, 20, 50, 100};
		
		int expectedValue = 0;
		int actualValue = FindMinimumCoins.findMinCoins(coinsArr,0);
		assertEquals(expectedValue,actualValue);
	}
	
	
	@Test
	void findMinCoinsIfInvalidReturnZero() {
		int coinsArr[] = {1, 2, 5, 10, 20, 50, 100};
		
		int expectedValue = 0;
		int actualValue = FindMinimumCoins.findMinCoins(coinsArr,-1);
		assertEquals(expectedValue,actualValue);
	}
	
}
