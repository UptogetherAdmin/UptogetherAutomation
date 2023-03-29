Feature: Login Page

  @LoginEmailValidation @Release
    Scenario: Validating Login email sent to the specified email id
    Given User on Uptogether Login Page
    When User click on the Landing Page Randomly
    And User enters the email id and click enter
    Then User asserts that a login link has been sent to the specified email id
    #And User click on the google login button
    #When  User enters the username and password
    #Then  User verifies the message and redirection

  @EmailNumberFieldValidation @Release
  Scenario: Validating that an appropriate warning is displayed to the user when they enter wrong email or number while trying to login
    Given User on Uptogether Login Page
    When User click on the Landing Page Randomly
    And User enters an invalid email id and click enter
    Then User asserts that a invalid email number validation message is displayed to the user
    And User enters an invalid number and click enter
    Then User asserts that a invalid email number validation message is displayed to the user
    And User enters a valid but number and click enter
    And User asserts that Account does not exist is displayed in the ui


  @LoginUsingGoogle @Release
  Scenario: Validating login using google account.
    Given User on Uptogether Login Page
    When User click on the Landing Page Randomly
    And User click on the uptogether login button
   # And User click on the google login button
    And User switches to the child window to enter the google account details and switches back to the parent window
    Then User goes to Groups page after switching to the parent window
    And User logs out of the application


  @UserRegistration @Release
  Scenario: Validating login using google account.
    Given User on Uptogether Login Page
    When User click on the Landing Page Randomly
    And User goes to the Create Account Page
    And User Enters all the details, enters captcha and click save
    #And User enters the email id in the register account second page
    #Then User asserts that a Account Registration magic link has been sent to the specified email id


  @LoginEmailValidation_firefox @Firefox
  Scenario: Validating Login email sent to the specified email id
    Given User on Uptogether Login Page
    When User click on the Landing Page Randomly
    And User enters the email id and click enter
    Then User asserts that a login link has been sent to the specified email id
    #And User click on the google login button
    #When  User enters the username and password
    #Then  User verifies the message and redirection

  @EmailNumberFieldValidation_firefox @Firefox
  Scenario: Validating that an appropriate warning is displayed to the user when they enter wrong email or number while trying to login
    Given User on Uptogether Login Page
    When User click on the Landing Page Randomly
    And User enters an invalid email id and click enter
    Then User asserts that a invalid email number validation message is displayed to the user
    And User enters an invalid number and click enter
    Then User asserts that a invalid email number validation message is displayed to the user
    And User enters a valid but number and click enter
    And User asserts that Account does not exist is displayed in the ui


  @LoginUsingGoogle_firefox @Firefox
  Scenario: Validating login using google account.
    Given User on Uptogether Login Page
    When User click on the Landing Page Randomly
    And User click on the uptogether login button
   # And User click on the google login button
    And User switches to the child window to enter the google account details and switches back to the parent window
    Then User goes to Groups page after switching to the parent window
    And User logs out of the application


  @UserRegistration_firefox @Firefox
  Scenario: Validating login using google account.
    Given User on Uptogether Login Page
    When User click on the Landing Page Randomly
    And User goes to the Create Account Page
    And User Enters all the details, enters captcha and click save
    #And User enters the email id in the register account second page
    #Then User asserts that a Account Registration magic link has been sent to the specified email id

