package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenCartHomepage {

	public OpenCartHomepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = " //a[text()='Continue']")
	private WebElement NewRegiser;

	public void clickHere() {

		NewRegiser.click();

	}

}
