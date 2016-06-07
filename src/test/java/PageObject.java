import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.Task8Page1;
import pages.Task8Page2;
import pages.executors.Task8Page;

public class PageObject {

    private WebDriver driver;

    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("https://testingcup.pgs-soft.com/task_8");
        driver.manage().window().maximize();
    }


    @Test
    public void Approach1Test() {

        Task8Page1 task8Page = new Task8Page1(driver);

        task8Page.selectCardType("MasterCard")
                .enterName("Jan Kowalski")
                .enterCardNumber("5555555555554444")
                .enterCvvCode("123")
                .selectMonth("July")
                .selectYear("2018")
                .clickPay();
    }
}
