package dailyTasks;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BeautyOfArrayMaxFreq {

	public static int beautyOfArray(int[] arr) {
		// Array fr will store frequencies of element
		int[] fr = new int[arr.length];
		int visited = -1;
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					// To avoid counting same element again
					fr[j] = visited;
				}
			}
			if (fr[i] != visited)
				fr[i] = count;
		}
		Arrays.sort(fr);
		int beauty = 0;
		for (int i = 0; i < fr.length; i++) {

			beauty = fr[fr.length - 1];
		}
		System.out.println(beauty);
		return beauty;

	}

	@Test
	public void test1() {
		int[] arr = { 1, 2, 1, 2, 3 };
		beautyOfArray(arr);

		Assert.assertEquals(beautyOfArray(arr), 2);
	}

	@Test
	public void test2() {

		int[] arr1 = { 7, 5, 6 };
		beautyOfArray(arr1);
		Assert.assertEquals(beautyOfArray(arr1), 1);
	}

}
