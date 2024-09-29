package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {
    private WebDriver driver ;
    private WebDriverWait wait ;

    private By dashboardIcon = By.cssSelector(".oxd-text.oxd-text--h6.oxd-topbar-header-breadcrumb-module");
   // private By dashboardIcon = By.cssSelector("oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module");


    public DashboardPage(WebDriver driver){

        this.driver = driver ;
    }


    public boolean checkDashboardIcon(){
        return driver.findElement(dashboardIcon).isDisplayed();
    }


}
