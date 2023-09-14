package pomclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "ap_email")
    private WebElement emailField;

    @FindBy(id = "ap_password")
    private WebElement passwordField;

    @FindBy(id = "signInSubmit")
    private WebElement signInButton;
    @FindBy(id = "nav-link-accountList")
    private static WebElement nav;
    @FindBy(id = "nav-item-signout")
    private static WebElement signout;

    public void login(String email, String password) {
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        signInButton.click();
    }
    public static void Logout() throws Exception
    {
    	nav.click();
    	Thread.sleep(2000);
    	signout.click();
    	
        
    }
}
