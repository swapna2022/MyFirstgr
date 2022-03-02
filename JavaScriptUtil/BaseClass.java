package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

	public static WebDriver driver = null;

	@BeforeSuite
	public void initialize() {
		System.setProperty("webdriver.chrome.driver", "./exes\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public void launchURL() {
		driver.manage().window().maximize();
		driver.get("https://webdriveruniversity.com/Scrolling/index.html");
	}

	@AfterSuite
	public void quitBrowser() {
		driver.quit();
	}

}
