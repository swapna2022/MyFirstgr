package parallelExecution;

import org.testng.annotations.Test;

public class Class5 {

	@Test
	public void class5Test() {

		System.out.println("The thread ID for Class5 is " + Thread.currentThread().getId());
		System.out.println("Executing Class5");
	}

}
