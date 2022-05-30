package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class ExistingAccountPageObj extends Base {

	public ExistingAccountPageObj() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[text()='My Account']")
	private WebElement myAccount;

	public void clickMyAccount() {
		myAccount.click();
	}

	@FindBy(xpath = "//*[text()='Login']")
	private WebElement login;

	public void clickLogin() {
		login.click();
	}

	@FindBy(id = "input-email")
	private WebElement userId;

	public void enterUserId(String userNm) {
		userId.sendKeys(userNm);
	}

	@FindBy(id = "input-password")
	private WebElement passWord;
	
	public void enterPasword(String pasword) {
		passWord.sendKeys(pasword);
	}

	@FindBy(xpath = "//*[@type='submit']")
	private WebElement loginButton;
	public void clickLoginButton() {
		loginButton.click();
	}

	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")
	private WebElement myAccoutnDasboard;
	public boolean displayMyaccoutDasb() {
		if(myAccoutnDasboard.isDisplayed())
			return true;
		else 
			return false;
	}
	
	@FindBy(xpath="//*[@id=\"content\"]/ul[3]/li/a")
	private WebElement affiliateRegister;
	public void clickAffiliateRegister() {
		affiliateRegister.click();
	}
	
	@FindBy(xpath="//*[@id=\"input-company\"]")
	private WebElement companyName;
	public void enterCompanyName(String compName) {
		companyName.clear();
		companyName.sendKeys(compName);
	}
	
	@FindBy(id="input-website")
	private WebElement website;
	public void enterWebsite(String web) {
		website.clear();
		website.sendKeys(web);
	}
	
	
	@FindBy(id="input-tax")
	private WebElement taxId;
	public void enterTaxId(String txId) {
		taxId.clear();
		taxId.sendKeys(txId);
	}
	
	@FindBy(xpath="//*[@id=\"content\"]/form/fieldset[2]//div[1]/label/input")
	private WebElement paymentMthod;
	public void clickPaymentMthod() {
		paymentMthod.click();
		
	}
	
	@FindBy(id="input-cheque")
	private WebElement chequeName;
	public void enterChequeName(String cheqName) {
		chequeName.clear();
		chequeName.sendKeys(cheqName);
	}
	
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input[1]")
	private WebElement aboutCheckBx;
	public void clickAboutCheckBx() {
		if(!aboutCheckBx.isSelected())
			aboutCheckBx.click();
	}
	
	
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input")
	private WebElement continueButton;
	public void clickContinueButton() {
		continueButton.click();
	}
	
	@FindBy(id="account-account")
	private WebElement successMsgAccount;
	public boolean dispalySuccessMsgAccount() {
		if(successMsgAccount.isDisplayed())
			return true;
		else
			return false;
	}
	
	//Edit affiliate account info
	
	@FindBy(xpath="//*[text()='Edit your affiliate information']")
	private WebElement editAffiliteInfo;
	public void clickEditAffiliteInfo() {
		editAffiliteInfo.click();
	}
	
	@FindBy(xpath="//*[@id=\"content\"]/form/fieldset[2]//div[3]/label/input")
	private WebElement bankTransfrRadioBtn;
	public void clickBankTransfrRadioBtn() {
		bankTransfrRadioBtn.click();
	}
	
	@FindBy(id="input-bank-name")
	private WebElement bankName;
	public void enterBankName(String bkName) {
		bankName.clear();
		bankName.sendKeys(bkName);
	}
	
	@FindBy(id="input-bank-branch-number")
	private WebElement branchNumber;
	public void enterBranchNumber(String branchNam) {
		branchNumber.clear();
		branchNumber.sendKeys(branchNam);
	}
	
	@FindBy(id="input-bank-swift-code")
	private WebElement swiftCode;
	public void enterSwiftCode(String swiftcod) {
		swiftCode.clear();
		swiftCode.sendKeys(swiftcod);
	}
	@FindBy(id="input-bank-account-name")
	private WebElement accountName;
	public void enterAccountName(String accountNam) {
		accountName.clear();
		accountName.sendKeys(accountNam);
	}
	
	@FindBy(id="input-bank-account-number")
	private WebElement accountNumber;
	public void enterAccountNumber(String accNumber) {
		accountNumber.clear();
		accountNumber.sendKeys(accNumber);
	}
	
	//edit account info
	@FindBy(xpath="//*[text()='Edit your account information']")
	private WebElement accounInfoLink;
	public void clickAccounInfoLink() {
		accounInfoLink.click();
	}
	
	@FindBy(id="input-firstname")
	private WebElement firstName;
	public void enterFirstName(String firstNam) {
		firstName.clear();
		firstName.sendKeys(firstNam);
	}
	
	@FindBy(id="input-lastname")
	private WebElement lastName;
	public void enterLasstName(String lastNam) {
		lastName.clear();
		lastName.sendKeys(lastNam);
	}
	
	@FindBy(xpath="//*[@id=\"input-email\"]")
	private WebElement email1;
	public void enterEmail(String email) {
		email1.clear();
		email1.sendKeys(email);
	}
	
	@FindBy(xpath="//*[@id=\"input-telephone\"]")
	private WebElement telephoneNum;
	public void enterTelepone(String telephone) {
		telephoneNum.clear();
		telephoneNum.sendKeys(telephone);
	
		
	}
	
	
	
	@FindBy(xpath="//*[@id=\"account-account\"]/div[1]")
	private WebElement accountSuccessMsg;
	public boolean displayAccountSuccessMsg() {
		if(accountSuccessMsg.isDisplayed())
			return true;
		else
			return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
