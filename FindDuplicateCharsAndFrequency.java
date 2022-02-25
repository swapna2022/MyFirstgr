package dailyTasks;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FindDuplicateCharsAndFrequency {

	public HashMap<Character, Integer> duplicateChars(String str, int N) {

		HashMap<Character, Integer> FeqMap = new HashMap<Character, Integer>();
		HashMap<Character, Integer> FeqMap2 = new HashMap<Character, Integer>();

		for (int i = N - 1; i >= 0; i--) {
			if (FeqMap.containsKey(str.charAt(i))) {
				int count = FeqMap.get(str.charAt(i));
				FeqMap.put(str.charAt(i), ++count);
			} else {
				FeqMap.put(str.charAt(i), 1);
			}
		}
		System.out.println(FeqMap);

		for (Map.Entry<Character, Integer> m : FeqMap.entrySet()) {
			if (!m.getValue().equals(1)) {
				FeqMap2.put(m.getKey(), m.getValue());
			}
		}

		for (Map.Entry m : FeqMap2.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		return FeqMap2;

	}

	@Test
	public void testCase1() {
		HashMap<Character, Integer> FeqMap2 = new HashMap<Character, Integer>();
		FeqMap2.put('A', 3);
		FeqMap2.put('N', 2);

		Assert.assertEquals(duplicateChars("BANANA", 6), FeqMap2);

	}

	@Test
	public void testCase2() {
		HashMap<Character, Integer> FeqMap2 = new HashMap<Character, Integer>();
		FeqMap2.put('P', 2);

		Assert.assertEquals(duplicateChars("APPLE", 5), FeqMap2);

	}

	@Test
	public void testCase3() {
		HashMap<Character, Integer> FeqMap2 = new HashMap<Character, Integer>();

		FeqMap2.put('E', 2);

		Assert.assertEquals(duplicateChars("GEEK", 4), FeqMap2);

	}

	@Test
	public void testCase4() {
		HashMap<Character, Integer> FeqMap2 = new HashMap<Character, Integer>();

		FeqMap2.put('A', 5);

		Assert.assertEquals(duplicateChars("AAAAA", 5), FeqMap2);

	}

}
