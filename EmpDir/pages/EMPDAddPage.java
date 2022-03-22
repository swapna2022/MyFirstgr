package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EMPDAddPage {

	private WebDriver driver;

	public EMPDAddPage(WebDriver driver) {
		this.driver = driver;
	}

	private By macUser = By.id("apple");
	private By windows = By.id("windows");
	private By linux = By.id("linux");
	private By digiContentStar = By.id("video-camera");
	private By empOfMonth = By.id("trophy");
	private By photographer = By.id("camera");
	private By freqFlier = By.id("plane");
	private By PaperClipAffi = By.id("paperclip");
	private By coffeeSnob = By.id("coffee");
	private By gamer = By.id("gamepad");
	private By bugFixer = By.id("bug");
	private By seattleFan = By.id("umbrella");

	private By chooseFile = By.id("photo");
	private By fullName = By.id("full_name");
	private By location = By.id("location");
	private By jobTitle = By.id("job_title");
	private By saveButton = By.xpath("//input[@type='submit']");

	private By fileUploadMsg = By.xpath("//div[@class='alert alert-primary']");
	private String alertText;

	public String getHomepageURL() {
		return driver.getCurrentUrl();
	}

	public boolean checkUserEnabled() {
		System.out.println("Is Mac User enabled : " + driver.findElement(macUser).isEnabled());
		System.out.println("Is Windows User enabled : " + driver.findElement(windows).isEnabled());
		System.out.println("Is Mac User enabled : " + driver.findElement(linux).isEnabled());
		System.out.println("Is Mac User enabled : " + driver.findElement(digiContentStar).isEnabled());
		System.out.println("Is Mac User enabled : " + driver.findElement(empOfMonth).isEnabled());
		System.out.println("Is Mac User enabled : " + driver.findElement(photographer).isEnabled());
		System.out.println("Is Mac User enabled : " + driver.findElement(freqFlier).isEnabled());
		System.out.println("Is Mac User enabled : " + driver.findElement(PaperClipAffi).isEnabled());
		System.out.println("Is Mac User enabled : " + driver.findElement(coffeeSnob).isEnabled());
		System.out.println("Is Mac User enabled : " + driver.findElement(gamer).isEnabled());
		System.out.println("Is Mac User enabled : " + driver.findElement(bugFixer).isEnabled());
		System.out.println("Is Mac User enabled : " + driver.findElement(seattleFan).isEnabled());
		return driver.findElement(seattleFan).isEnabled();

	}

	public String checkFileUpload(String file, String name, String loc, String job) throws InterruptedException {
		driver.findElement(chooseFile).sendKeys(file);
		driver.findElement(fullName).sendKeys(name);
		driver.findElement(location).sendKeys(loc);
		driver.findElement(jobTitle).sendKeys(job);
		driver.findElement(saveButton).click();

		Thread.sleep(5000);
		alertText = driver.findElement(fileUploadMsg).getText();
		return alertText;

	}
}
