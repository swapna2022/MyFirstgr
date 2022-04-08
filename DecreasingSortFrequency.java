package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DecreasingSortFrequency {

	public List<Integer> sortBasedOnFrequencyAndValue(Integer[] arr, List<Integer> list) {

		int n = arr.length;
		HashMap<Integer, Integer> mapCount = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> mapIndex = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			if (mapCount.containsKey(arr[i])) {
				mapCount.put(arr[i], mapCount.get(arr[i]) + 1);
			} else {
				mapCount.put(arr[i], 1); // Map to capture frequency of elements
				mapIndex.put(arr[i], i); // Map to capture 1st occurrence of elements
			}
		}

		Collections.sort(list, new Comparator<Integer>() {
			public int compare(Integer n1, Integer n2) {
				int freq1 = mapCount.get(n1);
				int freq2 = mapCount.get(n2);
				if (freq1 != freq2) {
					return freq2 - freq1;
				} else {
					return mapIndex.get(n1) - mapIndex.get(n2); // Elements with Lesser
																// Index gets Higher
																// Priority
				}
			}
		});
		System.out.println(list);
		return list;
	}

	@Test
	public void test1() {
		Integer arr[] = { 2, 5, 2, 8, 5, 6, 8, 8 };

		List<Integer> list = Arrays.asList(arr);

		Assert.assertEquals(sortBasedOnFrequencyAndValue(arr, list).size(), arr.length);

	}

	@Test
	public void test2() {
		Integer arr[] = { 1, 2, 3, 3, 2, 1, 1 };
		List<Integer> list = Arrays.asList(arr);
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(1);
		list1.add(1);
		list1.add(2);
		list1.add(2);
		list1.add(3);
		list1.add(3);
		Assert.assertEquals(sortBasedOnFrequencyAndValue(arr, list), list1);

	}

	@Test
	public void test3() {
		Integer arr[] = { 1, 3, 2, 2, 2, 3, 4, 3, 1 };

		List<Integer> list = Arrays.asList(arr);

		Assert.assertEquals(sortBasedOnFrequencyAndValue(arr, list).size(), arr.length);

	}
}
