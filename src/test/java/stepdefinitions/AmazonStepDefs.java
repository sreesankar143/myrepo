package stepdefinitions;
import io.cucumber.java.en.*;
import pomclasses.CartPage;
import pomclasses.HomePage;
import pomclasses.LoginPage;
import pomclasses.SearchResultPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class AmazonStepDefs {

    private static final boolean True = false;
	WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    SearchResultPage searchResultsPage;
    CartPage cartPage;

    @Given("User is on Amazon login page")
    public void userIsOnAmazonLoginPage() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new FirefoxDriver();
        loginPage = new LoginPage(driver);
        driver.get("https://www.amazon.com/");
    }

    @When("User logs in with valid credentials")
    public void userLogsInWithValidCredentials() {
        loginPage.login("9962449186", "Amazon@123");
    }

    @Then("User should be logged in successfully")
    
    public void userShouldBeLoggedInSuccessfully() 
    {
    	Assert.assertTrue(True);
        
    }

    @When("User searches for an item")
    public void userSearchesForItem() {
        homePage = new HomePage(driver);
        homePage.searchItem("TV");
    }

    @Then("User should see search results")
    public void userShouldSeeSearchResults() {
        
    }

    @When("User adds the item to the cart")
    public void userAddsItemToCart() {
        searchResultsPage = new SearchResultPage(driver);
        searchResultsPage.addToCart();
    }

    @Then("User should see the item in the cart")
    public void userShouldSeeItemInCart() {
        cartPage = new CartPage(driver);
       
    }

    @When("User logs out")
    public void userLogsOut() throws Exception {
    	LoginPage.Logout();
    }

    @Then("User should be logged out successfully")
    public void userShouldBeLoggedOutSuccessfully() {
        Assert.assertTrue(True);
        driver.quit();
    }
}
