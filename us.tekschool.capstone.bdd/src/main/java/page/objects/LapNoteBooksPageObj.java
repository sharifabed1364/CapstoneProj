package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

import core.Base;

public class LapNoteBooksPageObj extends Base{
	
	//Feature: laptopNoteBooks
		//@MacBookTest
	
	public LapNoteBooksPageObj() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="	//*[text()='Laptops & Notebooks']")
	private WebElement laptopLogo;
	
	public void clickLaptopLogo() {
		laptopLogo.click();
	}
	
	@FindBy(xpath="//*[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLapNoteB;
	public void clickShowAllLapNoteBk() {
		showAllLapNoteB.click();
	}
	
	@FindBy(xpath="//*[@id=\"content\"]//div[2]/div/div[1]/a/img")
	private WebElement macBookItem;
	public void clickMacBookItem() {
		macBookItem.click();
	}
	
	@FindBy(xpath="//*[text()='Success: You have added ']")
	private WebElement successToCartMessage;
	
	public boolean displaySuccessAddCart()  {
		
		if(successToCartMessage.isDisplayed()) 
			return true;
		else
			return false;
	}
	
	@FindBy(xpath="//*[@id=\"cart\"]/button")
	private WebElement seeTotalToCart;
	
	
	public boolean displayTotalToCart() {
		if(seeTotalToCart.isDisplayed())
			return true;
		else
			return false;
	}
	
	@FindBy(xpath="//*[@id=\"cart\"]/button")
	private WebElement cartOption;
	
	public void clickCartOption() {
		cartOption.click();
	}
	@FindBy(xpath="//*[@id=\"cart\"]/ul/li[1]/table/tbody/tr/td[5]/button")
	private WebElement redX;
	public void clickRedXtoRemoveItme() {
		redX.click();
	}
	
	@FindBy(id="cart-total")
	private WebElement cartZeroItem;
	public boolean displayZeroItemOnCart() {
		if(cartZeroItem.isDisplayed())
			return true;
		else 
			return false;
	}
	
	//@MacBookTest
	@FindBy(xpath="//*[@id=\"content\"]/div[4]/div[2]//div[2]/button[3]")
	private WebElement macBookComparison;
	
	public void clicKMacBookComp_Icon() {
		macBookComparison.click();
	}
	
	@FindBy(xpath="//*[@id=\"content\"]/div[4]/div[3]/div//div[2]/button[3]")
	private WebElement macBookAirComprison;
	public void clicKMacBookAirComprsnIcon() {
		macBookAirComprison.click();
	}
	
	@FindBy(xpath="//*[@id=\"compare-total\"]")
	private WebElement successMessage;
	public boolean showSuccessMessageMcB() {
		if(successMessage.isDisplayed())
			return true;
		else
			return false;
	}
	
	@FindBy(xpath="//*[text()='Product Compare (2)']")
	private WebElement comparisonLink;
	public void clickComprisonLink() {
		comparisonLink.click();
	}
	
	
	@FindBy(xpath="//*[@id='content']")
	private WebElement comparisonProductChart;
	public boolean showComprisonChart() {
		if(comparisonProductChart.isDisplayed())
			return true;
		else
			return false;
	}
	
	//@WishListTest
	
	@FindBy(xpath="//*[@id=\"content\"]/div[4]/div[5]//div[2]/button[2]")
	private WebElement heartIcon;
	public void clickHeartIcon() {
		heartIcon.click();
	}
	
	@FindBy(xpath="//*[@id='product-category']/div[1]")
	private WebElement loginCreateMessage;
	public boolean showLoginCreateMessage() {
		if(loginCreateMessage.isDisplayed())
			return true;
		else
			return false;
	}
	
	//  @MacBookPorTest
	
	@FindBy(xpath="//*[@id=\"content\"]//div[4]/div/div[1]/a/img")
	private WebElement macBookProItem;
	public void clickMacBookProItem() {
		macBookProItem.click();
	}
	@FindBy(xpath="//*[@id=\"content\"]//ul[2]/li[1]/h2")
	private WebElement priceTagOnUI;
	public boolean showPriceTagOnUI() {
		if(priceTagOnUI.isDisplayed())
			return true;
		else
			return false;
	}
	


}
