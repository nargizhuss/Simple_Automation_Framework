import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

// 13. Create a constructor and initialize drivers in Parent class
    public class BaseActions {
    // 14. protected means that we use this WebDriver for this class only
    protected WebDriver driver;
    protected WebDriverWait wait;

    // 15. I created a constructor with the same name as class
    public BaseActions(WebDriver driver, WebDriverWait wait) {
        // I've created an empty variables
        this.driver = driver;
        this.wait = wait;
    }

    public void getDropDownListByIndex(By locator, int index) {
        // 30. Dropdown list testing. By index
        Select select = new Select(driver.findElement(locator));
        select.selectByIndex(index);

    }

    public void getDropDownListByText(By locator, String value) {
        // 32. Dropdown list testing. By text
        Select select = new Select(driver.findElement(locator));
        select.selectByValue("views_count");

    }

}