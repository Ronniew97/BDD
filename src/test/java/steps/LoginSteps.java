package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.LoginPage;
import util.BrowserFactory;

public class LoginSteps {
	
	 WebDriver driver;
	 LoginPage login;
	 
	@Before
	public void browsers() {
//		driver = BrowserFactory.init();
//		login = PageFactory.initElements(driver, LoginPage.class);
	}
	
	@Given("^User is on techfios billing site$")
	public void user_is_on_techfios_billing_site() throws Throwable {
		driver.get("https://techfios.com/billing/?ng=login/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}

	@When("^User enters a valid username \"([^\"]*)\"$")
	public void user_enters_a_valid_username(String username) throws Throwable {
		login.enterUserName(username);
	}

	@When("^User enters a valid password \"([^\"]*)\"$")
	public void user_enters_a_valid_password(String password) throws Throwable {
		login.enterPassword(password);
	}

	@When("^User clicks on the sign in button$")
	public void user_clicks_on_the_sign_in_button() throws Throwable {
		login.clickSignInButton();
	}

	@Then("^User should be able to see the dashboard$")
	public void user_should_be_able_to_see_the_dashboard() throws Throwable {
		//login.takeScreenShotAtTheEndOfTest();
	}

	@After
	public void tearDOwn() {
//		driver.close();
//		driver.quit();
	}
}
