import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class NoPageObject {

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

        Select select = new Select(driver.findElement(By.id("task8_form_cardType")));
        select.selectByVisibleText(cardType);
        driver.findElement(By.id("task8_form_name")).sendKeys(name);
        driver.findElement(By.id("task8_form_cardNumber")).sendKeys(cardNumber);
        driver.findElement(By.id("task8_form_cardCvv")).sendKeys(cvv);
        Select selectMonth = new Select(driver.findElement(By.id("task8_form_cardInfo_month")));
        selectMonth.selectByVisibleText(month);
        Select selectYear = new Select(driver.findElement(By.id("task8_form_cardInfo_year")));
        selectYear.selectByVisibleText(year);
        driver.findElement(By.cssSelector("button.btn")).click();

    }
}
