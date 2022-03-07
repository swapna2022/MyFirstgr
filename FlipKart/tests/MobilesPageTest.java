package tests;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.FlipKartMobilesPage;

public class MobilesPageTest extends BaseClass {

	FlipKartMobilesPage FKMobilePage = null;

	@Test(priority = 1)
	void verifyProductsDetails() throws InterruptedException {
		FKMobilePage = new FlipKartMobilesPage();
		FKMobilePage.productDetailsCheck();
	}

}
