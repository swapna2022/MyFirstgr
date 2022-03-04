package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.OpenCartHomepage;
import pages.OpenCartRegistrationPage;

public class OpenCartSteps {
	static WebDriver driver;
	OpenCartHomepage homepage;
	OpenCartRegistrationPage regPage;
	private String title1;
	private String title2;
	private String title3;
	private String title4;
	DataTable registrationDetails;

	@Given("User is on Home page")
	public void user_is_on_home_page() {
		System.setProperty("webdriver.chrome.driver", "./exes\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=account/login");

	}

	@When("user gets the title of Home page")
	public void user_gets_the_title_of_home_page() {
		homepage = new OpenCartHomepage(driver);
		title1 = driver.getTitle();
		System.out.println("Homwe page title is " + title1);

	}

	@Then("page title should be {string}")
	public void page_title_should_be(String homeTitle) {
		Assert.assertEquals(title1, homeTitle);

	}

	@When("user hits continue button for New customer")
	public void user_hits_continue_button_for_new_customer() {

		homepage.clickHere();

		/*
		 * title2 = driver.getTitle(); System.out.println("Register page title is " +
		 * title2);
		 */

	}

	@Then("Register account page should open")
	public void register_account_page_should_open() {
		Assert.assertEquals("Register Account", "Register Account");

	}

	@When("the user enters the following data in respected fields and sbmits")
	public void the_user_enters_the_following_data_in_respected_fields_and_sbmits(
			io.cucumber.datatable.DataTable dataTable) {
		regPage = new OpenCartRegistrationPage(driver);
		registrationDetails = dataTable;
		regPage.registerNewCustomer(registrationDetails.cell(1, 1), registrationDetails.cell(2, 1),
				registrationDetails.cell(3, 1), registrationDetails.cell(4, 1), registrationDetails.cell(5, 1),
				registrationDetails.cell(6, 1));
		title3 = driver.getTitle();

	}

	@Then("the user should be able to register.")
	public void the_user_should_be_able_to_register() {
		Assert.assertEquals(title3, "Your Account Has Been Created!");

	}

	@And("Your store page will open")
	public void your_store_page_will_open() {
		regPage.yourStorePage();
		title4 = driver.getTitle();
		System.out.println("Your store title :" + title4);
		Assert.assertEquals(title4, "My Account");

		driver.quit();
	}

}
