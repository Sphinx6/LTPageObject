package pages.executors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.locators.Task8Locators;

public class Task8Page {

    private WebDriver driver;
	private Task8Locators locators;

	public Task8Page(WebDriver driver)
	{
		this.driver = driver;
	}

	public void initPageElements()
	{
		locators = new Task8Locators();
		PageFactory.initElements(driver, locators);
	}

    public Task8Page selectCardType(String type){

        Select select = new Select(locators.cardTypeSelect);
        select.selectByVisibleText(type);
        return this;
    }

    public Task8Page enterName(String name){
        locators.nameInput.sendKeys(name);
        return this;
    }

    public Task8Page enterCardNumber(String cardNumber){
        locators.cardNumberInput.sendKeys(cardNumber);
        return this;
    }

    public Task8Page enterCvvCode(String cvv){
        locators.cvvInput.sendKeys(cvv);
        return this;
    }

    public Task8Page selectMonth(String month){
        Select select = new Select(locators.monthSelect);
        select.selectByVisibleText(month);
        return this;
    }

    public Task8Page selectYear(String year){
        Select select = new Select(locators.yearSelect);
        select.selectByVisibleText(year);
        return this;
    }

    public void clickPay(){
        locators.payButton.click();
    }
}
