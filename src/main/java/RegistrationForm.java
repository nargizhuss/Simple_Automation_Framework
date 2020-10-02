import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

    // 21. Create a new class and constructor w/ the same name
    // 24. Extend BaseActions
    public class RegistrationForm extends BaseActions {
    public RegistrationForm (WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    // 26. Create a Java Method and import from testLoginJoinButton
    public void getStartedPage() {
        driver.findElement(Locators.EMAIL_JOIN).sendKeys(Data.EMAIL);
        driver.findElement(Locators.PASSWORD_JOIN).sendKeys(Data.PASSWORD);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_NEXT));
        driver.findElement(Locators.BUTTON_NEXT).click();
    }
    // 28. Create getStartedPage2 and import the test case fro the second registration page
    public void getStartedPage2() {
        driver.findElement(Locators.NICKNAME).sendKeys(Data.NICKNAME);
        driver.findElement(Locators.LIST_DAYS).click();
        driver.findElements(Locators.DAY_OF_BIRTH).get(0).click();
        driver.findElement(Locators.LIST_MONTH).click();
        driver.findElements(Locators.MONTH_OF_BIRTH).get(1).click();
        driver.findElement(Locators.LIST_YEARS).click();
        driver.findElements(Locators.YEAR_OF_BIRTH).get(1).click();
        driver.findElement(Locators.PHONE_NUMBER).sendKeys(Data.PHONE_NUMBER);
        driver.findElement(Locators.LOCATION).sendKeys(Data.LOCATION);
        driver.findElement(Locators.CONFIRMATION_CHECKBOX).click();
        driver.findElement(Locators.PROFILE_NEXT_BUTTON).click();


    }

}
