package dailyTasks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseOnlyVowels {

	private static boolean vowelCheck(char c) {
		if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o'
				|| c == 'u') {

			return true;
		} else {
			return false;
		}
	}

	public static String reverseVowelInString(String str) {
		int start = 0;
		int end = str.length() - 1;
		char[] chArr = str.toCharArray();
		while (start < end) {
			if (!vowelCheck(chArr[start])) {
				start++;
				continue;
			}
			if (!vowelCheck(chArr[end])) {
				end--;
				continue;
			}
			char temp = chArr[start];
			chArr[start] = chArr[end];
			chArr[end] = temp;
			start++;
			end--;
		}
		return String.valueOf(chArr);

	}

	@Test
	public void test1() {
		String str1 = "abced";
		Assert.assertEquals(reverseVowelInString(str1), "ebcad");
	}

	@Test
	public void test2() {
		String str2 = "pperu";
		Assert.assertEquals(reverseVowelInString(str2), "ppure");
	}

	@Test
	public void test3() {
		String str3 = "googlE";
		Assert.assertEquals(reverseVowelInString(str3), "gEoglo");
	}

	@Test
	public void test4() {
		String str4 = "dry";
		Assert.assertEquals(reverseVowelInString(str4), "dry");
	}

}
