package tests;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.DriverFactory;
import pages.EmpDetailsPage;
import resources.EmpDetJsonReader;

public class EmpDetailsPageTest {

	public EmpDetailsPageTest() {
		super();
	}

	EmpDetailsPage detailsPage = null;
	private String name;
	private String location;
	private String jobTitle;
	private String user;

	EmpDetJsonReader jsonData = new EmpDetJsonReader();
	HashMap<String, String> data = jsonData.employeeJsondata();

	@Test(priority = 1)
	public void verifyFullName() {
		detailsPage = new EmpDetailsPage(DriverFactory.getDriver());
		name = detailsPage.nameCheck();
		System.out.println(name);
		Assert.assertTrue(name.contains(data.get("fullName")));
	}

	@Test(priority = 2)
	public void verifyLocation() {

		location = detailsPage.locationCheck();
		Assert.assertEquals(location, data.get("location"));
	}

	@Test(priority = 3)
	public void verifyJobTitle() {

		jobTitle = detailsPage.jobCheck();
		Assert.assertEquals(jobTitle, data.get("jobTitle"));
	}

	@Test(priority = 4)
	public void verifyUser() {

		user = detailsPage.userCheck();
		Assert.assertEquals(user, "Coffee Snob");
	}

}
