package dailyTasks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FindUniqueCharString {

	public String uniqueCharString(String str) {
		StringBuilder sb = new StringBuilder();
		int count;
		String possible = null;
		char[] c = str.toCharArray();

		for (int i = 0; i < c.length; i++) {
			count = 1;
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j] && c[i] != ' ') {
					count++;
					// Set string[j] to ' ' to avoid printing visited character
					c[j] = ' ';
				}
			}
			// A character is considered as duplicate if count is greater than 1
			if (count > 1 && c[i] != ' ')
				sb.append(c[i]);
		}

		if (sb.length() >= 1)
			possible = "NO";
		else
			possible = "YES";

		System.out.println(possible);
		return possible;

	}

	@Test
	public void test1() {
		Assert.assertEquals(uniqueCharString("Coding$ninjas"), "NO");
	}

	@Test
	public void test2() {
		Assert.assertEquals(uniqueCharString("Coding123"), "YES");
	}

}
