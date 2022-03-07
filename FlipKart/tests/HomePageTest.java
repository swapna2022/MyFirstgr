package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.FlipKartHomePage;
import pages.FlipKartMobilesPage;

public class HomePageTest extends BaseClass {

	public HomePageTest() {
		super();
	}

	FlipKartHomePage homePage = null;
	FlipKartMobilesPage FKMobilePage = null;

	@BeforeClass
	public void init() throws Exception {

		launchURL();
		homePage = new FlipKartHomePage();
		Assert.assertEquals(homePage.getTiltle(),
				"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		System.out.println(homePage.getTiltle());
	}

	@Test
	void verifyHomePage() throws InterruptedException {

		FKMobilePage = homePage.searchMobile();
	}

}
