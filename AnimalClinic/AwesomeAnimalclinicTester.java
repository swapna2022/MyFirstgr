package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AwesomeAnimalclinicTester {

	AwesomeAnimalPojo a1 = new AwesomeAnimalPojo("Dog", "type1", "breed1", 2, 25);

	@Test
	public void test1() {
		Assert.assertEquals(a1.toString(), "Dog 2 25 type1 breed1");
	}

	@Test
	public void test2() {
		Assert.assertEquals(a1.getAge(), 2);

	}

}
