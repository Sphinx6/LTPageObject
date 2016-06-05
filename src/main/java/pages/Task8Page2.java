package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Task8Page2 {

    WebDriver driver;

    By cardTypeSelect = By.id("task8_form_cardType");
    By nameInput = By.id("task8_form_name");
    By cardNumberInput = By.id("task8_form_cardNumber");
    By cvvInput = By.id("task8_form_cardCvv");
    By monthSelect = By.id("task8_form_cardInfo_month");
    By yearSelect = By.id("task8_form_cardInfo_year");
    By payButton = By.cssSelector("button.btn");

    public Task8Page2(WebDriver driver){
        this.driver = driver;
    }

    public Task8Page2 selectCardType(String type){
        Select select = new Select(driver.findElement(cardTypeSelect));
        select.selectByVisibleText(type);
        return this;
    }

    public Task8Page2 enterName(String name){
        driver.findElement(nameInput).sendKeys(name);
        return this;
    }

    public Task8Page2 enterCardNumber(String cardNumber){
        driver.findElement(cardNumberInput).sendKeys(cardNumber);
        return this;
    }

    public Task8Page2 enterCvvCode(String cvv){
        driver.findElement(cvvInput).sendKeys(cvv);
        return this;
    }

    public Task8Page2 selectMonth(String month){
        Select select = new Select(driver.findElement(monthSelect));
        select.selectByVisibleText(month);
        return this;
    }

    public Task8Page2 selectYear(String year){
        Select select = new Select(driver.findElement(yearSelect));
        select.selectByVisibleText(year);
        return this;
    }

    public void clickPay(){
        driver.findElement(payButton).click();
    }

}
