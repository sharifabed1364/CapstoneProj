package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import page.objects.ExistingAccountPageObj;

public class ExistingAccountStepDf extends Base {

	ExistingAccountPageObj existAccount = new ExistingAccountPageObj();

	// @TestAccout
	@Given("User click on MyAccount")
	public void user_click_on_my_account() {
		existAccount.clickMyAccount();
		;
		logger.info("User clicked on MyAccount");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("User click on Login")
	public void user_click_on_login() {
		existAccount.clickLogin();
		logger.info("User clicked on login");

	}

	@When("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String username, String password) {
		existAccount.enterUserId(username);
		logger.info("User entered username");
		existAccount.enterPasword(password);
		logger.info("User entered password");
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
		existAccount.clickLoginButton();
		logger.info("User clicked on login Button");

	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
		Assert.assertTrue(existAccount.displayMyaccoutDasb());
		logger.info("User see My Account on Dashboard");
	}

	@When("User click on ‘Register for an Affiliate Account’ link")
	public void user_click_on_register_for_an_affiliate_account_link() {
		existAccount.clickAffiliateRegister();
		logger.info("User clicked on Register for Affiliate Account link");

	}

	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {

		List<Map<String, String>> affiliateInof = dataTable.asMaps(String.class, String.class);
		existAccount.enterCompanyName(affiliateInof.get(0).get("company"));
		existAccount.enterWebsite(affiliateInof.get(0).get("website"));
		existAccount.enterTaxId(affiliateInof.get(0).get("taxID"));
		existAccount.clickPaymentMthod();
		existAccount.enterChequeName(affiliateInof.get(0).get("ChequeName"));
		logger.info("User filled the affiliation form");

	}

	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		existAccount.clickAboutCheckBx();
		logger.info("User clicked on About us check box");
	}

	@When("User click on Continue button")
	public void user_click_on_continue_button() {
		existAccount.clickContinueButton();
		logger.info("User clicked on Continue Button");
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
		existAccount.displayMyaccoutDasb();
		logger.info("User see a success meassage");
	}

	// Edit Affiliate Account info

	@When("User click on ‘Edit your affiliate informationlink")
	public void user_click_on_edit_your_affiliate_informationlink() {
		existAccount.clickEditAffiliteInfo();
		logger.info("User clicked Edit your affiliate information link");
	}

	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		existAccount.clickBankTransfrRadioBtn();
		logger.info("User clicked on Bank Transfer Radio Button");
	}

	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) {

		List<Map<String, String>> editAffiliteInfo = dataTable.asMaps(String.class, String.class);

		existAccount.enterBankName(editAffiliteInfo.get(0).get("bankName"));
		logger.info("User entered Bank Name");
		existAccount.enterBranchNumber(editAffiliteInfo.get(0).get("abaNumber"));
		logger.info("User entered Bank Number");
		existAccount.enterSwiftCode(editAffiliteInfo.get(0).get("swiftCode"));
		logger.info("User entered Swift Code");
		existAccount.enterAccountName(editAffiliteInfo.get(0).get("accountName"));
		logger.info("User entered Account Name");
		existAccount.enterAccountNumber(editAffiliteInfo.get(0).get("accountNumber"));
		logger.info("User entered Account Number");

	}

	// Edit Account information

	@When("User click on ‘Edit your account information’ link")
	public void user_click_on_edit_your_account_information_link() {
		existAccount.clickAccounInfoLink();
		logger.info("User clicked Edit your Account Information Link");
	}

	@When("User modify below information")
	public void user_modify_below_information(DataTable dataTable) {
		List<Map<String, String>> editAccountInfo = dataTable.asMaps(String.class, String.class);

		existAccount.enterFirstName(editAccountInfo.get(0).get("firstname"));
		existAccount.enterLasstName(editAccountInfo.get(0).get("lastName"));
		existAccount.enterEmail(editAccountInfo.get(0).get("email"));
		existAccount.enterTelepone(editAccountInfo.get(0).get("telephone"));
		logger.info("User modified the bank information");
	}

	@Then("User should see a message ‘Success: Your account has been successfully updated.’")
	public void user_should_see_a_message_success_your_account_has_been_successfully_updated() {
		Assert.assertTrue(existAccount.dispalySuccessMsgAccount());
		logger.info("User see the success Message");
	}

	
	
	
	
	
	
	
	
	
}
