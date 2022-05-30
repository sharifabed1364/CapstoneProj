package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.*;
import page.objects.Home_Page;

public class HomePage_StepDefi extends Base {
	
		Home_Page homepage= new Home_Page();
		
		
		@When("User click on Currency")
		public void user_click_on_currency() {
			homepage.clickOnCurrency();
			logger.info("user click on currency");
		}

		@When("User Chose Euro from dropdown")
		public void user_chose_euro_from_dropdown() {
			homepage.selectEuro();
			logger.info("user chose euro");

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		@Then("currency value should change to Euro")
		public void currency_value_should_change_to_euro() {
			Assert.assertTrue(homepage.currencyOnEuro());
			logger.info("see currency on Euro");
		
		}
		
//		second scenario

		
		@When("User click on shopping cart")
		public void user_click_on_shopping_cart() {
			homepage.clickShoppingCart();
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			logger.info("User clicked on the shopping Cart");

		}
		@Then("“Your shopping cart is empty!” message should display")
		public void your_shopping_cart_is_empty_message_should_display() {
			Assert.assertTrue(homepage.displayEmptyShoppingCartMsg());
			logger.info("User should see the, 'Your shopping cart is empty!' Message");
		   
		}

	


}
