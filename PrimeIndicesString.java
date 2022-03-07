package dailyTasks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeIndicesString {

	public static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return false;
		return true;

	}

	public static String primeIndiceStr(String str) {
		char[] c = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		int n = str.length();
		for (int i = 2; i < n; i++) {
			if (isPrime(i)) {

				sb.append(c[i]);
			}
		}
		return sb.toString();

	}

	@Test
	public void test1() {
		Assert.assertEquals(primeIndiceStr("CodingNinjasIsTheBest"), "digissBs");
	}

	@Test
	public void test2() {
		Assert.assertEquals(primeIndiceStr("AmazonGoogleMicrosoftNetflix"), "aznoeisft");
	}

}
