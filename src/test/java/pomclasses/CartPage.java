package pomclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isItemInCart(String itemName) {
        return driver.findElement(By.xpath("//span[contains(text(), '" + itemName + "')]")).isDisplayed();
    }

    public void logout() {
        driver.findElement(By.id("nav-item-signout")).click();
    }
}
