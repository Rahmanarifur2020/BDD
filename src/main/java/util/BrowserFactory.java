package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	static WebDriver driver;
	
	public static WebDriver startBrowser() {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\arifu\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		
		return driver;
		
	}

}
