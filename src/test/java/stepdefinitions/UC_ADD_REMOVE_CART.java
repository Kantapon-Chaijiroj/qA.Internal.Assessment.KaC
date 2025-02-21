package stepdefinitions;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class UC_ADD_REMOVE_CART {
	private Browser browser;
	private Page page;


	@Before  //Open browser
	public void setUp() {
		Playwright playwright = Playwright.create();
		browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		page = browser.newPage();
	}

	//The coding section for the UC_ADD_REMOVE_CART.feature has not been defined yet.

	@After
	public void tearDown() throws InterruptedException {
		if (browser != null) {
			Thread.sleep(10000); // Wait for 10 seconds
			browser.close();
		}
	}
}