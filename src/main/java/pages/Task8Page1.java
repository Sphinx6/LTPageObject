package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Task8Page1 {

    WebDriver driver;

    public Task8Page1(WebDriver driver){
        this.driver = driver;
    }

    public Task8Page1 selectCardType(String type){
        Select select = new Select(driver.findElement(By.id("task8_form_cardType")));
        select.selectByVisibleText(type);
        return this;
    }

    public Task8Page1 enterName(String name){
        driver.findElement(By.id("task8_form_name")).sendKeys(name);
        return this;
    }

    public Task8Page1 enterCardNumber(String cardNumber){
        driver.findElement(By.id("task8_form_cardNumber")).sendKeys(cardNumber);
        return this;
    }

    public Task8Page1 enterCvvCode(String cvv){
        driver.findElement(By.id("task8_form_cardCvv")).sendKeys(cvv);
        return this;
    }

    public Task8Page1 selectMonth(String month){
        Select select = new Select(driver.findElement(By.id("task8_form_cardInfo_month")));
        select.selectByVisibleText(month);
        return this;
    }

    public Task8Page1 selectYear(String year){
        Select select = new Select(driver.findElement(By.id("task8_form_cardInfo_year")));
        select.selectByVisibleText(year);
        return this;
    }

    public void clickPay(){
        driver.findElement(By.cssSelector("button.btn")).click();
    }

}
