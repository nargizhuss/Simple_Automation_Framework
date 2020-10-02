import org.openqa.selenium.By;

public class Locators {

    public static final By TAB_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    public static final By TAB_TOURS = By.xpath("//a[@href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");

    // Registration
    public static final By JOIN_BUTTON = By.cssSelector("button#show-registration-block");
    public static final By EMAIL_JOIN = By.cssSelector("#email");
    public static final By PASSWORD_JOIN = By.cssSelector("input#password");
    public static final By BUTTON_NEXT = By.xpath("//button[@type='button'][contains(text(), 'Next')]");
    public static final By NICKNAME = By.cssSelector("#nickname");

    // Date picker
    public static final By MONTH_OF_BIRTH = By.xpath("//li[@data-handler='selectMonth']");
    public static final By DAY_OF_BIRTH = By.xpath("//li[@data-handler='selectDay']");
    public static final By YEAR_OF_BIRTH = By.xpath("//li[@data-handler='selectYear']");

    public static final By LIST_MONTH = By.cssSelector("#monthSelect");
    public static final By LIST_DAYS = By.cssSelector("#daySelect");
    public static final By LIST_YEARS = By.cssSelector("#yearSelect");

    //Phone number
    public static final By PHONE_NUMBER = By.cssSelector("[name='data[phone]']");
    public static final By LOCATION = By.cssSelector("input[name='region_name'");
    public static final By CONFIRMATION_CHECKBOX = By.cssSelector("input[id='confirmation']");
    public static final By PROFILE_NEXT_BUTTON = By.cssSelector("button[data-action='update-profile']");

    //DropDownList
    public static final By DROP_DOWN_LIST_FILTER = By.xpath("//div[@class='form-inline']//select");

//    // Blog
//    public static final By TAB_BLOG = By.xpath("//a[@href='https://romanceabroad.com/content/view/blog']");
//    public static final By BLOG_HEADER = By.xpath("//h1[contains(text(),'Blog')]");
//    public static final By BLOG_ARTICLES = By.xpath("//div[@class='info-content-block wysiwyg']");
//    public static final By ARTICLE_KHARKOV_AGENCY = By.xpath("//a[@href='https://romanceabroad.com/content/view/kharkov-dating-agency']");
}
