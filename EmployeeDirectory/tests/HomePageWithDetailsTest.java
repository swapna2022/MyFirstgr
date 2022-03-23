package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import base.DriverFactory;
import pages.EmpDetailsPage;
import pages.WithDetailsHomePage;

public class HomePageWithDetailsTest extends BaseClass {

	public HomePageWithDetailsTest() {
		super();
	}

	WithDetailsHomePage detHomePage = null;
	EmpDetailsPage empDetailsPage;
	private String alertText;

	@Test(priority = 1)
	public void verifyAlertTest() {
		detHomePage = new WithDetailsHomePage(DriverFactory.getDriver());
		alertText = detHomePage.alertTextCheck();
		Assert.assertEquals(alertText, "Saved!");
	}

	@Test(priority = 2)
	public void verifyDetailsLink() {

		detHomePage.empDetailsLink();

	}

}
