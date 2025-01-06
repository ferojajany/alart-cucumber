package selenium;

import org.testng.annotations.Test;

public class LoginTest extends HomeTest {
@Test
    public void loginPage(){
    FacebookPage facebook = new FacebookPage(driver);

    facebook.enterPhonebook("01743345959");
    facebook.enterPassword("59&59");
    facebook.clickButton();

}
}
