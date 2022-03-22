package stepDefinitions;

import org.junit.Assert;

import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EMPDAddPage;
import pages.EMPDHomepage;

public class AddPageSteps {

	private EMPDHomepage hmPage = new EMPDHomepage(DriverFactory.getDriver());
	private EMPDAddPage addPage;
	private boolean userEnabled;
	DataTable employeeDetails;
	private String saveText;

	@Given("user is on add page")
	public void user_is_on_add_page() {
		addPage = hmPage.clickAdd();
	}

	@When("User gets checks on the check box fields")
	public void user_gets_checks_on_the_check_box_fields() {
		DriverFactory.getDriver().get("http://54.200.154.26/add");
		userEnabled = addPage.checkUserEnabled();
	}

	@Then("user should be able to select them")
	public void user_should_be_able_to_select_them() {
		Assert.assertTrue(userEnabled);

	}

	@When("the user enters the following data")
	public void the_user_enters_the_following_data(DataTable empDetails) throws InterruptedException {
		DriverFactory.getDriver().get("http://54.200.154.26/add");
		employeeDetails = empDetails;
		saveText = addPage.checkFileUpload(employeeDetails.cell(1, 1), employeeDetails.cell(2, 1),
				employeeDetails.cell(3, 1), employeeDetails.cell(4, 1));

	}

	@Then("the user should be able to save the details")
	public void the_user_should_be_able_to_save_the_details() {
		Assert.assertEquals(saveText, "Saved!");
	}

}
