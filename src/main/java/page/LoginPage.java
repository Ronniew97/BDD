package page;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@name='username']")
	WebElement USERNAME_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	WebElement PASSWORD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement SIGNIN_BUTTON_LOCATOR;
	
	public void enterUserName(String username) {
		USERNAME_LOCATOR.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		PASSWORD_LOCATOR.sendKeys(password);
	}
	
	public void clickSignInButton() {
		SIGNIN_BUTTON_LOCATOR.click();
	}
	
	public void takeScreenShotAtTheEndOfTest() throws IOException {
		TakesScreenshot ts = (TakesScreenshot)(driver);
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File ("user"+"/screenshots/"+System.currentTimeMillis()+".png"));
	}
}
