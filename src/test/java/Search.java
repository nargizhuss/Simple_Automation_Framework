
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

// 11. Extend just from one class
public class Search extends BaseUI {

    String currentUrl;

    @Test
    public void testTabSearch(){

        //wait.until(ExpectedConditions.elementToBeClickable(Locators.TAB_SEARCH));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(Locators.TAB_SEARCH).click();
        currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, Data.EXPECTED_URL_SEARCH);
        //31. Dropdown list By Index
        main.getDropDownListByIndex(Locators.DROP_DOWN_LIST_FILTER, 2);
        // 33. Dropdown list By Text
        main.getDropDownListByText(Locators.DROP_DOWN_LIST_FILTER, "Views");


    }
    @Test
    public void tabSearchContainsValidName(){
        WebElement tabSearch = driver.findElement(Locators.TAB_SEARCH);

        if (tabSearch.getText().contains("PRETTY WOMEN")) {
            tabSearch.click();
        } else {
            Assert.fail("Doesn't contain PRETTY WOMEN tab");
        }
    }

    @Test
    public void tabSearchDisplayed() {
        WebElement tabSearch = driver.findElement(Locators.TAB_SEARCH);

        if (tabSearch.isDisplayed()) {
            tabSearch.click();
        } else {
            Assert.fail("Doesn't contain PRETTY WOMEN tab");
        }

    }

}