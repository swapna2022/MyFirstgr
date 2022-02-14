package dailyTasks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BooksAndAuthors {

	public String[][] authorsAndbooks(String[][] books) {
		String[][] books2 = new String[books.length][];
		for (int i = 0; i < books.length; i++)
			books2[i] = books[i].clone();

		for (int i = 0; i < books.length; i++) {
			System.out.print(i + 1 + "." + books[i][0]);
			System.out.println();
			char c = 'A';
			for (int j = 1; j < books[i].length; j++) {

				System.out.print(c + ".");
				System.out.print(books[i][j]);
				System.out.println();

				c = (char) (c + 1);

			}

			System.out.println();// new line
		}
		return books2;

	}

	@Test
	public void test1() {

		String[][] books = { { "Chetanbhagath", "Twostates", "Revolution", "HalfGirlfriend", "OneIndiangirl" },
				{ "JKRowling", "HarryPotter", "FantasticBeasts" }, { "JeffreyArcher", "OldLove", "Falseimpression" } };
		Assert.assertNotSame(authorsAndbooks(books), books);
	}
}
