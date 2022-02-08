package TestingInMaven.MavenAssignments;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MinimumSumOf2NumsOfArrayeles {

	public int minimuSumOf2Nums(int arr[], int n) {

		// Sort the array
		Arrays.sort(arr);

		// let two numbers be x and y formed by all digits only once
		int x = 0, y = 0;
		for (int i = 0; i < n; i++) {

			// fill x and y with every alternate
			// digit of input array
			if (i % 2 != 0)
				x = x * 10 + arr[i];
			else
				y = y * 10 + arr[i];
		}

		return x + y;
	}

	@Test
	public void test1() {

		int array1[] = { 4, 3, 2, 7, 1, 9 };
		int n = array1.length;
		Assert.assertEquals(minimuSumOf2Nums(array1, n), 386);
	}

	@Test
	public void test2() {

		int array2[] = { 1, 2, 9, 8 };
		int n = array2.length;
		Assert.assertEquals(minimuSumOf2Nums(array2, n), 47);
	}

	@Test
	public void test3() {

		int array3[] = { 1, 1, 0 };
		int n = array3.length;
		Assert.assertEquals(minimuSumOf2Nums(array3, n), 2);
	}
}
