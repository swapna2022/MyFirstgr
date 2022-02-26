package parallelExecution;

import org.testng.annotations.Test;

public class Class6 {

	@Test
	public void class6Test() {

		System.out.println("The thread ID for Class6 is " + Thread.currentThread().getId());
		System.out.println("Executing Class6");
	}

}
