package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.LoginPage;
import util.BrowserFactory;

public class LoginStepDefinitions {
	WebDriver driver;
	LoginPage loginPage;

	@Before
	public void beforeRun() {
		driver = BrowserFactory.startBrowser();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
	}

	@Given("^User is on the Techfio loging page$")
	public void User_is_on_the_Techfio_loging_page() throws InterruptedException {

		driver.get("https://www.techfios.com/billing/?ng=admin/");
		Thread.sleep(3000);

	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void User_enters_username(String username) {
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUsername(username);

	}

	@When("^User enters password as \"([^\"]*)\"$")
	public void User_enters_password(String password) {
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterPassword(password);

	}

	@And("^User click on SignIn buttton$")
	public void User_click_on_SignIn_buttton() {

		loginPage.clickSigninButton();

	}

	@Then("^User should land on Dashboar page$")
	public void User_should_land_on_Dashboar_page() {
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = loginPage.getpageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);

	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void User_enters_and(String username, String password) {
		loginPage.enterCredentials(username, password);

	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
