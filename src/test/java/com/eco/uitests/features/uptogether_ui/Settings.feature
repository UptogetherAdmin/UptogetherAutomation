Feature: Group Settings
  Background: User is logged in
    Given User on Uptogether Login Page
    When User click on the uptogether login button
    Then User switches to the child window to enter the google account details and switches back to the parent window


  @BasicInfoSetting @Setting @Release
  Scenario: Basic Information Setting
    Given User goes to Groups page after switching to the parent window
    And User goes to the Profile Settings page
    When User opens the basic information setting page
    And User uploads a profile pic
    Then User updates the basic information and saves it


  @AddHouseholdInfo @Setting @Release
  Scenario: Add/Edit/Delete a household member. Cancel Household member creation.
    Given User goes to Groups page after switching to the parent window
    And User goes to the Profile Settings page
    When User opens the Household Info setting page
    Then User adds a household member
    And User opens the existing household member in edit mode
    And User edits the existing household member and saves it
    And User opens the add household member page and cancels it
    And User opens the existing household member in edit mode
    And User deletes the existing household member


  @ContactInfo_EmailValidation @Setting @Release
  Scenario: Add a new email, enter wrong OTP and validate the message.
    Given User goes to Groups page after switching to the parent window
    And User goes to the Profile Settings page
    When User opens the Contact Info setting page
    Then User adds a new email id to check the error message
    And User asserts the error message

  @ContactInfo_PhoneValidation @Setting @Release
  Scenario: Add a new phone number, enter wrong OTP and validate the message.
    Given User goes to Groups page after switching to the parent window
    And User goes to the Profile Settings page
    When User opens the Contact Info setting page
    Then User adds a new Number to check the error message
    And User asserts the error message for mobile number


  @AddAddress @Setting @Release @Address
  Scenario: Add a new address
    Given User goes to Groups page after switching to the parent window
    And User goes to the Profile Settings page
    When User opens the Address setting page
    Then User opens the add address page and add an address


  @PrimaryAddressSetting @Setting @Release @Address
  Scenario: Make the newly created address as primary address and then change it back
    Given User goes to Groups page after switching to the parent window
    And User goes to the Profile Settings page
    When User opens the Address setting page
    Then User makes the newly created address as primary address
    And User changes the primary address

  @EditAddress @Setting @Release @Address @AddAddress
  Scenario: Edit, Cancel and delete the existing address
    Given User goes to Groups page after switching to the parent window
    And User goes to the Profile Settings page
    When User opens the Address setting page
    And User opens the address in edit mode and cancels it
    Then User opens the address in edit mode and edit the address
    And User deletes the address

