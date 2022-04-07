package dailyTasks;

import java.util.HashSet;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CommonElementsOf2Arrays {

	int[] arr1 = { 1, 2, 5, 8, 3, 9, 6 };
	int[] arr2 = { 1, 2, 10, 4, 9, 6, 7 };

	public Object[] commonElements(int[] arr1, int[] arr2) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {

					// add common elements
					set.add(arr1[i]);
					break;
				}
			}

		}
		Object[] arr3 = set.toArray();
		for (Object i : arr3) {
			System.out.println(i);
		}
		return arr3;

	}

	@Test
	public void test1() {
		Assert.assertEquals(commonElements(arr1, arr2).length, 4);
	}

}
