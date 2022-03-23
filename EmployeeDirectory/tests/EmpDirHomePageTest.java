package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseClass;
import base.DriverFactory;
import pages.EmpDirAddPage;
import pages.EmpDirHomePage;

public class EmpDirHomePageTest extends BaseClass {

	public EmpDirHomePageTest() {
		super();
	}

	EmpDirHomePage homePage = null;
	EmpDirAddPage addPage;
	private String header;

	@BeforeClass
	public void init() throws Exception {

		launchURL();
		homePage = new EmpDirHomePage(DriverFactory.getDriver());
		Assert.assertEquals(homePage.getURL(), "http://52.42.108.52/");
		System.out.println(homePage.getURL());
	}

	@Test(priority = 1)
	public void verifyHeader() {
		header = homePage.headerCheck();
		System.out.println(header);
		Assert.assertEquals(header, "Employee Directory");

	}

	@Test(priority = 2)
	public void verifyClickAdd() {
		addPage = homePage.clickAdd();
	}

}
