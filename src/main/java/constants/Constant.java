package constants;

public class Constant {
    public static class TimeoutVeriables {
        public static final int IMPLICIT_WAIT = 5;
        public static final int EXPLICIT_WAIT = 10;

    }
    public static class Urls{
        public static final String START_PAGE_URL = "https://www.saucedemo.com/";
    }

    /**
     * логин и пароль от сайта
     */

    public static class AuthTestData{
        public static final String USERNAME = "standard_user";
        public static final String PASSWORD = "secret_sauce";
    }

    public static class AuthTestDataInvalid{
        public static final String USERNAMEINVALID = "Test";
        public static final String PASSWORDINVALID = "Test";
    }


}
