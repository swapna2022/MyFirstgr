package dailyTasks;

import java.util.Arrays;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RankOfArrayElements {

	public String findArrayRank(int[] arr) {

		String tempString;

		System.out.println("Given array: " + Arrays.toString(arr));
		if (arr == null || arr.length == 0)
			tempString = "";

		else {
			int[] temp = Arrays.copyOfRange(arr, 0, arr.length);

			Arrays.sort(temp);

			HashMap<Integer, Integer> hMap = new HashMap<>();
			int index = 1;
			int prev = temp[0];
			hMap.put(prev, index);

			for (int i = 1; i < arr.length; i++) {
				if (prev != temp[i])
					index++;
				hMap.put(temp[i], index);
				prev = temp[i];
			}

			for (int i = 0; i < arr.length; i++)
				temp[i] = hMap.get(arr[i]);

			tempString = Arrays.toString(temp);
			System.out.println("Rank: " + tempString);

			System.out.println("-----------------------");
		}
		return tempString;
	}

	@Test
	public void test1() {
		int[] ar1 = { 2, 3, 5, 1 };
		Assert.assertEquals(findArrayRank(ar1), "[2, 3, 4, 1]");
	}

	@Test
	public void test2() {
		int[] ar2 = { 25, 35, 25, 25 };
		Assert.assertEquals(findArrayRank(ar2), "[1, 2, 1, 1]");
	}

	@Test
	public void test3() {
		int[] ar3 = { 100, 100, 100 };
		Assert.assertEquals(findArrayRank(ar3), "[1, 1, 1]");
	}

	@Test
	public void test4() {
		int[] ar4 = { 4, -1 };
		Assert.assertEquals(findArrayRank(ar4), "[2, 1]");
	}

}
