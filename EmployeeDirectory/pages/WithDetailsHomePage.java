package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class WithDetailsHomePage extends BaseClass {

	WebDriver driver;

	public WithDetailsHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='alert alert-primary']")
	WebElement alertText;
	@FindBy(xpath = "//td[2]/a")
	WebElement empDetails;

	public String alertTextCheck() {
		return alertText.getText();
	}

	public EmpDetailsPage empDetailsLink() {
		empDetails.click();
		return new EmpDetailsPage(driver);
	}

}
