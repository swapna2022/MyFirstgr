package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class EmpDetailsPage extends BaseClass {

	WebDriver driver;

	public EmpDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h5[@class='card-header']")
	WebElement nameDetail;
	@FindBy(xpath = "//div/div[1]/div/div[2]/div[1]/div")
	WebElement locationDetail;
	@FindBy(xpath = "//div/div/div/div[1]/div/div[2]/div[2]/div")
	WebElement jobDetail;
	@FindBy(xpath = "//span[@class='badge badge-primary']")
	WebElement userDetail;

	public String nameCheck() {
		return nameDetail.getText();
	}

	public String locationCheck() {
		return locationDetail.getText();
	}

	public String jobCheck() {
		return jobDetail.getText();
	}

	public String userCheck() {
		return userDetail.getText();
	}

}
