package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EMPDHomepage {

	private WebDriver driver;

	public EMPDHomepage(WebDriver driver) {
		this.driver = driver;
	}

	private By mainHeader = By.xpath("//body/h1");
	private String mHeader;
	private By cardHeader = By.xpath("//h5[@class='card-header']");
	private String cHeader;
	private By addButton = By.xpath("//a[@class='btn btn-primary float-right']");

	public String getHomepageTitle() {
		System.out.println(driver.getTitle());
		return driver.getTitle();
	}

	public String getHomepageURL() {
		System.out.println(driver.getCurrentUrl());
		return driver.getCurrentUrl();
	}

	public String checkMainHeader() {
		System.out.println(driver.findElement(mainHeader).getText());
		return mHeader = driver.findElement(mainHeader).getText();

	}

	public String checkCardHeader() {
		System.out.println(driver.findElement(cardHeader).getText());
		return cHeader = driver.findElement(cardHeader).getText();

	}

	public EMPDAddPage clickAdd() {
		driver.findElement(addButton).click();
		return new EMPDAddPage(driver);

	}

}
