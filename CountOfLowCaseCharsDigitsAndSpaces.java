package dailyTasks;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CountOfLowCaseCharsDigitsAndSpaces {

	public ArrayList<Integer> lowCaseCharsDigitsAndSpacesCount(String str) {
		int lowCaseCharCount = 0;
		int digitCount = 0;
		int spaceCount = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == ' ') {
				spaceCount++;
			} else if (str.charAt(i) > 96 && str.charAt(i) < 123) {
				lowCaseCharCount++;
			} else if (Character.isDigit(str.charAt(i))) {
				digitCount++;
			}

		}
		System.out.println(lowCaseCharCount);
		System.out.println(spaceCount);
		System.out.println(digitCount);
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(lowCaseCharCount);
		al.add(digitCount);
		al.add(spaceCount);
		return al;
	}

	@Test
	public void test1() {
		String str = "abc def4 5$";
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(6);
		al.add(2);
		al.add(2);
		Assert.assertEquals(lowCaseCharsDigitsAndSpacesCount(str), al);

	}

	@Test
	public void test2() {
		String str2 = "abcdefxz4GH56$";
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(8);
		al.add(3);
		al.add(0);
		Assert.assertEquals(lowCaseCharsDigitsAndSpacesCount(str2), al);

	}

}
