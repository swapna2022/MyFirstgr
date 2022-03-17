package dailyTasks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberOf2And5inLimit {
	String str = null;

	public void printNumbers(int N) {

		// flag variable to track whether each digit of
		// the number fulfills the given condition
		int flag = 1;

		// Creating a copy of the number
		int x = N;

		// Checking if the number has a positive value
		if (N > 0) {

			// Loop to iterate through digits
			// of the number until every digit
			// fulfills the given condition
			while (x > 0 && flag == 1) {
				// Get last digit
				int digit = x % 10;

				// Updating value of flag to be 0 if
				// the digit is neither 2 nor 5
				if (digit != 2 && digit != 5) {
					flag = 0;
				}

				// Eliminate last digit
				x = x / 10;

			}

			// If N consists of digits 2 or 5 only
			if (flag == 1) {
				str = str + N + " ";
			}

			// Recursive call for the next number
			printNumbers(N - 1);
		}

	}

	@Test
	public void test1() {
		str = new String();
		printNumbers(10);
		Assert.assertEquals(str.trim(), "5 2");
	}

	@Test
	public void test2() {
		str = new String();
		printNumbers(100);
		Assert.assertEquals(str.trim(), "55 52 25 22 5 2");
	}
}
