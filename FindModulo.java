package dailyTasks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FindModulo {

	public static int findModulo(int p, int n) {
		int prod = 1;
		int mod;
		for (int i = p; i >= 1; i--) {
			prod = prod * i;

		}
		System.out.println(n + "! = " + prod);
		mod = prod % n;
		System.out.println(n + "! % " + p + " = " + mod);
		return mod;
	}

	@Test
	public void test1() {
		Assert.assertEquals(findModulo(5, 3), 0);
	}

	@Test
	public void test2() {
		Assert.assertEquals(findModulo(4, 5), 4);
	}
}
