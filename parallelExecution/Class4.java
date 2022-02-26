package parallelExecution;

import org.testng.annotations.Test;

public class Class4 {

	@Test
	public void class4Test() {

		System.out.println("The thread ID for Class4 is " + Thread.currentThread().getId());
		System.out.println("Executing Class4");
	}

}
