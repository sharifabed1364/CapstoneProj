
Feature: Retail Page - for this feature you have to have an existing account

  Background: 
    Given User is on Retail website
    And User click on MyAccount
    When User click on Login
    And User enter username "sharifabed.123@gmail.com" and password "123456"
    And User click on Login button
    Then User should be logged in to MyAccount dashboard
    
@Registration
  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on ‘Register for an Affiliate Account’ link
    And User fill affiliate form with below information
      | company | website | taxID | paymentMethod |ChequeName|
      |cypto|crypto.com|4444|Cheque|joghn|
    And User check on About us check box
    And User click on Continue button
    Then User should see a success message
    
@EditAffiliate
  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on ‘Edit your affiliate informationlink
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName | abaNumber | swiftCode | accountName | accountNumber |
      |Wels Fargo|234222|000099|Mohamm Abed|777788999|
    And User click on Continue button
    Then User should see a success message
    
@AccoutnInfoEdition
  Scenario: Edit your account Information
    When User click on ‘Edit your account information’ link
    And User modify below information
      | firstname | lastName | email | telephone |
      |Sam |Joel|ars.hashim@gmail.com|333225555|
    And User click on Continue button
    Then User should see a message ‘Success: Your account has been successfully updated.’

    
    
    
    
    
    
    
    