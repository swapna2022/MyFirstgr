package dailyTasks;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MaxCommonDivisor {

	public static int commonMaxdivisor(int x, int y) {
		int min = Math.min(x, y);
		int maxDivisor;
		List<Integer> al = new ArrayList<Integer>();
		int div;

		for (int i = 1; i < min; i++) {
			if (x % i == 0 && y % i == 0) {
				div = i;
				al.add(div);
			}
		}
		System.out.println(al);
		maxDivisor = al.get(al.size() - 1);
		System.out.println("Greatest common divisor of " + x + " and " + y + " is " + maxDivisor);
		return maxDivisor;

	}

	@Test
	public void test1() {
		Assert.assertEquals(commonMaxdivisor(15, 20), 5);
	}

	@Test
	public void test2() {
		Assert.assertEquals(commonMaxdivisor(40, 72), 8);
	}

	@Test
	public void test3() {
		Assert.assertEquals(commonMaxdivisor(100, 50), 25);
	}

}
