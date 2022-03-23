package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmpDirAddPage {

	WebDriver driver;

	public EmpDirAddPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='photo']")
	WebElement chooseFile;

	@FindBy(id = "full_name")
	WebElement fullName;
	@FindBy(id = "location")
	WebElement location;
	@FindBy(id = "job_title")
	WebElement jobTitle;

	@FindBy(id = "apple")
	WebElement macUser;
	@FindBy(id = "windows")
	WebElement windowsUser;
	@FindBy(id = "linux")
	WebElement linuxUser;
	@FindBy(id = "video-camera")
	WebElement DCStar;
	@FindBy(id = "trophy")
	WebElement EmpOfMon;
	@FindBy(id = "camera")
	WebElement photographer;
	@FindBy(id = "plane")
	WebElement freqFlier;
	@FindBy(id = "paperclip")
	WebElement paperClipAffi;
	@FindBy(id = "coffee")
	WebElement coffeeSnob;
	@FindBy(id = "gamepad")
	WebElement gamer;
	@FindBy(id = "bug")
	WebElement bugFixer;
	@FindBy(id = "umbrella")
	WebElement seattleFan;

	@FindBy(xpath = "//input[@class='btn btn-primary']")
	WebElement saveBtn;

	public String getURL() {
		return driver.getCurrentUrl();
	}

	public WithDetailsHomePage fillTheDetails(String fileName, String fName, String loc, String jTitle) {
		chooseFile.sendKeys(fileName);
		fullName.sendKeys(fName);
		location.sendKeys(loc);
		jobTitle.sendKeys(jTitle);
		coffeeSnob.click();
		saveBtn.submit();
		return new WithDetailsHomePage(driver);
	}

}
