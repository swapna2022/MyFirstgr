package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;
import util.ActionsUtility;

public class WebDriverUniversityPage extends BaseClass {

	@FindBy(id = "draggable")
	WebElement drag;
	@FindBy(id = "droppable")
	WebElement drop;

	@FindBy(xpath = "//div[@id='droppable']//p/b")
	WebElement dropHere;
	String before;
	String after;

	@FindBy(id = "double-click")
	WebElement dClick;

	@FindBy(xpath = "//button[text()='Hover Over Me First!']")
	WebElement hoverFirst;

	@FindBy(xpath = "//button[text()='Hover Over Me Second!']")
	WebElement hoverSecond;

	@FindBy(xpath = "//button[text()='Hover Over Me Third!']")
	WebElement hoverThird;

	@FindBy(xpath = "//div[@class='dropdown hover']//a[@class='list-alert']")
	WebElement firstLink;

	@FindBy(xpath = "//div[@class='dropdown']//a[@class='list-alert'][1]")
	WebElement secondLink;

	@FindBy(xpath = "//button[text()='Hover Over Me Third!'] //parent::div//div//a[2]")
	WebElement thirdLink;

	@FindBy(id = "click-box")
	WebElement clickHold;

	String beforeHold;
	String afterHold;

	ActionsUtility actutil = new ActionsUtility(driver);

	public WebDriverUniversityPage() {
		PageFactory.initElements(driver, this);
	}

	public String getTiltle() {
		return driver.getTitle();
	}

	public void dragToDrop() {

		before = dropHere.getText();
		System.out.println(before);

		actutil.dragAndDrop(drag, drop);

		after = dropHere.getText();
		System.out.println(after);

	}

	public void doubleClick() {
		System.out.println(dClick.getAttribute("class"));
		actutil.doubleClick(dClick);
		System.out.println(dClick.getAttribute("class"));

	}

	public void mouseOvers() {
		actutil.moveToElement(hoverFirst);
		actutil.moveToElement(firstLink);
		firstLink.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		actutil.moveToElement(hoverSecond);
		actutil.moveToElement(secondLink);
		secondLink.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		actutil.moveToElement(hoverThird);
		actutil.moveToElement(thirdLink);
		thirdLink.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	}

	public void clickAndHold() {
		beforeHold = clickHold.getText();
		System.out.println(beforeHold);
		actutil.clickAndHold(clickHold);
		afterHold = clickHold.getText();
		System.out.println(afterHold);

	}

}
