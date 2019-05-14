package pageobject;

import org.openqa.selenium.WebDriver;
import utils.ConfigReader;


public class LoginPageObject {

    public WebDriver browser;

    public LoginPageObject(WebDriver browser) {
        this.browser = browser;
    }

    public void navigateTo() {
        browser.get(ConfigReader.getInstance().getHost());
    }
}
