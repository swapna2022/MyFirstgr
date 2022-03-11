package TestingInMaven.MavenAssignments;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AnagramStrings {

	public boolean anagramCheck(String s1, String s2) {

		boolean check = true;

		if (s1.length() != s2.length()) {
			check = false;
		} else {
			char[] charArr1 = s1.toCharArray();
			char[] charArr2 = s2.toCharArray();
			Arrays.sort(charArr1);
			Arrays.sort(charArr2);
			check = Arrays.equals(charArr1, charArr2);
		}
		if (check) {
			System.out.println("The given 2 strings are anagrams");
		} else {
			System.out.println("The given 2 strings are not anagrams");
		}
		return check;
	}

	@Test
	public void test1() {
		Assert.assertEquals(anagramCheck("anagram", "nagaram"), true);
	}

	@Test
	public void test2() {
		Assert.assertEquals(anagramCheck("kept", "peek"), false);
	}

	@Test
	public void test3() {
		Assert.assertTrue(anagramCheck("keep", "peek"));
	}

}
