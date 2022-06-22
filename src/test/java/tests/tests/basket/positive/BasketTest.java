package tests.tests.basket.positive;
import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constant.AuthTestData.PASSWORD;
import static constants.Constant.AuthTestData.USERNAME;
import static constants.Constant.Urls.START_PAGE_URL;

public class BasketTest extends BaseTest {
    @Test
    public void checkBasket() {
        basePage.goToUrl(START_PAGE_URL);
        authLogin
                .enterUsername(USERNAME)
                .enterPassword(PASSWORD)
                .selectButtonLogin();
        basketPage
                .selectSortirovka()
                .selectNameZ()
                .selectImgBackpack()
                .selectButtonAdd()
                .selectButtonBasket()
                .selectButtonCheckout()
                .enterFirstName()
                .enterLastName()
                .enterPostalCode()
                .selectContinue()
                .selectFinish()
                .selectBackHome();

    }
}
