package pages.pages.auth;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import static constants.Constant.AuthTestDataInvalid.PASSWORDINVALID;
import static constants.Constant.AuthTestDataInvalid.USERNAMEINVALID;

public class Auth extends BasePage {

    public Auth(WebDriver driver) {
        super(driver);
    }

    /**
     * элементы для авторизации
     */


    private final By inputUsername = By.xpath("//input[@placeholder='Username']");
    private final By inputPassword = By.xpath("//input[@type='password']");
    private final By buttonLogin = By.xpath("//input[@type='submit']");



    /**
     *
     * команды для прохождения теста
     *
     */


    public Auth enterUsername(String username) {
        driver.findElement(inputUsername).sendKeys(username);
        return this;
    }

    public Auth enterPassword(String password) {
        driver.findElement(inputPassword).sendKeys(password);
        return this;
    }

    public Auth selectButtonLogin() {
        driver.findElement(buttonLogin).click();
        return this;

    }

    public Auth enterUsernameInvalid(String usernameInvalid) {
        driver.findElement(inputUsername).sendKeys(USERNAMEINVALID);
        return this;
    }

    public Auth enterPasswordInvalid(String passwordInvalid) {
        driver.findElement(inputPassword).sendKeys(PASSWORDINVALID);
        return this;
    }

}
