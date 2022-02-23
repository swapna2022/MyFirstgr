package dailyTasks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RightDigitOfPoweredNum {

	public int rightDigitOfPowerNumber(int N, int M, int K) {
		Integer rightDigit;
		if (N < 2 || M < 3 || K < 1) {
			System.out.println("There is no right digit");
			rightDigit = null;
		} else {

			int pow = (int) Math.pow(N, M);
			System.out.println("N to the power M = " + pow);
			String str = Integer.toString(pow);
			char[] c = str.toCharArray();
			char x = c[c.length - K];
			rightDigit = Character.getNumericValue(x);
		}
		System.out.println(rightDigit);
		return rightDigit;
	}

	@Test
	public void test1() {
		Assert.assertEquals(rightDigitOfPowerNumber(2, 4, 1), 6);
	}

	@Test
	public void test2() {
		Assert.assertEquals(rightDigitOfPowerNumber(8, 4, 2), 9);
	}

}
