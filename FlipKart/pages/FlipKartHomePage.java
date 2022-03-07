package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;

public class FlipKartHomePage extends BaseClass {

	@FindBy(xpath = "//input[@type='text']")
	WebElement searchSendKeys;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement searchSubmit;
	@FindBy(xpath = "//div[contains(@class,'_2QfC')]/button[contains(@class,'_2KpZ')]")
	WebElement loginRemind;
	WebDriverWait wait;

	public FlipKartHomePage() {
		PageFactory.initElements(driver, this);
	}

	public String getTiltle() {
		return driver.getTitle();
	}

	public FlipKartMobilesPage searchMobile() throws InterruptedException {
		searchSendKeys.sendKeys("Samsung Galaxy S10");
		searchSubmit.submit();
		Thread.sleep(5000);
		loginRemind.click();
		Thread.sleep(4000);
		return new FlipKartMobilesPage();

	}

}
