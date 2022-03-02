package util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BaseClass;

public class JavaScriptExecutorUtility extends BaseClass {
	public static JavascriptExecutor js = (JavascriptExecutor) driver;

	public JavaScriptExecutorUtility(WebDriver driver) {

	}

	public static void flash(WebElement element) {
		// JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for (int i = 0; i < 30; i++) {
			changeColor("#000000", element);// 1
			changeColor(bgcolor, element);// 2
		}
	}

	public static void changeColor(String color, WebElement element) {

		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);

		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
		}
	}

	public static String fetchTitle() {
		String title = js.executeScript("return document.title;").toString();
		return title;

	}

	public static void ScrollTillEle(WebElement element) {

		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public static void ScrollToEnd() {
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

	}

}
