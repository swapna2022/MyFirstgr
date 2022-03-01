package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Base.BaseClass;

public class ActionsUtility extends BaseClass {

	public ActionsUtility(WebDriver driver) {

	}

	public static Actions act = new Actions(driver);

	public static void dragAndDrop(WebElement source1, WebElement target1) {
		act.dragAndDrop(source1, target1).build().perform();
	}

	public static void doubleClick(WebElement element) {
		act.doubleClick(element).build().perform();
	}

	public static void moveToElement(WebElement element) {
		act.moveToElement(element).build().perform();
	}

	public static void clickAndHold(WebElement element) {
		act.clickAndHold(element).build().perform();
	}
}
