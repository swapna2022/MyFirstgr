package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class demoTest {

	static WebDriver driver;
	DBPage dBPage;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./exes\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://webdriveruniversity.com/Data-Table/index.html");
	}

	@Test
	public void test1() {

		driver.getTitle();
		driver.getCurrentUrl();
	}

	@Test
	public void test2() {
		dBPage = new DBPage(driver);
		dBPage.headerCheck();
		dBPage.tablesCheck();
		dBPage.table1Details();
		dBPage.table2Details();
		dBPage.inputFieldsCheck("john", "peter", "4567");
		dBPage.breadCrumbLinksCheck();
		dBPage.paginationLinksCheck();
		dBPage.table3Check();
		dBPage.buttonstatesCheck();
	}

}
