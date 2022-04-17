package practice;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UpdatedGrades {

	public static Map<String, Integer> getFinalGrades(Map<String, Integer> grades1, Map<String, Integer> grades2) {

		for (Map.Entry m : grades2.entrySet()) {
			Integer before = grades1.get(m.getKey());
			Integer after = grades2.get(m.getKey());

			if (after > before) {
				grades1.put((String) m.getKey(), after);
			}
		}

		System.out.println("Final Grades:");
		grades1.forEach((k, v) -> System.out.println(k + " " + v));
		return grades1;
	}

	@Test
	public void test1() {
		Map<String, Integer> grades = new HashMap<String, Integer>();

		grades.put("Angie", 24);
		grades.put("Dave", 32);
		grades.put("Lisi", 80);
		grades.put("Raja", 50);
		grades.put("Shashi", 79);
		grades.put("Bas", 40);
		grades.put("Carlos", 59);
		grades.put("Amber", 55);
		grades.put("Rex", 95);
		grades.put("Jason", 63);
		grades.put("Nikolay", 32);

		Map<String, Integer> MUgrades = new HashMap<String, Integer>();
		MUgrades.put("Angie", 97);
		MUgrades.put("Dave", 82);
		MUgrades.put("Lisi", 76);
		MUgrades.put("Raja", 89);
		MUgrades.put("Shashi", 79);
		MUgrades.put("Bas", 98);
		MUgrades.put("Carlos", 80);
		MUgrades.put("Amber", 95);
		MUgrades.put("Rex", 90);
		MUgrades.put("Jason", 62);
		MUgrades.put("Nikolay", 79);

		Assert.assertNotEquals(getFinalGrades(grades, MUgrades), MUgrades);
	}

}
