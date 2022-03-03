package dailyTasks;

import java.util.HashSet;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ConvertStringInAtMostKsteps {

	public String findCommonChars(String a, String b, int k) {
		String check;
		Set<String> str = new HashSet<String>();
		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j < b.length(); j++) {
				if (a.charAt(i) == b.charAt(j)) {
					str.add(a.charAt(i) + "");
				}
			}
		}

		System.out.println(str);
		if (a.length() - str.size() == k) {
			check = "YES";
		} else {
			check = "NO";
		}
		System.out.println(check);
		return check;

	}

	@Test
	public void test1() {
		String A = "coding";
		String B = "ninjaa";
		int k = 4;
		Assert.assertEquals(findCommonChars(A, B, k), "YES");
	}

	@Test
	public void test2() {
		String A = "coding";
		String B = "ninjaa";
		int k = 3;
		Assert.assertEquals(findCommonChars(A, B, k), "NO");
	}

}
