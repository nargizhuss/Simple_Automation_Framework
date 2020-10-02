import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class testAllTabsAreClickable extends BaseUI {

    @Test
    public void testTabsClickable() {
        // Click on all the tabs and come back to the main page
        List<WebElement> links = driver.findElements(By.xpath("//ul[@class='navbar-nav']//li"));
        System.out.println(links.size());

        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            driver.get(Data.MAIN_URL);
            links = driver.findElements(By.xpath("//ul[@class='navbar-nav']//li"));

        }

    }
}
