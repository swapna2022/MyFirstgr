package practice;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LexicalOrderWords {

	public String lexicOrder(String str) {
		String words[] = str.split(" ");
		Arrays.sort(words);
		for (String s : words) {
			System.out.println(s);

		}
		String str2 = Arrays.toString(words);

		System.out.println(str2);
		return str2;

	}

	@Test
	public void test1() {

		String str = "good morning every one ";

		Assert.assertEquals(lexicOrder(str), "[every, good, morning, one]");
	}

	@Test
	public void test() {

		String str = "java is programming language";
		Assert.assertEquals(lexicOrder(str), "[is, java, language, programming]");
	}
}