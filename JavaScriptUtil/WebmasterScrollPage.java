package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;
import util.JavaScriptExecutorUtility;

public class WebmasterScrollPage extends BaseClass {

	@FindBy(id = "zone1")
	WebElement zone1;

	@FindBy(id = "zone2-entries")
	WebElement zone2;

	@FindBy(id = "zone3-entries")
	WebElement zone3;

	@FindBy(id = "zone4")
	WebElement zone4;

	String title;
	String classvalue;
	String text;
	String text2;
	String text3;

	public WebmasterScrollPage() {
		PageFactory.initElements(driver, this);
	}

	JavaScriptExecutorUtility jse = new JavaScriptExecutorUtility(driver);

	public String titleCheck() {
		title = jse.fetchTitle();
		return title;

	}

	public String text1Check() {
		jse.ScrollTillEle(zone1);
		text = zone1.getText();
		System.out.println(text);
		return text;

	}

	public String text2Check() {
		jse.ScrollTillEle(zone2);
		text2 = zone2.getText();
		System.out.println(text2);
		jse.ScrollTillEle(zone2);
		text2 = zone2.getText();
		System.out.println(text3);
		return text3;

	}

	public String scrollTillEleCheck() {
		jse.ScrollToEnd();
		classvalue = zone4.getAttribute("class");
		System.out.println(classvalue);
		return classvalue;
	}

	public void flashingCheck() {
		jse.ScrollTillEle(zone1);
		jse.flash(zone1);

	}

}
