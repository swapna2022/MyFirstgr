package dailyTasks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FindProductNumInArray {

	public boolean findPoducuNumInArray(int[] arr1) {
		int[] arr2 = new int[arr1.length];
		int P = 0;
		int Q;
		boolean check = false;
		for (int i = 0; i < arr1.length; i++) {

			arr2[i] = arr1[i] * 2;

		}
		for (int x = 0; x < arr1.length; x++) {
			for (int y = 0; y < arr2.length; y++) {
				if (arr1[x] == arr2[y]) {
					P = arr2[y];
					check = true;
				}

			}
		}
		System.out.println("P= " + P);
		Q = P / 2;
		System.out.println("Q= " + Q);
		System.out.println(check);

		return check;
	}

	@Test
	public void test1() {
		int[] arr1 = { 4, 9, 2, 1, 7 };
		Assert.assertTrue(findPoducuNumInArray(arr1));
	}

	@Test
	public void test2() {
		int[] arr2 = { 6, 13, 8, 5 };
		Assert.assertFalse(findPoducuNumInArray(arr2));
	}

	@Test
	public void test3() {
		int[] arr2 = { 2, 5, 7, 4, 9 };
		Assert.assertTrue(findPoducuNumInArray(arr2));
	}
}
