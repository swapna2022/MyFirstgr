package dailyTasks;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FindKthElementInOddEvenSortedList {

	public int findKthelementInOddEvenSortedAray(int N, int K) {
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		int ele = 1;
		for (int i = 0; i < N; i++) {
			if (ele % 2 != 0) {

				al1.add(ele);

			}
			ele++;
		}

		ArrayList<Integer> al2 = new ArrayList<Integer>();
		int ele1 = 1;
		for (int i = 0; i < N; i++) {
			if (ele1 % 2 == 0) {

				al2.add(ele1);

			}
			ele1++;
		}

		al1.addAll(al2);
		System.out.println(al1);
		System.out.println(al1.get(K - 1));
		return al1.get(K - 1);
	}

	@Test
	public void test1() {
		Assert.assertEquals(findKthelementInOddEvenSortedAray(7, 4), 7);
	}

	@Test
	public void test2() {
		Assert.assertEquals(findKthelementInOddEvenSortedAray(5, 3), 5);
	}

}
