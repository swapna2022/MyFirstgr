package dailyTasks;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DecodeEncodedString {

	public String decodeString(String encodeStr) {

		ArrayList<Character> al = new ArrayList<Character>();

		for (int i = 0; i < encodeStr.length(); i++) {

			if (encodeStr.charAt(i) == ']') {
				String temp = "";
				while (al.size() > 0 && al.get(al.size() - 1) != '[') {

					temp = al.get(al.size() - 1) + temp;

					al.remove(al.size() - 1);
				}

				al.remove(al.size() - 1);
				String num = "";

				while (al.size() > 0 && al.get(al.size() - 1) >= 48 && al.get(al.size() - 1) <= 57) {
					num = al.get(al.size() - 1) + num;
					al.remove(al.size() - 1);
				}

				int number = Integer.parseInt(num);
				String repeat = "";
				for (int j = 0; j < number; j++)
					repeat += temp;

				for (int c = 0; c < repeat.length(); c++)
					al.add(repeat.charAt(c));
			}

			else
				al.add(encodeStr.charAt(i));
		}
		String decodeStr = "";
		while (al.size() > 0) {
			decodeStr = al.get(al.size() - 1) + decodeStr;

			al.remove(al.size() - 1);
		}
		System.out.println(decodeStr);
		return decodeStr;

	}

	@Test
	public void test() {
		Assert.assertEquals(decodeString("2[a]"), "aa");
		Assert.assertEquals(decodeString("abcd"), "abcd");
		Assert.assertEquals(decodeString("3[a2[b]]"), "abbabbabb");
		Assert.assertEquals(decodeString("3[a]2[bc]"), "aaabcbc");
		Assert.assertEquals(decodeString("a1[b]1[cc]"), "abcc");
	}

}
