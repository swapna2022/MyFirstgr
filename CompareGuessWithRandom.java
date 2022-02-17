package dailyTasks;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CompareGuessWithRandom {
	public boolean guessThevalue(int random, int guess) {

		String compare;
		boolean randomCheck;
		if (random > guess) {
			compare = "lower";
			System.out.println("The guessed number " + guess + " is " + compare + " than random number " + random);
		} else if (random < guess) {
			compare = "higher";
			System.out.println("The guessed number " + guess + " is " + compare + " than random number " + random);
		} else {
			compare = "right guess";
			System.out.println("The guessed number " + guess + " is " + compare);
		}
		if (random >= 1 && random <= 9) {
			randomCheck = true;
		} else {
			randomCheck = false;
		}
		System.out.println(randomCheck);
		return randomCheck;

	}

	@Test
	public void test1() {
		int random;
		int guess;
		int min = 1;
		int max = 9;
		random = (int) (Math.random() * (max - min + 1) + min);
		System.out.println("Enter the input value");
		Scanner sc = new Scanner(System.in);
		guess = sc.nextInt();

		Assert.assertTrue(guessThevalue(random, guess));
	}

	@Test
	public void test2() {
		int random;
		int guess;
		int min = 1;
		int max = 9;
		random = (int) (Math.random() * (max - min + 1) + min);
		System.out.println("Enter the input value");
		Scanner sc = new Scanner(System.in);
		guess = sc.nextInt();

		Assert.assertTrue(guessThevalue(random, guess));
	}

}
