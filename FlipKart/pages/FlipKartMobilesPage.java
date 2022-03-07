package pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;

public class FlipKartMobilesPage extends BaseClass {

	WebDriverWait wait;
	@FindBy(xpath = "//a[@title='Mobiles']")
	WebElement mobileCat;
	@FindBy(xpath = "//div[text()='SAMSUNG']")
	WebElement brand;
	@FindBy(xpath = "//label[contains(@class,'shbqsL')]/div[@class='_24_Dny _3tCU7L']")
	WebElement flipKartassured;
	@FindBy(xpath = "//div[text()='Price -- High to Low']")
	WebElement priceHToL;
	@FindAll(@FindBy(xpath = "//div[@class='col col-7-12']/div[1]"))
	private List<WebElement> ProductNames;
	@FindAll(@FindBy(xpath = "//div[@class='_30jeq3 _1_WHN1']"))
	private List<WebElement> displayPrice;
	@FindAll(@FindBy(xpath = "//a[@class='_1fQZEK']"))
	private List<WebElement> ProductLinks;

	public FlipKartMobilesPage() {
		PageFactory.initElements(driver, this);
	}

	public void productDetailsCheck() throws InterruptedException {
		wait = new WebDriverWait(driver, 40);
		Thread.sleep(5000);
		mobileCat.click();
		wait.until(ExpectedConditions.visibilityOf(brand));
		brand.click();
		wait.until(ExpectedConditions.visibilityOf(flipKartassured));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", flipKartassured);

		wait.until(ExpectedConditions.visibilityOf(priceHToL));
		priceHToL.click();
		for (int i = 0; i < ProductNames.size(); i++) {
			int num = i + 1;
			System.out.println("Details of product " + num);
			System.out.println("Product Name : " + ProductNames.get(i).getText());
			System.out.println("Product price : " + displayPrice.get(i).getText());
			System.out.println("Product Link : " + ProductLinks.get(i).getAttribute("href"));
			System.out.println("-------------------------------");
			Thread.sleep(1000);
		}
	}

}
