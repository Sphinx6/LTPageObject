import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.Task8Page1;
import pages.Task8Page2;
import pages.executors.Task8Page;

public class PageObject {

    WebDriver driver;

    private String cardType = "MasterCard";
    private String name = "Jan Kowalski";
    private String cardNumber = "5555555555554444";
    private String cvv = "123";
    private String month = "July";
    private String year = "2018";


    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("https://testingcup.pgs-soft.com/task_8");
        driver.manage().window().maximize();
    }


    @Test
    public void Approach1Test() {

        Task8Page1 task8Page = new Task8Page1(driver);

        task8Page.selectCardType(cardType)
                .enterName(name)
                .enterCardNumber(cardNumber)
                .enterCvvCode(cvv)
                .selectMonth(month)
                .selectYear(year)
                .clickPay();

    }
}
