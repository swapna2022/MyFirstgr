package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.DBPage;

public class DataTbleButtonsSteps {

	static WebDriver driver;
	DBPage page;
	private String URL;
	private String title;
	private String mainheader;
	private int tableCount;
	private String table1Head;
	private int table2Rows;
	private boolean input;
	private boolean contactUs;
	private boolean pageCheck;
	private int table3Rows;
	private boolean warningBtn;

	@Given("user is on Home page")
	public void user_is_on_home_page() {
		System.setProperty("webdriver.chrome.driver", "./exes\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://webdriveruniversity.com/Data-Table/index.html");

	}

	@When("user gets the URL of Home page")
	public void user_gets_the_url_of_home_page() {
		page = new DBPage(driver);
		URL = driver.getCurrentUrl();

	}

	@SuppressWarnings("deprecation")
	@Then("page URL should be {string}")
	public void page_url_should_be(String homePageURL) {
		Assert.assertEquals(URL, homePageURL);
	}

	@When("user gets the title of Home page")
	public void user_gets_the_title_of_home_page() {
		title = driver.getTitle();
	}

	@SuppressWarnings("deprecation")
	@Then("page title should be {string}")
	public void page_title_should_be(String homePageTitle) {
		Assert.assertEquals(title, homePageTitle);
	}

	@When("user gets the main header of Home page")

	public void user_gets_the_main_header_of_home_page() {
		page = new DBPage(driver);
		mainheader = page.headerCheck();
	}

	@SuppressWarnings("deprecation")
	@Then("thge main header of the page should be {string}")
	public void thge_main_header_of_the_page_should_be(String header) {
		Assert.assertEquals(mainheader, header);
	}

	@When("user gets the tables count")
	public void user_gets_the_tables_count() {
		page = new DBPage(driver);
		tableCount = page.tablesCheck();
	}

	@SuppressWarnings("deprecation")
	@Then("the table count should be three")
	public void the_table_count_should_be_three() {
		Assert.assertEquals(tableCount, 3);

	}

	@When("user gets the table one details")
	public void user_gets_the_table_one_details() {
		page = new DBPage(driver);
		table1Head = page.table1Details();
	}

	@SuppressWarnings("deprecation")
	@Then("the table one header should be {string}")
	public void the_table_one_header_should_be(String head1) {
		Assert.assertEquals(table1Head, head1);
	}

	@When("user gets the table two details")
	public void user_gets_the_table_two_details() {
		page = new DBPage(driver);
		table2Rows = page.table2Details();
	}

	@SuppressWarnings("deprecation")
	@Then("the table two rows count should be four")
	public void the_table_two_rows_count_should_be_four() {
		Assert.assertEquals(table2Rows, 4);
	}

	@When("user checks if we can enter data in input fields")
	public void user_checks_if_we_can_enter_data_in_input_fields() {
		page = new DBPage(driver);
		input = page.inputFieldsCheck("john", "peter", "create");
	}

	@Then("the input fields should be active and user can enter data")
	public void the_input_fields_should_be_active_and_user_can_enter_data() {
		Assert.assertEquals(input, true);
	}

	@When("user checks Breadcrumb links")
	public void user_checks_breadcrumb_links() {
		page = new DBPage(driver);
		contactUs = page.breadCrumbLinksCheck();
	}

	@Then("the Home and About us is enabled and Contact us is not enabled")
	public void the_home_and_about_us_is_enabled_and_contact_us_is_not_enabled() {
		Assert.assertTrue(contactUs);
	}

	@When("user checks Pagination links")
	public void user_checks_pagination_links() {
		page = new DBPage(driver);
		pageCheck = page.paginationLinksCheck();
	}

	@Then("all pages href value is same")
	public void all_pages_href_value_is_same() {
		Assert.assertTrue(pageCheck);
	}

	@When("user checks for table three details")
	public void user_checks_for_table_three_details() {
		page = new DBPage(driver);
		table3Rows = page.table3Check();
	}

	@Then("table three rows count should be four")
	public void table_three_rows_count_should_be_four() {
		Assert.assertEquals(table3Rows, 4);
	}

	@When("user checks for the state of buttons")
	public void user_checks_for_the_state_of_buttons() {
		page = new DBPage(driver);
		warningBtn = page.buttonstatesCheck();
	}

	@Then("warning button is not enabled")
	public void warning_button_is_not_enabled() {
		Assert.assertTrue(warningBtn);
		driver.quit();
	}

}
