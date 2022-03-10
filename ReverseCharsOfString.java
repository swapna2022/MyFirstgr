package dailyTasks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseCharsOfString {

	public static String reverseStringChars(String str) {
		char[] chArr = str.toCharArray();
		int arrayStart = 0;
		int arrayEnd = chArr.length - 1;

		while (arrayStart < arrayEnd) {
			if (Character.isLetter(chArr[arrayStart]) && Character.isLetter(chArr[arrayEnd])) {
				char temp = chArr[arrayStart];
				chArr[arrayStart] = chArr[arrayEnd];
				chArr[arrayEnd] = temp;

				arrayStart++;
				arrayEnd--;
			} else if (Character.isLetter(chArr[arrayStart]) && !Character.isLetter(chArr[arrayEnd])) {
				arrayEnd--;
			} else if (!Character.isLetter(chArr[arrayStart]) && Character.isLetter(chArr[arrayEnd])) {
				arrayStart++;
			} else {
				arrayStart++;
				arrayEnd--;
			}
		}
		System.out.println(chArr);
		return String.valueOf(chArr);
	}

	@Test
	public void test1() {
		Assert.assertEquals(reverseStringChars("$aggh#hjjjn$"), "$njjj#hhgga$");
	}

	@Test
	public void test2() {
		Assert.assertEquals(reverseStringChars("abc@$rsxyz#"), "zyx@$srcba#");
	}

}
