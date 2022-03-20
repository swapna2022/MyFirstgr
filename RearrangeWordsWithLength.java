package dailyTasks;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RearrangeWordsWithLength {

	public String arrangeWords(String text) {
		String[] s = text.toLowerCase().split(" ");
		Arrays.sort(s, (a, b) -> a.length() - b.length());
		String rearranged = String.join(" ", s);

		return Character.toUpperCase(rearranged.charAt(0)) + rearranged.substring(1);
	}

	@Test
	public void test1() {
		Assert.assertEquals(arrangeWords("You are a strong person"), "A you are strong person");
	}

	@Test
	public void test2() {
		Assert.assertEquals(arrangeWords("Do you have a knack for coding Hello ninjas"),
				"A do you for have knack hello coding ninjas");
	}

}
