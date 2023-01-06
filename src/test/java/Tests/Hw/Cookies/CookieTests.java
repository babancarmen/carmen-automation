package Tests.Hw.Cookies;

import Utils.SeleniumUtils;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CookieTests extends BaseTest {

    public static final String SANTASCOOKIE = "santascookie";

    @Test
    public void cookieTest01() {
        driver.get(baseUrl + "/cookie/");

        boolean cookieExists = SeleniumUtils.checkIfCookieExistsByName(driver, SANTASCOOKIE);
        assertFalse(cookieExists);

        //add cookie
        String initialCookieValue = "initial value";
        Cookie c1 = new Cookie(SANTASCOOKIE, initialCookieValue);
        driver.manage().addCookie(c1);

        assertTrue(SeleniumUtils.checkIfCookieExistsByNameAndValue(driver, SANTASCOOKIE, initialCookieValue));

        System.out.println("after adding cookie");
        SeleniumUtils.printCookies(driver);

        //update cookie
        String yummyValue = "yummy value";
        Cookie c2 = new Cookie(SANTASCOOKIE, yummyValue);
        driver.manage().addCookie(c2);

        assertTrue(SeleniumUtils.checkIfCookieExistsByNameAndValue(driver, SANTASCOOKIE, yummyValue));

        System.out.println("after updating cookie");
        SeleniumUtils.printCookies(driver);

        //delete cookie
        driver.manage().deleteCookieNamed(SANTASCOOKIE);

        cookieExists = SeleniumUtils.checkIfCookieExistsByName(driver, SANTASCOOKIE);
        assertFalse(cookieExists);

        System.out.println("after deleting cookie");
        SeleniumUtils.printCookies(driver);
    }

}
