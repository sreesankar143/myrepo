package samplemain;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mainsample {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup();
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\geckodriver.exe");
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
WebDriverWait wait=new WebDriverWait(driver,20);
Thread.sleep(1000);
driver.findElement(By.id("ap_email")).sendKeys("9962449186");
driver.findElement(By.id("ap_password")).sendKeys("9962449186");

driver.findElement(By.id("signInSubmit")).click();

	}

}
