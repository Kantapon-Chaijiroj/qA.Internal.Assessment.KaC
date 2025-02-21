package stepdefinitions;

import com.microsoft.playwright.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class UC_LOGIN_AND_REGISTER {
	private Browser browser;
	private Page page;


	@Before  //Open browser
	public void setUp() {
		Playwright playwright = Playwright.create();
		browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		page = browser.newPage();
	}

	@Given("The user is on the login page")
	public void The_user_is_on_the_login_page() {
		page.navigate("https://petstore.octoperf.com/actions/Account.action;jsessionid=11076E119C973AB4877B479E893310E6?signonForm=");
	}

	@When("Click on the Register Now button")
	public void Click_on_the_Register_Now_button() {
		Locator registerNowButton = page.locator("//a[contains(@href, 'new') and text() = 'Register Now!']");
		registerNowButton.waitFor();
		registerNowButton.click();
		Locator saveNewAccountButton = page.locator("//input[@value='Save Account Information']");
		saveNewAccountButton.waitFor();
	}

	@Then("Verify that the user is on the registration page")
	public void Verify_that_the_user_is_on_the_registration_page() {
		Locator saveNewAccountButton = page.locator("//input[@value='Save Account Information']");
		saveNewAccountButton.waitFor();
		if (!saveNewAccountButton.isVisible()) {
			throw new RuntimeException("The user is not on the registration page");
		}
	}

	@When("Fill in the user details")
	public void Fill_in_the_user_details(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		Map<String, String> row = data.get(0);
		page.fill("//input[@name='username']", row.get("User ID"));
		page.fill("//input[@name='password']", row.get("Password"));
		page.fill("//input[@name='repeatedPassword']", row.get("Password"));
		page.fill("//input[@name='account.firstName']", row.get("First name"));
		page.fill("//input[@name='account.lastName']", row.get("Last name"));

	}

	@When("Click on Save Account Information button")
	public void click_on_save_account_information_button() {
		Locator registerNowButton = page.locator("//input[@name='newAccount']");
		registerNowButton.waitFor();
		registerNowButton.click();
	}

	@Then("Verify that the user is created")
	public void Verify_that_the_user_is_created() {
		String homepage;
		homepage = page.url();
		if (homepage != "https://petstore.octoperf.com/actions/Catalog.action") {
			throw new RuntimeException("The user is not created");
		}
	}

	@When("Enter the User ID {string} and Password {string}")
	public void enter_the_user_id_and_password(String string, String string2) {
		string = "k_chaijiroj";
		string2 = "asdfgh";
		page.fill("//input[@name='username']", (string));
		page.fill("//input[@name='password']", (string2));
	}

	@When("Click on Login button")
	public void click_on_login_button() {
		Locator LoginButton = page.locator("//input[@name='signon']");
		LoginButton.waitFor();
		LoginButton.click();
	}

	@Then("Verify that the new user is a logged in user")
	public void Verify_that_the_new_user_is_a_logged_in_user() {
		Locator Username = page.locator("//div[@id='WelcomeContent' and @text() = 'Welcome Kantapon!']");
		//Username = page.locator("//div[@id='WelcomeContent']");

		if (Username.isVisible()){
			throw new RuntimeException("User not logged in");
		}
	}

	@After
	public void tearDown() throws InterruptedException {
		if (browser != null) {
			Thread.sleep(10000); // Wait for 10 seconds
			browser.close();
		}
	}
}