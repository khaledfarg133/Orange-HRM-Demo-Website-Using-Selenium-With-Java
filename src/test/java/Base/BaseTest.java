package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;
    protected WebDriverWait wait;

    //  protected LoginPage loginPage ;

    @BeforeMethod
    public void SetUp(){

        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //wait= new WebDriverWait(driver, Duration.ofSeconds(5));



        //loginPage = new LoginPage(driver);

    }
    @AfterMethod

        public void tearDown(){

         //   driver.quit();
        }





}
