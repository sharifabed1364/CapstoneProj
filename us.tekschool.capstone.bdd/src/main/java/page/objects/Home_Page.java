package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class Home_Page extends Base{
	
	

	public Home_Page () {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//span[text()='Currency']")
	private WebElement Currency;
	
	public void clickOnCurrency() {
		Currency.click();
	}

	
	@FindBy(xpath ="//button[text()='€ Euro']")
	private WebElement Euro;

	public void selectEuro() {
		Euro.click();
	}
	
	
	@FindBy(xpath ="//*[@id=\"form-currency\"]/div/button/strong")
	private WebElement seeCurrencyOnEuro;
	public Boolean currencyOnEuro() {
		if (seeCurrencyOnEuro.isDisplayed())
			return true;
		else
	return false;
	}
	
	//Empty shopping cart
	
	@FindBy(xpath="//*[text()='Shopping Cart']")
	private WebElement shoppingCart;
	
	public void clickShoppingCart() {
		shoppingCart.click();
	}
	
	@FindBy(xpath="//*[@id=\"content\"]/p")
	private WebElement emptySoppingMessag;
	public boolean displayEmptyShoppingCartMsg() {
		if(emptySoppingMessag.isDisplayed())
			return true;
		else
			return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
