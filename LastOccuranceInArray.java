package dailyTasks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LastOccuranceInArray {

	public static int lastOccurance(int[] ar1, int x) {
		int index = -1;
		for (int i = 0; i < ar1.length; i++) {
			if (ar1[i] == x) {
				index = i;
			}
		}
		System.out.println(index);
		return index;
	}

	@Test
	public void test1() {
		int[] ar1 = { 7, 5, 2, 11, 2, 43, 1, 1 };
		Assert.assertEquals(lastOccurance(ar1, 2), 4);
	}

	@Test
	public void test2() {
		int[] ar1 = { 7, 5, 2, 11, 2, 43, 1, 1 };
		Assert.assertEquals(lastOccurance(ar1, 10), -1);
	}

}
