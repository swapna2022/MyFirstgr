package stepDefinitions;

import org.junit.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EMPDHomepage;

public class HomePageSteps {

	private EMPDHomepage hmPage = new EMPDHomepage(DriverFactory.getDriver());
	private String url;
	private String hMPTitle;
	private String mainHeader;
	private String cardHeader;

	@Given("user is on Home page")
	public void user_is_on_home_page() {
		DriverFactory.getDriver().get("http://54.200.154.26/");

	}

	@When("User gets the url of the web page")
	public void user_gets_the_url_of_the_web_page() {
		url = hmPage.getHomepageURL();
	}

	@Then("url should be {string}")
	public void url_should_be(String Actualurl) {
		Assert.assertTrue(url.contains(Actualurl));
	}

	@When("User gets the title of the web page")
	public void user_gets_the_title_of_the_web_page() {
		hMPTitle = hmPage.getHomepageTitle();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String title) {
		Assert.assertTrue(hMPTitle.contains(title));
	}

	@When("User gets the Main header of the web page")
	public void user_gets_the_main_header_of_the_web_page() {
		mainHeader = hmPage.checkMainHeader();
	}

	@Then("Main header should be {string}")
	public void main_header_should_be(String mHeader) {
		Assert.assertTrue(mainHeader.contains(mHeader));
	}

	@When("User gets the card header of the web page")
	public void user_gets_the_card_header_of_the_web_page() {
		cardHeader = hmPage.checkCardHeader();
	}

	@Then("card header should contains {string}")
	public void card_header_should_contains(String cHeader) {
		Assert.assertTrue(cardHeader.contains(cHeader));
	}

}
