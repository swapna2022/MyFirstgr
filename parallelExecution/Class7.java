package parallelExecution;

import org.testng.annotations.Test;

public class Class7 {

	@Test
	public void class7Test() {

		System.out.println("The thread ID for Class7 is " + Thread.currentThread().getId());
		System.out.println("Executing Class7");
	}

}
