package dailyTasks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PalindromeSubStringCount {

	public int palindromeCount(String str) {
		int len = str.length();
		int temp = 0;
		// Total possible subsets for string of size n is n*(n+1)/2
		String strArr[] = new String[len * (len + 1) / 2];

		// This loop maintains the starting character
		for (int i = 0; i < len; i++) {
			// This loop adds the next character every iteration for the subset to form and
			// add it to the array
			for (int j = i; j < len; j++) {
				strArr[temp] = str.substring(i, j + 1);
				temp++;
			}
		}

		// This loop prints all the subsets formed from the string.
		System.out.println("All subsets for given string are: ");
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		int ans = 0;

		// Loop to find palindrome String
		for (int i = 0; i < strArr.length; i++) {

			// Checking if given String is
			// palindrome or not
			if (isPalindrome(strArr[i])) {

				// Update answer variable
				ans++;
			}
		}
		System.out.println(ans);
		return ans;
	}

	static boolean isPalindrome(String str) {

		// Start from leftmost and rightmost corners of str
		int l = 0;
		int h = str.length() - 1;

		// Keep comparing characters while they are same
		while (h > l) {
			if (str.charAt(l++) != str.charAt(h--)) {
				return false;
			}
		}
		return true;
	}

	@Test
	public void test1() {
		Assert.assertEquals(palindromeCount("abbc"), 5);
	}

	@Test
	public void test2() {
		Assert.assertEquals(palindromeCount("fun"), 3);
	}

	@Test
	public void test3() {
		Assert.assertEquals(palindromeCount("abc"), 3);
	}

}
