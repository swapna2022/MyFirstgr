package practice;

import java.util.HashSet;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DistinctSubStrings {
	public static int distinctSubstring(String str) {

		Set<String> distinctSubStr = new HashSet<String>();

		for (int i = 0; i <= str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {

				distinctSubStr.add(str.substring(i, j));
				distinctSubStr.add("");
			}
		}
		System.out.println(distinctSubStr);

		return distinctSubStr.size();
	}

	@Test
	public void test1() {
		Assert.assertEquals(distinctSubstring("abc"), 7);

	}

	@Test
	public void test2() {
		Assert.assertEquals(distinctSubstring("aaa"), 4);

	}

	@Test
	public void test3() {
		Assert.assertEquals(distinctSubstring("sds"), 6);

	}

}
