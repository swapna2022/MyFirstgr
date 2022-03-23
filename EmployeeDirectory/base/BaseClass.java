package base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import util.ConfigReader;

public class BaseClass {

	private DriverFactory driverFactory;
	private static WebDriver driver;
	private ConfigReader configReader;
	Properties prop;

	@BeforeSuite
	public void launchBrowser() {
		configReader = new ConfigReader();
		prop = configReader.getProp();
		String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver = driverFactory.init_driver(browserName);

	}

	public void launchURL() {
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
	}

	@AfterSuite
	public void quitBrowser() {
		driver.quit();
	}

}
