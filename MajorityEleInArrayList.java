package TestingInMaven.MavenAssignments;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MajorityEleInArrayList {

	public static int majorityEle(ArrayList<Integer> arrlist, int N) {

		int mejoEle;
		Integer[] arr = arrlist.toArray(new Integer[N]);

		int maxCount = 0;
		int index = -1;
		for (int i = 0; i < N; i++) {
			int count = 0;
			for (int j = 0; j < N; j++) {
				if (arr[i] == arr[j])
					count++;
			}

			if (count > maxCount) {
				maxCount = count;
				index = i;
			}
		}

		if (maxCount > N / 2) {
			mejoEle = arr[index];
			System.out.println(arr[index]);
		} else {
			mejoEle = -1;
			System.out.println("No Majority Element");
			System.out.println(mejoEle);
		}
		return mejoEle;
	}

	@Test
	public void test1() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(2);
		al.add(3);
		al.add(9);
		al.add(2);
		al.add(2);
		Assert.assertEquals(majorityEle(al, 5), 2);
	}

	@Test
	public void test2() {
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(8);
		al2.add(5);
		al2.add(1);
		al2.add(9);
		Assert.assertEquals(majorityEle(al2, 4), -1);
	}

	@Test
	public void test3() {
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		al3.add(8);
		al3.add(8);
		al3.add(8);
		al3.add(9);
		al3.add(9);
		al3.add(9);
		Assert.assertEquals(majorityEle(al3, 6), -1);
	}

}
