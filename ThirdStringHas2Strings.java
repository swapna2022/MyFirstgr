package TestingInMaven.MavenAssignments;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ThirdStringHas2Strings {

	public static String thirdStringHasOthertwo(String s1, String s2, String s3) {

		String s4 = s1 + s2;
		boolean check = true;
		String result;
		char[] c1 = s3.toLowerCase().toCharArray();
		char[] c2 = s4.toLowerCase().toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);

		check = Arrays.equals(c1, c2);
		if (check) {
			result = "Yes";
			System.out.println(result);
		} else {
			result = "No";
			System.out.println(result);
		}
		return result;

	}

	@Test
	public void verifyStr3HasStr1and2two1() {
		Assert.assertEquals(thirdStringHasOthertwo("HI", "HEY", "EIHYH"), "Yes");
	}

	@Test
	public void verifyStr3HasStr1and2two2() {
		Assert.assertEquals(thirdStringHasOthertwo("ALL", "GOOD", "ADOLLG"), "No");
	}

	@Test
	public void verifyStr3HasStr1and2two3() {
		Assert.assertEquals(thirdStringHasOthertwo("SANTACLAUS", "DEDMOROZ", "SANTAMOROZDEDCLAUS"), "Yes");
	}

}
