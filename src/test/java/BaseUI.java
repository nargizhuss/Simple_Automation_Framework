import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseUI {

    // 10. Created an object for main class. I extended all methods from the Main class - Main main = new Main();
    // Constructor: 17. Leave this object empty. Main main;
    Main main;
    // 22. Constructor: Create a new object for RegistrationForm class
    RegistrationForm registrationForm;
    WebDriver driver;
    // Explicit: 1. For explicit wait we need to create a variable
    WebDriverWait wait;


    @BeforeMethod
    public void setUp() {
        // 11. Now we can use this main class
        //main.printInfo();
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        // Explicit: 3. set the WebDriverWait time, let's say 10 sec
        wait = new WebDriverWait(driver, 10);
        // Constructor: 18. Add main object with driver, wait
        main = new Main(driver, wait);
        // 23. Constructor: Add registrationForm object w/ drivers
        registrationForm = new RegistrationForm(driver, wait);
        driver.manage().window().maximize();
        driver.get(Data.MAIN_URL);
    }

    @AfterMethod
    public void tearDown() {

        //driver.quit();
    }
}


