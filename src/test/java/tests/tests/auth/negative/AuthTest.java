package tests.tests.auth.negative;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constant.AuthTestDataInvalid.PASSWORDINVALID;
import static constants.Constant.AuthTestDataInvalid.USERNAMEINVALID;
import static constants.Constant.Urls.START_PAGE_URL;

public class AuthTest extends BaseTest {

    @Test
    public void checkIsRedirectAuth(){
        basePage.goToUrl(START_PAGE_URL);
        authLogin
                .enterUsernameInvalid(USERNAMEINVALID)
                .enterPasswordInvalid(PASSWORDINVALID)
                .selectButtonLogin();
    }

}
