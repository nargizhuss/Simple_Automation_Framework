import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
// 16. Extend parent class BaseAction
public class Main extends BaseActions {

    public Main(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public void clickJoinButton() {
        // 19. Constructor: Import "JoinButton click" from Login test case
        wait.until(ExpectedConditions.elementToBeClickable(Locators.JOIN_BUTTON));
        driver.findElement(Locators.JOIN_BUTTON).click();

    }



}
