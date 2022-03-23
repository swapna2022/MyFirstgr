package dailyTasks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SumOf2NumsInString {

	public static int SumStrings(String s1, String s2) {
		int sum;
		sum = stringToNum(s1) + stringToNum(s2);
		System.out.println(sum);
		return sum;

	}

	public static int stringToNum(String s) {
		int num = 0;
		for (int i = 0; i < s.length(); i++) {
			num = num * 10 + s.charAt(i) - 48;
		}

		return num;

	}

	@Test
	public void test1() {

		Assert.assertEquals(SumStrings("5", "21"), 26);

	}

	@Test
	public void test2() {

		Assert.assertEquals(SumStrings("10", "9"), 19);

	}
}
