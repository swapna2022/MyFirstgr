package dailyTasks;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SmallestPositiveIntNotInArray {

	public int minPositiveInt(int[] intAr) {
		int diff = 0;
		int prev = 0;
		int minPosint = 0;

		Arrays.sort(intAr);
		for (int i = 0; i < intAr.length; i++) {
			if (intAr[i] <= 0) {
				minPosint = 1;
			} else {

				diff = intAr[i] - prev;
				prev = intAr[i];
				if (diff > 1) {
					minPosint = intAr[i] - 1;

					break;
				}

			}
		}
		System.out.println(minPosint);
		return minPosint;

	}

	@Test
	public void test1() {
		int[] intAr = { 1, 3, 6, 4, 1, 2 };
		Assert.assertEquals(minPositiveInt(intAr), 5);
	}

	@Test
	public void test2() {
		int[] intAr1 = { 1, 3, 6, 4, 1, 2, 7, 9 };
		Assert.assertEquals(minPositiveInt(intAr1), 5);
	}

	@Test
	public void test3() {
		int[] intAr2 = { -1, -3, -6, -4, 0 };
		Assert.assertEquals(minPositiveInt(intAr2), 1);
	}

}
