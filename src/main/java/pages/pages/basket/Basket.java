package pages.pages.basket;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;


public class Basket extends BasePage {

    private final By buttonSortirovka = By.xpath("//select[@class='product_sort_container']");
    private final By buttonNameZ = By.xpath("//option[@value='za']");
    private final By imgBackpack = By.xpath("//img[@alt='Sauce Labs Backpack']");
    private final By buttonAdd = By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']");
    private final By buttonBasket = By.xpath("//a[@class='shopping_cart_link']");
    private final By buttonCheckout = By.xpath("//button[@class='btn btn_action btn_medium checkout_button']");
    public final By inputFirstName = By.xpath("//input[@placeholder='First Name']");
    public final By inputLastName = By.xpath("//input[@placeholder='Last Name']");
    public final By inputPostalCode = By.xpath("//input[@placeholder='Zip/Postal Code']");
    public final By buttonContinue = By.xpath("//input[@type='submit']");
    public final By buttonFinish = By.xpath("//button[@class='btn btn_action btn_medium cart_button']");
    public final By buttonBackHome = By.xpath("//button[@class='btn btn_primary btn_small']");

    public Basket(WebDriver driver) {
        super(driver);
    }


    /**
     *
     * методы для прохождения теста
     *
     */



    public Basket selectSortirovka() {
        driver.findElement(buttonSortirovka).click();
        return this;
    }

    public Basket selectNameZ() {
        driver.findElement(buttonNameZ).click();
        return this;
    }

    public Basket selectImgBackpack() {
        driver.findElement(imgBackpack).click();
        return this;
    }

    public Basket selectButtonAdd() {
        driver.findElement(buttonAdd).click();
        return this;
    }

    public Basket selectButtonBasket() {
        driver.findElement(buttonBasket).click();
        return this;
    }

    public Basket selectButtonCheckout() {
        driver.findElement(buttonCheckout).click();
        return this;
    }

    public Basket enterFirstName() {
        driver.findElement(inputFirstName).sendKeys("Vasya");
        return this;
    }

    public Basket enterLastName() {
        driver.findElement(inputLastName).sendKeys("Ivanov");
        return this;
    }

    public Basket enterPostalCode() {
        driver.findElement(inputPostalCode).sendKeys("213454");
        return this;
    }

    public Basket selectContinue() {
        driver.findElement(buttonContinue).click();
        return this;
    }

    public Basket selectFinish() {
        driver.findElement(buttonFinish).click();
        return this;
    }

    public Basket selectBackHome() {
        driver.findElement(buttonBackHome).click();
        return this;
    }




}
