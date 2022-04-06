package dailyTasks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReplaceDigitsWithStars {

	public String replaceDigits(String str) {

		str = str.replaceAll("[0-9]", "*");

		return str;
	}

	@Test
	public void test1() {
		String str = "james777";
		Assert.assertEquals(replaceDigits(str), "james***");
	}

}
