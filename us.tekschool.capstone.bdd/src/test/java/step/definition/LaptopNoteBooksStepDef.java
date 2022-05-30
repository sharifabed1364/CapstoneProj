package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.*;
import page.objects.LapNoteBooksPageObj;

public class LaptopNoteBooksStepDef extends Base {

	LapNoteBooksPageObj laptopObject = new LapNoteBooksPageObj();

	// Feature: laptopNoteBooks
	// @MacBookTest

	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		laptopObject.clickLaptopLogo();
		logger.info("User clicked on Lapto & NoteBooks tab");
	}

	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		laptopObject.clickShowAllLapNoteBk();
		logger.info("User clicked on Show all Laptop and NoteBooks option");

	}

	@When("User click on MacBook item")
	public void user_click_on_mac_book_item() {
		laptopObject.clickMacBookItem();
		logger.info("User clicked on MacBook item");

		
	}

	@Then("User should see {string} showed to the cart")
	public void user_should_see_showed_to_the_cart(String string) {
		Assert.assertTrue(laptopObject.displaySuccessAddCart());
		
	
		logger.info("User see the success add to cart message");
	}

	@Then("User click on cart option")
	public void user_click_on_cart_option() {
		laptopObject.clickCartOption();
		logger.info("User clicked on Cart Option");
	

	}

	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		laptopObject.clickRedXtoRemoveItme();
		logger.info("User should remove the cart");
		
	}

	@Then("item should be removed and cart should show {string}")
	public void item_should_be_removed_and_cart_should_show(String string) {
		Assert.assertTrue(laptopObject.displayTotalToCart());
		
		Assert.assertTrue(laptopObject.displayZeroItemOnCart());
	}

	// @MacBookTest

	@When("User click on product comparison icon on ‘MacBook’")
	public void user_click_on_product_comparison_icon_on_mac_book() {
		laptopObject.clicKMacBookComp_Icon();
		logger.info("User clicked on Macbook product comprison icon");
	
	}

	@When("User click on product comparison icon on ‘MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
		laptopObject.clicKMacBookAirComprsnIcon();
		logger.info("User clicked on Macbook Air product comprison icon");
		

	}

	@Then("User should see a message ‘Success: You have added MacBook Air to your product comparison!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_air_to_your_product_comparison() {
		Assert.assertTrue(laptopObject.showSuccessMessageMcB());
		logger.info("User see the success Message of MacBook comprison");
		
	}

	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		laptopObject.clickComprisonLink();
		logger.info("User clicked the comprison link");

	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		Assert.assertTrue(laptopObject.showComprisonChart());
		logger.info("User see the comprison chart");
	

	}

	// @WishListTest
	@When("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
		laptopObject.clickHeartIcon();
		logger.info("User clicked on Heart Icon");
	

	}

	@Then("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’")
	public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list() {
		Assert.assertTrue(laptopObject.showLoginCreateMessage());
		logger.info("User see the Message of 'loging or create account'");
	}

	//  @MacBookPorTest
	@When("User click on ‘MacBook Pro’ item")
	public void user_click_on_mac_book_pro_item() {
		laptopObject.clickMacBookProItem();
		logger.info("User clicked on MacBook Pro Item");
		
	}

	@Then("User should see ‘${double}’ price tag is present on UI.")
	public void user_should_see_$_price_tag_is_present_on_ui(Double double1) {
		Assert.assertTrue(laptopObject.showPriceTagOnUI());
		logger.info("User see the tag price $2000.00 on UI");
	}

}
