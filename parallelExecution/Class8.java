package parallelExecution;

import org.testng.annotations.Test;

public class Class8 {

	@Test
	public void class8Test() {

		System.out.println("The thread ID for Class8 is " + Thread.currentThread().getId());
		System.out.println("Executing Class8");
	}

}
