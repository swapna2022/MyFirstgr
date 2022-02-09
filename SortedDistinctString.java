package TestingInMaven.MavenAssignments;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SortedDistinctString {

	public String sortedFormattedStr(String str) {
		String caps = "";
		String small = "";
		String nums = "";
		String formattedStr = "";
		int i = 0;

		for (i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				caps = caps + str.charAt(i);
			} else if (Character.isLowerCase(str.charAt(i))) {
				small = small + str.charAt(i);
			} else if (Character.isDigit(str.charAt(i))) {
				nums = nums + str.charAt(i);
			}
		}
		char capsArray[] = caps.toCharArray();
		caps = "";
		Arrays.sort(capsArray);
		for (i = 0; i < capsArray.length; i++) {
			caps = caps + capsArray[i];
		}
		char smallChar[] = small.toCharArray();
		small = "";
		Arrays.sort(smallChar);
		for (i = 0; i < smallChar.length; i++) {
			small = small + smallChar[i];
		}
		char numArray[] = nums.toCharArray();
		nums = "";
		Arrays.sort(numArray);
		for (i = 0; i < numArray.length; i++) {
			nums = nums + numArray[i];
		}
		StringBuilder sb = new StringBuilder();
		caps.chars().distinct().forEach(c -> sb.append((char) c));
		small.chars().distinct().forEach(c -> sb.append((char) c));
		sb.append(" ");
		nums.chars().distinct().forEach(c -> sb.append((char) c));
		formattedStr = formattedStr + sb;
		System.out.println("Sorted and formatted output String is: " + formattedStr);
		return formattedStr;

	}

	@Test
	public void test1() {
		String s = "Show09allBC 1950AD";
		Assert.assertEquals(sortedFormattedStr(s), "ABCDSahlow 0159");

	}

	@Test
	public void test2() {
		String s1 = "abf182WER sr963";
		Assert.assertEquals(sortedFormattedStr(s1), "ERWabfrs 123689");

	}

}
