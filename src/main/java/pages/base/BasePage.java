package pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static constants.Constant.TimeoutVeriables.EXPLICIT_WAIT;

public class BasePage {

    public WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

     //  public final By authWidget = By.xpath("//label[@for='username']");

    /**
     * метод для навигации в браузере
     **/

    public void goToUrl(String url){
        driver.get(url);
    }

    /**
     * ожидание видимости элементов
     */

    public WebElement waitElementIsVisible(WebElement element){
        new WebDriverWait(driver, EXPLICIT_WAIT).until(ExpectedConditions.visibilityOf(element));
        return element;
    }

  //  public void isAuthPresented () {
  //      WebElement authFrame = driver.findElement(authWidget);
  //      waitElementIsVisible(authFrame);

  //  }

}
