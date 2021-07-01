package page;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
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
	
	
	@FindBy(how = How.ID, using = "username") WebElement USERNAME_FIELD_LOCATOR;
	@FindBy(how = How.ID, using = "password") WebElement PASSWORD_FIELD_LOCATOR;
	@FindBy(how = How.NAME, using = "login") WebElement SIGNIN_BUTTON_LOCATOR;
	

	public void enterUsername(String username) {
		USERNAME_FIELD_LOCATOR.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		PASSWORD_FIELD_LOCATOR.sendKeys(password);
	}
	
	public void enterCredentials(String username, String password) {
		USERNAME_FIELD_LOCATOR.sendKeys(username);
		PASSWORD_FIELD_LOCATOR.sendKeys(password);
	}
	
	public void clickSigninButton() {
		SIGNIN_BUTTON_LOCATOR.click();
	}
	
	public String getpageTitle() {
		return driver.getTitle();
	}
	
	
	  public void takeScreenshotAtEndOfTest(WebDriver driver) throws IOException {
	  TakesScreenshot ts = ((TakesScreenshot)driver); SimpleDateFormat formatter =
	  new SimpleDateFormat("MMddyy_HHmmss"); Date date = new Date(); String label =
	  formatter.format(date); File sourceFile =
	  ts.getScreenshotAs(OutputType.FILE); String currentDir =
	  System.getProperty("user.dir"); FileUtils.copyFile(sourceFile,new
	  File(currentDir + "/screenshots/"+label+".png")); }
	 

	
	
    }
	
	

