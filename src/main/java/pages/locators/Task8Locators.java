package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Task8Locators {

	@FindBy(how = How.CSS, using = "task8_form_cardType")
	public WebElement cardTypeSelect;

	@FindBy(how = How.CSS, using = "task8_form_name")
	public WebElement nameInput;

	@FindBy(how = How.ID, using = "task8_form_cardNumber")
	public WebElement cardNumberInput;

	@FindBy(how = How.ID, using = "task8_form_cardCvv")
	public WebElement cvvInput;

	@FindBy(how = How.ID, using = "task8_form_cardInfo_month")
	public WebElement monthSelect;

	@FindBy(how = How.ID, using = "task8_form_cardInfo_year")
	public WebElement yearSelect;

	@FindBy(how = How.CSS, using = "button.btn")
	public WebElement payButton;
}
