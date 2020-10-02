
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

// 11. Extend just from one class
public class testRegistrationForm extends BaseUI{

    String currentUrl;

    @Test
    public void testLoginJoinButton() {
        // 20. Type name of the Object and click the JoinButton
        main.clickJoinButton();
        // 27. Type registrationForm - the class where I have my test and type getStartedPage
        registrationForm.getStartedPage();
        // If checkbox is not selected then click
        WebElement checkbox = driver.findElement(Locators.CONFIRMATION_CHECKBOX);
        if (!checkbox.isSelected()) {
            checkbox.click();
            System.out.println("Checkbox is selected");
        } else {
            System.out.println("Unable to select checkbox");
        }
        // 29. registrationForm2 - the class where I have my test and type getStartedPage2
        registrationForm.getStartedPage2();

    }


}