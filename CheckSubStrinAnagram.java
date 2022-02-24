package dailyTasks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckSubStrinAnagram {

	public static boolean checkSubString(String str1, String str2) {

		if (str1.length() > str2.length()) {
			return false;
		}

		int[] str1Data = new int[26];
		int[] str2Data = new int[26];

		for (int i = 0; i < str1.length(); i++) {
			str1Data[str1.charAt(i) - 'a']++;
			str2Data[str2.charAt(i) - 'a']++;
		}

		int windowStart = 0;
		int windowEnd = str1.length();

		while (windowEnd < str2.length()) {
			if (matches(str1Data, str2Data)) {
				return true;
			}

			str2Data[str2.charAt(windowEnd) - 'a']++;
			str2Data[str2.charAt(windowStart) - 'a']--;

			windowStart++;
			windowEnd++;

		}
		if (matches(str1Data, str2Data)) {
			return true;
		}
		return false;
	}

	public static boolean matches(int[] str1Data, int[] str2Data) {
		for (int i = 0; i < 26; i++) {
			if (str1Data[i] != str2Data[i]) {
				return false;
			}
		}
		return true;

	}

	@Test
	public void test1() {
		Assert.assertTrue(checkSubString("ab", "aoba"));

	}

	@Test
	public void test2() {
		Assert.assertTrue(checkSubString("ab", "ebbao"));

	}

	@Test
	public void test3() {
		Assert.assertFalse(checkSubString("b", "acd"));

	}

}
