package dailyTasks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductArrayFrom1stArray {

	public static int[] productArray(int arr[], int n) {

		if (n == 1) {
			System.out.print(0);

		}

		int left[] = new int[n];
		int right[] = new int[n];
		int prod[] = new int[n];

		int i, j;

		left[0] = 1;
		right[n - 1] = 1;

		for (i = 1; i < n; i++)
			left[i] = arr[i - 1] * left[i - 1];

		for (j = n - 2; j >= 0; j--)
			right[j] = arr[j + 1] * right[j + 1];

		for (i = 0; i < n; i++)
			prod[i] = left[i] * right[i];

		for (i = 0; i < n; i++)
			System.out.print(prod[i] + ",");

		return prod;
	}

	@Test
	public void test1() {
		int[] ar1 = { 1, 2, 3, 4, 5 };
		int n = ar1.length;
		int[] ar2 = { 120, 60, 40, 30, 24 };
		Assert.assertEquals(productArray(ar1, n), ar2);
	}

	@Test
	public void test2() {
		int[] ar3 = { 10, 3, 5, 6, 2 };
		int n = ar3.length;
		int[] ar4 = { 180, 600, 360, 300, 900 };
		Assert.assertEquals(productArray(ar3, n), ar4);
	}

	@Test
	public void tes3() {
		int[] ar5 = { 20, 12 };
		int n = ar5.length;
		int[] ar6 = { 12, 20 };
		Assert.assertEquals(productArray(ar5, n), ar6);
	}

}
