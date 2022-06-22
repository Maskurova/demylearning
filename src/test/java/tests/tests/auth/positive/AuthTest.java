package tests.tests.auth.positive;
import org.junit.jupiter.api.Test;
import tests.base.BaseTest;
import static constants.Constant.AuthTestData.PASSWORD;
import static constants.Constant.AuthTestData.USERNAME;
import static constants.Constant.Urls.START_PAGE_URL;


public class AuthTest extends BaseTest {


    @Test
    public void checkIsRedirectAuth() {
        basePage.goToUrl(START_PAGE_URL);
        authLogin
                .enterUsername(USERNAME)
                .enterPassword(PASSWORD)
                .selectButtonLogin();
    }
}


