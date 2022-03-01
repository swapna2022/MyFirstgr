package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.BaseClass;
import pages.WebDriverUniversityPage;

public class WebdriberUnivPageTest extends BaseClass {

	public WebdriberUnivPageTest() {
		super();
	}

	WebDriverUniversityPage wuPage;

	@BeforeClass
	void verifyTiltle() {
		launchURL();
		wuPage = new WebDriverUniversityPage();
		Assert.assertEquals(wuPage.getTiltle(), "WebDriver | Actions");
	}

	@Test(priority = 2)
	void verifydragAndDrop() {
		wuPage.dragToDrop();
		System.out.println(wuPage.getTiltle());
	}

	@Test(priority = 3)
	void verifyDoubleClick() {
		wuPage.doubleClick();

	}

	@Test(priority = 4)
	void verifyMouseOvers() {
		wuPage.mouseOvers();

	}

	@Test(priority = 5)
	void verifyClickAndHold() {

		wuPage.clickAndHold();

	}

}
