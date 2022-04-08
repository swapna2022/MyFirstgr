package practice;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RearrangeToMaxSum {

	public int rearrangeArrayToMaxSum(int[] ar) {
		Arrays.sort(ar);
		int prod = 0;
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			prod = ar[i] * i;
			sum = prod + sum;
		}
		System.out.println(sum);
		return sum;

	}

	@Test
	public void test1() {
		int[] ar1 = { 1, 2, 1 };
		Assert.assertEquals(rearrangeArrayToMaxSum(ar1), 5);
	}

	@Test
	public void test2() {
		int[] ar1 = { 1, 1 };
		Assert.assertEquals(rearrangeArrayToMaxSum(ar1), 1);
	}

	@Test
	public void test3() {
		int[] ar1 = { 1, 2, 3 };
		Assert.assertEquals(rearrangeArrayToMaxSum(ar1), 8);
	}

}
