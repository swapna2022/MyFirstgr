package dailyTasks;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FindRightAdjSmaller {

	int[] a1 = { 4, 3, 2, 5, 1, 0 };

	int[] a2 = { 4, 2, 3, 1, 3 };

	int[] a3 = { 1, 2, 3, 4 };

	int[] a4 = { 4, 7, 8, 2, 3, 1 };

	public int[] findRightAdjSmaller(int[] a1) {
		int n = a1.length;
		int[] a2 = new int[n];

		for (int i = 0; i < n - 1; i++) {

			if (a1[i] > a1[i + 1]) {
				a2[i] = a1[i + 1];
			} else
				a2[i] = -1;
		}

		for (int x = 0; x < n; x++) {
			a2[n - 1] = -1;
			System.out.println(a2[x]);
		}
		return a2;

	}

	@Test
	public void test1() {
		int[] resultarr;
		resultarr = findRightAdjSmaller(a1);
		Assert.assertTrue(a1.length == resultarr.length);

	}

	@Test
	public void test2() {
		int[] resultarr1 = { 2, -1, 1, -1, -1 };
		Assert.assertTrue(Arrays.equals(findRightAdjSmaller(a2), resultarr1));

	}

	@Test
	public void test3() {
		int[] resultarr2;
		resultarr2 = findRightAdjSmaller(a3);
		Assert.assertTrue(a3.length == resultarr2.length);

	}

	@Test
	public void test4() {
		int[] resultarr3;
		resultarr3 = findRightAdjSmaller(a4);
		Assert.assertTrue(a1.length == resultarr3.length);

	}

}
