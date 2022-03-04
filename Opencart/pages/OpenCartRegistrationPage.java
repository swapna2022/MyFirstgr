package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenCartRegistrationPage {

	@FindBy(id = "input-firstname")
	private WebElement fName;
	@FindBy(id = "input-lastname")
	private WebElement lName;
	@FindBy(id = "input-email")
	private WebElement email;
	@FindBy(id = "input-telephone")
	private WebElement phoneNum;
	@FindBy(id = "input-password")
	private WebElement passWord;
	@FindBy(id = "input-confirm")
	private WebElement confirmPW;
	@FindBy(name = "agree")
	private WebElement prPolicy;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;
	@FindBy(xpath = "//a[text()='Continue']")
	private WebElement yourStore;

	public OpenCartRegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void registerNewCustomer(String firstN, String lastN, String emailId, String phNumber, String pwd,
			String cPwd) {
		fName.sendKeys(firstN);
		lName.sendKeys(lastN);
		email.sendKeys(emailId);
		phoneNum.sendKeys(phNumber);
		passWord.sendKeys(pwd);
		confirmPW.sendKeys(cPwd);
		prPolicy.click();
		submit.submit();
	}

	public void yourStorePage() {
		yourStore.click();
	}

}
