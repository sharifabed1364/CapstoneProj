package step.definition;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import page.objects.DeskPageObj;
import utilities.UtilizerMethods;

public class DeskStepDef extends Base{
	
	DeskPageObj deskPageobj =new DeskPageObj();
	UtilizerMethods utilObject = new UtilizerMethods();
	
	@Given("User is on Retail website")
	public void user_is_on_retail_website()  {
		Assert.assertTrue(deskPageobj.logoTextDisplay());
		logger.info("User is on Retail Website");
	    
		
	    
	}

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
	    deskPageobj.desktopsClick();
	    logger.info("User clicked on Desktops");
	  
	    
	}

	@And("User click on Show all desktops")
	public void user_click_on_show_all_desktops()  {
	    deskPageobj.showAlldesktopClick();
	
	}
	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
	    Assert.assertTrue(deskPageobj.showAllitemsOnDesktop());
	  
	    logger.info("User is on Show All Items Page");
	    
	}
	
	//Second Scenario
	
	@And("User click ADD TO CART option on 'HP LP3065' item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
		deskPageobj.clicAddToCartOpption();
		logger.info("User clicked the Add To Cart Option");
	    
		 
	}

	@And("User select quantity {string}")
	public void user_select_quantity(String qty) { 
		deskPageobj.selectQuantity(qty);
		logger.info("User selected quantity "+ qty);
		 	 
	}
	
	

	@And("User click add to Cart button")
	public void user_click_add_to_cart_button() {
	    
		deskPageobj.clickCartButn();
		logger.info("User clicked Car Button");
		
		  
	}

	
	@Then("User should see a message {string}")
	public void user_should_see_a_message(String string) {
		
		Assert.assertTrue(deskPageobj.displaySuccessMessage());
		logger.info("User sould see a success message");
	}
	
	
	//Third Scenario
	@When("User click ADD TO CART option on ‘Canon EOS 5D’ item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
		deskPageobj.addCanoncameraToCart();
		logger.info("User clicked Add To Cart Button for Canon EOS 5D");
	
		
	
	}
	@When("User select color from dropdown ‘Red’")
	public void user_select_color_from_dropdown_red() {
		deskPageobj.selecRedColorDropdown();
		logger.info("User slected Red color from dropdown");
		
		
	}
	
	@Then("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() {
	    Assert.assertTrue(deskPageobj.successMessDisplay());
	    logger.info("User should see the success Message");

	}
	
	//Test4
	
	@Then("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		deskPageobj.clickCanonEOsItem();
		logger.info("User clicked on Canon EOS 5D Item");
	
	}
	@Then("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		deskPageobj.clickWriteA_reviewLink();
		logger.info("User click on write a review link");
	

	}
	@Then("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
	    List<Map<String, String>> reviewInfo = dataTable.asMaps(String.class, String.class);
	    deskPageobj.enterName(reviewInfo.get(0).get("yourname"));
	    deskPageobj.writingWreview(reviewInfo.get(0).get("yourReview"));
	    deskPageobj.ratingReview(reviewInfo.get(0).get("Rating"));
	    logger.info("User entered his/her information");
	    
	    
	}
	@Then("User click on Continue Button")
	public void user_click_on_continue_button() {
		deskPageobj.clickContinueButton();
		logger.info("User clicked on Continue Button");
	

	}
	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with(String string) {
	    Assert.assertTrue(deskPageobj.thankYouMsgDisplay());
	    logger.info("User should see a Thank you message!");
	}


}
	
	
	

	
	


