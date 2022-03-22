package dailyTasks;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UniqueNumOfArray {

	public int occuranceOfNum(int[] numArray) {

		int unique = 0;
		Map<Integer, Integer> numCount = new HashMap<Integer, Integer>();
		for (int i = 0; i < numArray.length; i++) {
			Integer count = numCount.getOrDefault(numArray[i], 0);
			numCount.put((Integer) numArray[i], count + 1);

		}

		Map.Entry<Integer, Integer> maxEntry = null;

		for (Map.Entry<Integer, Integer> entry : numCount.entrySet()) {
			if (entry.getValue() == 1) {
				unique = entry.getKey();
			}
		}

		System.out.println("Unique element of the given number Array : " + unique);

		return unique;
	}

	@Test
	public void test1() {
		int[] ar1 = { 1, 2, 3, 4, 1, 2, 3 };

		Assert.assertEquals(occuranceOfNum(ar1), 4);
	}

	@Test
	public void test2() {
		int[] ar2 = { 7, 3, 5, 4, 5, 3, 4 };

		Assert.assertEquals(occuranceOfNum(ar2), 7);
	}

	@Test
	public void test3() {
		int[] ar3 = { 5, 6, 9, 6, 1, 9, 1, 5, 3 };

		Assert.assertEquals(occuranceOfNum(ar3), 3);
	}

}
