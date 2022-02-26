package parallelExecution;

import org.testng.annotations.Test;

public class Class10 {

	@Test
	public void class10Test() {

		System.out.println("The thread ID for Class10 is " + Thread.currentThread().getId());
		System.out.println("Executing Class10");
	}

}
