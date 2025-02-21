package stepdefinitions;

import com.microsoft.playwright.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class UC_CHECKOUT {
	private Browser browser;
	private Page page;


	@Before  //Open browser
	public void setUp() {
		Playwright playwright = Playwright.create();
		browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		page = browser.newPage();
	}

	//The coding section for the UC_CHECKOUT.feature has not been defined yet.

	@After
	public void tearDown() throws InterruptedException {
		if (browser != null) {
			Thread.sleep(10000); // Wait for 10 seconds
			browser.close();
		}
	}
}