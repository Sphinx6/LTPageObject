import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class NoPageObject {

    private WebDriver driver;

    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("https://testingcup.pgs-soft.com/task_8");
        driver.manage().window().maximize();
    }

    @Test
    public void Approach1Test() {

        Select select = new Select(driver.findElement(By.id("task8_form_cardType")));
        select.selectByVisibleText("MasterCard");
        driver.findElement(By.id("task8_form_name")).sendKeys("Jan Kowalski");
        driver.findElement(By.id("task8_form_cardNumber")).sendKeys("5555555555554444");
        driver.findElement(By.id("task8_form_cardCvv")).sendKeys("123");
        Select selectMonth = new Select(driver.findElement(By.id("task8_form_cardInfo_month")));
        selectMonth.selectByVisibleText("July");
        Select selectYear = new Select(driver.findElement(By.id("task8_form_cardInfo_year")));
        selectYear.selectByVisibleText("2018");
        driver.findElement(By.cssSelector("button.btn")).click();
    }
}
