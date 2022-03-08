package dailyTasks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NthtermOfGP {

	public static int nthTerm(int N, int A, int R) {
		int gp;
		N = N - 1;
		gp = (int) (A * (Math.pow(R, N)));

		System.out.println(gp);
		return gp;

	}

	@Test
	public void test1() {
		Assert.assertEquals(nthTerm(5, 3, 3), 243);
	}

	@Test
	public void test2() {
		Assert.assertEquals(nthTerm(6, 4, 3), 972);
	}

}
