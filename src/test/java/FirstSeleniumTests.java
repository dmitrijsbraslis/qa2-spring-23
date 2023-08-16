import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTests {
    private final By REGISTRATION_FORM = By.id("registration-form");
    private final By FIRST_NAME_INPUT_FIELD = By.name("first-name");
    private final By SMART_NET_JOIN_BTN = By.xpath(".//span[@class = 'smart-net-banner__info-button-text']");
    private final By LOGO = By.tagName("img");
    private final By SEARCH_INPUT = By.id("q");

    @Test
    public void firstSeleniumTry() {
        WebDriver browser = new ChromeDriver();
        browser.get("http://1a.lv");

        WebElement inputField = browser.findElement(SEARCH_INPUT);
        inputField.sendKeys("Hello, World!");
        inputField.sendKeys(Keys.ENTER);

//        WebElement registrationForm = browser.findElement(LOGO); //search inside page
//        registrationForm.findElement(LOGO); // search inside element
    }
}
