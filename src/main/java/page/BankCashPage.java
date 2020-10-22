package page;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import util.BasePage;

public class BankCashPage extends BasePage {

	WebDriver driver;

	public BankCashPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@name='username']")
	WebElement USERNAME_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	WebElement PASSWORD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement SIGN_IN_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/a/span[1]")
	WebElement BANK_CASH_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a")
	WebElement NEW_ACCOUNT_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@name='account']")
	WebElement ACCOUNT_TITLE;
	@FindBy(how = How.XPATH, using = "//input[@name='description']")
	WebElement DESCRIPTION;
	@FindBy(how = How.XPATH, using = "//input[@name='balance']")
	WebElement INITIAL_BALANCE;
	@FindBy(how = How.XPATH, using = "//input[@name='account_number']")
	WebElement ACCOUNT_NUMBER;
	@FindBy(how = How.XPATH, using = "//input[@name='contact_person']")
	WebElement CONTACT_PERSON;
	@FindBy(how = How.XPATH, using = "//input[@name='contact_phone']")
	WebElement PHONE_NUMBER;
	@FindBy(how = How.XPATH, using = "//input[@name='ib_url']")
	WebElement INTERNET_BANKING_URL;
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary']")
	WebElement SUBMIT_BUTTON_LOCATOR;

	public void enterUserName(String username) {
		USERNAME_LOCATOR.sendKeys(username);
	}

	public void enterPassword(String password) {
		PASSWORD_LOCATOR.sendKeys(password);
	}

	public void clickSignInButton() {
		SIGN_IN_LOCATOR.click();
	}

	public void clickBankCashMenuButton() {
		explicitWait("clickable",driver, 10, BANK_CASH_LOCATOR);
		BANK_CASH_LOCATOR.click();
	}

	public void clickNewAccountButton() {
		//explicitWait("visible",driver,5, NEW_ACCOUNT_LOCATOR);
		NEW_ACCOUNT_LOCATOR.click();
	}

	public void enterAccountTitle(String accountTitle) {
		explicitWait("visible", driver, 8, ACCOUNT_TITLE);
		ACCOUNT_TITLE.sendKeys(accountTitle + randomNumbers());
	}

	public void enterDescription(String description) {
		DESCRIPTION.sendKeys(description);
	}

	public void enterInitialBalance(String balance) {
		INITIAL_BALANCE.sendKeys(balance);
	}

	public void enterAccountNumber(String accountNumber) {
		ACCOUNT_NUMBER.sendKeys(accountNumber);
	}

	public void enterContactPerson(String contact) {
		CONTACT_PERSON.sendKeys(contact);
	}

	public void enterPhoneNumber(String phone) {
		PHONE_NUMBER.sendKeys(phone);
	}

	public void enterInternetBankingURL(String url) {
		INTERNET_BANKING_URL.sendKeys(url);
	}

	public void clickSubmitButton() {
		SUBMIT_BUTTON_LOCATOR.click();
	}

	public void takeScreenshotAtTheEndOfThisTest() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) (driver);
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File("user" + "/screenshots/" + System.currentTimeMillis() + ".png"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
