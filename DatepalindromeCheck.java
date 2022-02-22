package dailyTasks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DatepalindromeCheck {
	public static boolean datePalindromeCheck(String str) {
		System.out.println(str);
		StringBuilder sb = new StringBuilder(str);
		String str2 = sb.reverse().toString();
		System.out.println(str2);
		boolean palindrome = false;
		if (str.equals(str2)) {
			palindrome = true;
		}
		System.out.println(palindrome);
		return palindrome;
	}

	@Test
	public void test1() {
		String str = "22022022";
		Assert.assertTrue(datePalindromeCheck(str));
	}

	@Test
	public void test2() {
		String str2 = "22022012";
		Assert.assertFalse(datePalindromeCheck(str2));
	}

	@Test
	public void test3() {
		String str3 = "20022022";
		Assert.assertFalse(datePalindromeCheck(str3));
	}

	@Test
	public void test4() {
		String str3 = "33033";
		Assert.assertTrue(datePalindromeCheck(str3));
	}

}
