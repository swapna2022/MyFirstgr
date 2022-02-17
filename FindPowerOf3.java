package dailyTasks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FindPowerOf3 {

	public int checkPowerOfThree(int n) {
		float f = n;
		float div = 1;
		int check;
		do {
			// while (div >= 1) {
			div = f / 3;
			f = div;

		} while (div >= 3);

		if (div == 1) {
			check = 1;

		} else {
			check = 0;

		}
		System.out.println(check);
		return check;

	}

	@Test
	public void test1() {
		Assert.assertEquals(checkPowerOfThree(81), 1);
	}

	@Test
	public void test2() {
		Assert.assertEquals(checkPowerOfThree(6), 0);
	}

	@Test
	public void test3() {
		Assert.assertEquals(checkPowerOfThree(27), 1);
	}

}
