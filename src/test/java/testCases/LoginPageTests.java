package testCases;

import Base.BaseTest;
import Pages.DashboardPage;
import Pages.LoginPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginPageTests extends BaseTest {


    @Test

    public void testsuccesslogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAccount("Admin", "admin123");
        //To Be Sure that the Dashboard page was opened successfully
        //assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
        DashboardPage dashboardPage = loginPage.clickLoginButton();
        assertTrue(dashboardPage.checkDashboardIcon());
    }


    @Test

    public void testInvalidUsername() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAccount("Adn", "admin123");
        assertTrue(loginPage.invalidErrorMessageVisible());
    }

    @Test

    public void testInvalidPassword() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAccount("Admin", "123");
        assertTrue(loginPage.invalidErrorMessageVisible());
    }

    @Test

    public void testEmptyPassword() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAccount("Admin", "");
        assertTrue(loginPage.isRequiredErrorMessageVisible());
    }

    @Test

    public void testEmptyUsername() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAccount("", "admin123");
        assertTrue(loginPage.isRequiredErrorMessageVisible());

    }

    @Test

    public void testEmptyUsernameAndPassword() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAccount("", "");
        assertTrue(loginPage.isRequiredErrorMessageVisible());
    }

}


/*
  @Test
    public void testsuccesslogin(){

        //Add username
        loginPage.addUserName("Admin");
        //Add Password
        loginPage.addPassword("admin123");
        //Click login
        loginPage.clickLoginButton();
        //To Be Sure that the Dashboard page was opened successfully
        assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
    }

    @Test
    public void testInvalidUsername(){
        loginPage.addUserName("Admin");
        loginPage.addPassword("ad");
        loginPage.clickLoginButton();
        assertTrue(loginPage.invalidErrorMessageVisible());
    }

    @Test
    public void testEmptyPassword(){
        loginPage.addUserName("Admin");
        loginPage.addPassword("");
        loginPage.clickLoginButton();
        assertTrue(loginPage.isRequiredErrorMessageVisible());
    }
    @Test
    public void testEmptyUsername(){
        loginPage.addUserName("");
        loginPage.addPassword("admin123");
        loginPage.clickLoginButton();
        assertTrue(loginPage.isRequiredErrorMessageVisible());
    }

    @Test
    public void testEmptyUsernameAndPassword(){
        loginPage.addUserName("");
        loginPage.addPassword("admin123");
        loginPage.clickLoginButton();
        assertTrue(loginPage.isRequiredErrorMessageVisible());
    }

*/


