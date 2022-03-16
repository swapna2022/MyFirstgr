package dailyTasks;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SortedArray {

	public int[] sortedArray(int[] ar) {
		Arrays.sort(ar);
		int[] ar2 = new int[ar.length];
		System.arraycopy(ar, 0, ar2, 0, ar.length);

		for (int i = 0; i < ar2.length; i++) {
			System.out.println(ar2[i]);
		}

		return ar2;

	}

	@Test
	public void test1() {
		int[] ar = { -2, 1, 2, -1, 0 };

		int[] ar2 = { -2, -1, 0, 1, 2 };

		Assert.assertTrue(Arrays.equals(sortedArray(ar), ar2));
	}

	@Test
	public void test2() {
		int[] ar3 = { 1, 2, 3, -4, -5 };

		int[] ar4 = { -5, -4, 1, 2, 3 };

		Assert.assertTrue(Arrays.equals(sortedArray(ar3), ar4));
	}

}
