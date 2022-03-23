package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmpDirHomePage {

	WebDriver driver;

	@FindBy(xpath = "//body/h1")
	WebElement header;

	@FindBy(xpath = "//a[@class='btn btn-primary float-right']")
	WebElement addButton;

	public EmpDirHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getURL() {
		return driver.getCurrentUrl();
	}

	public String headerCheck() {
		return header.getText();

	}

	public EmpDirAddPage clickAdd() {
		addButton.click();
		return new EmpDirAddPage(driver);
	}

}
