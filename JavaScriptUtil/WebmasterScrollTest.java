package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.BaseClass;
import pages.WebmasterScrollPage;

public class WebmasterScrollTest extends BaseClass {

	public WebmasterScrollTest() {
		super();
	}

	WebmasterScrollPage wsPage;

	@BeforeClass
	void verifyTiltle() {
		launchURL();
		wsPage = new WebmasterScrollPage();
		Assert.assertEquals(wsPage.titleCheck(), "WebDriver | Scrolling");
	}

	@Test(priority = 1)
	public void verifyScroll1() {
		Assert.assertEquals(wsPage.text1Check(), "Scroll to me first!");
	}

	@Test(priority = 2)
	public void verifyScroll2() {
		wsPage.text2Check();
	}

	@Test(priority = 3)
	public void verifyScrollToEle() {
		Assert.assertEquals(wsPage.scrollTillEleCheck(), "thumbnail");
	}

	@Test(priority = 4)
	public void verifyFlash() {
		wsPage.flashingCheck();
	}

}
