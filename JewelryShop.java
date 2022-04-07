package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JewelryShop {

	String s1 = "aA";
	String s2 = "aAAAbbb";

	public int jewelCount(String s1, String s2) {

		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		int jewel = 0;
		for (int i = 0; i < c2.length; i++) {
			for (int j = 0; j < c1.length; j++) {
				if (c2[i] == c1[j]) {
					jewel++;
				}
			}
		}
		System.out.println(jewel);
		return jewel;
	}

	@Test
	public void test1() {
		String s1 = "aA";
		String s2 = "aAAAbbb";
		Assert.assertEquals(jewelCount(s1, s2), 4);
	}

	@Test
	public void test2() {
		String s1 = "aA";
		String s2 = "cdgbbb";
		Assert.assertEquals(jewelCount(s1, s2), 0);
	}

}
