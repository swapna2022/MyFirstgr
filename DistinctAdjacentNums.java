package dailyTasks;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DistinctAdjacentNums {
	public static String Rearrange(int arr[], int N) {
		String check = "";
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : arr) {
			if (map.containsKey(i)) {
				int count = map.get(i);
				map.put((i), ++count);
			} else {
				map.put((i), 1);
			}
		}
		System.out.println(map);

		int occur = 0;

		for (int i = 0; i < N; ++i) {
			if (occur < map.get(arr[i]))
				occur = map.get(arr[i]);

			if (occur > (N + 1) / 2)
				check = "NO";
			else
				check = "YES";
		}
		System.out.println(check);
		return check;
	}

	@Test
	public void test1() {
		int[] ar1 = { 1, 1, 1, 2, 2, 2 };
		Assert.assertEquals(Rearrange(ar1, 6), "YES");
	}

	@Test
	public void test2() {
		int[] ar1 = { 10, 10, 10, 32, 32 };
		Assert.assertEquals(Rearrange(ar1, 5), "YES");
	}

	@Test
	public void test3() {
		int[] ar1 = { 89, 47, 89, 48, 89, 89 };
		Assert.assertEquals(Rearrange(ar1, 6), "NO");
	}

}
