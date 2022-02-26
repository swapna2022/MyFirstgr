package parallelExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class2 {

	public WebDriver driver;
	public String path = "./jars\\geckodriver.exe";
	public String value = "webdriver.gecko.driver";

	@BeforeTest
	public void beforeTest() {
		System.out.println("Initilizing the Firefox Driver");
		System.setProperty(value, path);
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
	}

	@Test
	public void fireFoxTestMethod() {
		// Initialize the chrome driver
		System.out.println("The thread ID for Chrome is " + Thread.currentThread().getId());

		String label = driver.findElement(By.cssSelector("a#nav-logo-sprites")).getAttribute("aria-label");
		System.out.println(label);
		Assert.assertEquals(label, "Amazon");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Closing the browser ");
		driver.close();
	}

}
