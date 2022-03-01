package dailyTasks;

import java.util.ArrayList;
import java.util.Collections;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PowerFulIntegers {

	public ArrayList<Integer> findPowerFulInts(int x, int y, int bound) {
		int powerFulx = 0;
		int powerFuly = 0;
		int powerFul = 0;

		ArrayList<Integer> li = new ArrayList<Integer>();
		for (int i = 0; i <= y; i++) {
			powerFulx = (int) Math.pow(x, i);

			for (int j = 0; j <= y; j++) {
				powerFuly = (int) Math.pow(y, j);

				powerFul = powerFulx + powerFuly;

				if (powerFul <= bound) {
					li.add(powerFul);
				}
			}
		}
		Collections.sort(li);
		System.out.println(li);
		return li;

	}

	@Test
	public void test1() {
		int x = 3;
		int y = 5;
		int bound = 15;
		Assert.assertEquals(findPowerFulInts(x, y, bound).size(), 6);
	}

	@Test
	public void test2() {
		int x = 2;
		int y = 3;
		int bound = 10;
		Assert.assertEquals(findPowerFulInts(x, y, bound).size(), 8);
	}

	@Test
	public void test3() {
		int x = 3;
		int y = 4;
		int bound = 20;
		Assert.assertEquals(findPowerFulInts(x, y, bound).size(), 8);
	}

}
