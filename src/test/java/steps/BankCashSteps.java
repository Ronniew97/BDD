package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.BankCashPage;
import util.BrowserFactory;

public class BankCashSteps {

	WebDriver driver;
	BankCashPage bank;
	String username = "demo@techfios.com";
	String password = "abc123";

	@Before
	public void launchBrowser() {
		driver = BrowserFactory.init();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/billing/?ng=admin/");
		bank = PageFactory.initElements(driver, BankCashPage.class);
	}

	@Given("^User logs into techfios billing and is on the dashboard page$")
	public void user_logs_into_techfios_billing_and_is_on_the_dashboard_page() throws Throwable {
		bank.enterUserName(username);
		bank.enterPassword(password);
		bank.clickSignInButton();
	}

	@When("^User presses the Bank & Cash Button and he presses the New Account Button$")
	public void user_presses_the_Bank_Cash_Button_and_he_presses_the_New_Account_Button() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		bank.clickBankCashMenuButton();
		bank.clickNewAccountButton();
	}

	@When("^User enters \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String accountTitle, String description, String initialBalance, String accountNumber,
			String contactPerson, String phoneNumber, String url) throws Throwable {
		bank.enterAccountTitle(accountTitle);
		bank.enterDescription(description);
		bank.enterInitialBalance(initialBalance);
		bank.enterAccountNumber(accountNumber);
		bank.enterContactPerson(contactPerson);
		bank.enterPhoneNumber(phoneNumber);
		bank.enterInternetBankingURL(url);
	}

	@And("^User presses submit$")
	public void user_presses_submit() throws Throwable {
		bank.clickSubmitButton();
	}

	@Then("^User should see Account Created Succesfully$")
	public void user_should_see_Account_Created_Succesfully() throws Throwable {
		bank.takeScreenshotAtTheEndOfThisTest();
	}

	@After
	public void tearDown() {
//		driver.close();
//		driver.quit();
	}

}
