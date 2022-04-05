package dailyTasks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ConsecutiveOnes {

	public int findMaxConsecutiveOnes(int[] nums) {
		int max = 0;
		int current = 0;
		for (int i : nums) {
			if (i == 1) {
				current++;
			} else {
				if (current > max) {
					max = current;
				}
				if (max >= nums.length / 2) {
					return max;
				}
				current = 0;
			}
		}
		return Math.max(max, current);
	}

	@Test
	public void test1() {
		int[] arr = { 0, 1, 1, 0, 0, 1, 1, 1 };
		Assert.assertEquals(findMaxConsecutiveOnes(arr), 3);
	}

	@Test
	public void test2() {
		int[] arr1 = { 0, 1, 1, 0 };
		Assert.assertEquals(findMaxConsecutiveOnes(arr1), 2);
	}

}
