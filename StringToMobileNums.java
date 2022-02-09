package dailyTasks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringToMobileNums {

	public String printSequence(String arr[], String str1) {
		String mobilestr = "";
		String str2 = str1.toUpperCase();

		int n = str2.length();
		for (int i = 0; i < n; i++) {

			if (str2.charAt(i) == ' ')
				mobilestr = mobilestr + "0";

			else {
// Calculating index for each
// character
				int position = str2.charAt(i) - 'A';
				mobilestr = mobilestr + arr[position];
			}
		}

		System.out.println(mobilestr);
		return mobilestr;
	}

	@Test
	public void test1() {
		String mobileNum1[] = { "2", "22", "222", "3", "33", "333", "4", "44", "444", "5", "55", "555", "6", "66",
				"666", "7", "77", "777", "7777", "8", "88", "888", "9", "99", "999", "9999" };
		Assert.assertEquals(printSequence(mobileNum1, "codingninjas"), "22266634446646644466527777");

	}

	@Test
	public void test2() {
		String mobileNum2[] = { "2", "22", "222", "3", "33", "333", "4", "44", "444", "5", "55", "555", "6", "66",
				"666", "7", "77", "777", "7777", "8", "88", "888", "9", "99", "999", "9999" };
		Assert.assertEquals(printSequence(mobileNum2, "hello"), "4433555555666");

	}

	@Test
	public void test3() {
		String mobileNum3[] = { "2", "22", "222", "3", "33", "333", "4", "44", "444", "5", "55", "555", "6", "66",
				"666", "7", "77", "777", "7777", "8", "88", "888", "9", "99", "999", "9999" };
		Assert.assertEquals(printSequence(mobileNum3, "Good morning"), "466666630666677766444664");

	}

}
