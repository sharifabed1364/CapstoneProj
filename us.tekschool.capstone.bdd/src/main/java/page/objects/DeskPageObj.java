package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.openqa.selenium.support.ui.Select;

import core.Base;

public class DeskPageObj extends Base {
	
	public DeskPageObj() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement logoText;

	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktop;
	
	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktp;

	@FindBy(xpath = "//h3[text()='Refine Search']")
	private WebElement itemsOnDesktp;
	
	
	public boolean logoTextDisplay() {
		
		if(logoText.isDisplayed())
			return true;
		else
			return false;
		
	}
	
	public void desktopsClick() {
		desktop.click();
	}
	
	public void showAlldesktopClick() {
		showAllDesktp.click();
	}
	
	public boolean showAllitemsOnDesktop() {
		if(itemsOnDesktp.isDisplayed())
			return true;
		else
			return false;
	}
	 
	//Second scanrio
    @FindBy(xpath="//*[@id=\"content\"]/div[4]/div[3]/div/div[2]/div[2]/button[1]/span")
     private WebElement addToCart;
    
    public void clicAddToCartOpption() { 	
    	addToCart.click();
    }
    
    
    @FindBy(xpath="//*[@name='quantity']")
    private WebElement selectQty;
    
    public void selectQuantity(String qty) {
    	selectQty.clear();
    	selectQty.sendKeys(qty);
    }
    @FindBy(xpath="//button[text()='Add to Cart']")
    private WebElement clickCartButton;
    
    public void clickCartButn() {
    	clickCartButton.click();
    	
    }
    @FindBy(xpath= "//*[@class='alert alert-success alert-dismissible']")
    private WebElement successMessage;
    
    public boolean displaySuccessMessage() {
    	if(successMessage.isDisplayed())
    	
    		return true;
    	else
    		return false;
    	
    }
    
    //Scenario third
   @FindBy(xpath="//*[@id=\"content\"]/div[4]/div[2]//div[2]/button[1]/span")
   private WebElement addToCartCanon;
   
   public void addCanoncameraToCart() {
	   
	   addToCartCanon.click();
   }
   
   
   @FindBy(xpath="//select[@id='input-option226']//child::option[2]")
   private WebElement selectRedDropdown;
   
   public void selecRedColorDropdown() {
	   selectRedDropdown.click();
	  
	   
   }
   
   @FindBy(xpath="//*[text()='Success: You have added ']")
   private WebElement canonSuccessMessage;
   
   public boolean successMessDisplay() {
	   if(canonSuccessMessage.isDisplayed()) 
		   return true;
	   else
		   return false;
	   
   }
   
   //Test4
   
   @FindBy(xpath="//a[text()='Canon EOS 5D Camera']")
   private WebElement canonEosItem;
   public void clickCanonEOsItem() {
	   canonEosItem.click();
   }
   
   @FindBy(xpath="//a[text()='Write a review']")
   private WebElement writeAreview;
   public void clickWriteA_reviewLink() {
	   writeAreview.click();
   }
   
   
   @FindBy(name="name")
   private WebElement name;
   public void enterName(String yourname) {
	   name.sendKeys(yourname);
   }
   
   
   @FindBy(id="input-review")
   private WebElement Review;
   public void writingWreview(String yourReview) {
	   Review.sendKeys(yourReview);;
   }
   
   @FindBy(xpath="//*[@id=\"form-review\"]/div[4]/div/input[5]")
   private WebElement goodRating;
   @FindBy(xpath="//*[@id=\"form-review\"]/div[4]/div/input[1]")
   private WebElement badRating;
   
   public void ratingReview(String option) {
	   if(option.equalsIgnoreCase("good") && !goodRating.isSelected()) {

		   goodRating.click();
	   }else

    	   badRating.click();  
   }
   
   @FindBy(id="button-review")
   private WebElement continueButton;
   public void clickContinueButton() {
	   continueButton.click();
   }
   
   
   @FindBy(xpath="//*[@class='alert alert-success alert-dismissible']")
   private WebElement thankYouMessage;
   
   public boolean thankYouMsgDisplay() {
	   if(thankYouMessage.isDisplayed())
		   return true;
	   else 
		   return false;
   }
   
   
   
   
   
  
  
   

   
   
   
	
    
	
	
	
	
	
	
	
	
	
}
