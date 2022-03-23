package tests;

import java.util.HashMap;

import org.junit.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import base.DriverFactory;
import pages.EmpDirAddPage;
import pages.WithDetailsHomePage;
import resources.EmpDetJsonReader;

public class EmpDirAddPageTest extends BaseClass {

	public EmpDirAddPageTest() {
		super();
	}

	EmpDetJsonReader jsonData = new EmpDetJsonReader();

	private String fullname;
	private String loc;
	private String job;

	EmpDirAddPage addPage = null;
	WithDetailsHomePage detHomePage;
	private String currentUrl;
	private String filePath = "C:\\Users\\swapn\\Desktop\\Selenium topics\\assertions.txt ";

	@Test(priority = 1)
	public void verifyUrl() {
		addPage = new EmpDirAddPage(DriverFactory.getDriver());
		currentUrl = addPage.getURL();
		Assert.assertEquals(currentUrl, "http://52.42.108.52/add");
	}

	@Test(priority = 2)
	public void verifyFillDetails() {
		HashMap<String, String> data = jsonData.employeeJsondata();
		fullname = data.get("fullName");
		loc = data.get("location");
		job = data.get("jobTitle");
		detHomePage = addPage.fillTheDetails(filePath, fullname, loc, job);

	}

}
