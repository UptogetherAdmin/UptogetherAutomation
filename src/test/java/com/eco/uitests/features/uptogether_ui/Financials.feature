Feature: Financial Page automation
  Background: User is logged in
    Given User on Uptogether Login Page
    When User click on the uptogether login button
    Then User switches to the child window to enter the google account details and switches back to the parent window


  @ChangePrimaryMethod @Financial @Release
  Scenario: Changing the primary method
    Given User goes to Financial Page after switching to the parent window
    When User goes to the Change Payout method page
    Then User changes the primary payout method
    And User changes the primary payout method to the default payout method


  @AssertPayoutDetails_First @Financial @Release
  Scenario: Asserting the payout details
    Given User goes to Financial Page after switching to the parent window
    When User goes to the Change Payout method page
    Then User opens the payout details page for the first option
    And User asserts the payout details


  @AssertPayoutDetails_Second @Financial @Release
  Scenario: Editing the second payout method and then Asserting the payout details
    Given User goes to Financial Page after switching to the parent window
    When User goes to the Change Payout method page
    Then User opens the payout details page for the second option
    And User edits the payout details for second option
    And User asserts the payout details for the second option
    And User opens the payout in edit mode and then cancels it

  @AssertPayoutHistory @Financial @Release
  Scenario: Assert the payout transactions
    Given User goes to Financial Page after switching to the parent window
    When User goes to payout transactions page
    Then User asserts the transaction

  @AssertFuturePayout @Financial @Release
  Scenario: Assert the future payouts
    Given User goes to Financial Page after switching to the parent window
    When User goes to future payouts tab
    Then User asserts the future transaction

  @AssertCommitments @Financial @Release
  Scenario: Assert the future commitments
    Given User goes to Financial Page after switching to the parent window
    When User asserts the commitment
    And User goes to commitments detail page
    Then User asserts the commitment in the details page


  @AssertTerminatedContract @Financial @Release
  Scenario: Assert the terminated contract
    Given User goes to Financial Page after switching to the parent window
    When User goes to terminated contract tab
    Then User asserts the terminated contract

  @AssertAvailableOffers @Financial @Release @Offer
  Scenario: Assert the available offer
    Given User goes to Financial Page after switching to the parent window
    Then User asserts the available offers

  @AssertDeclinedOffers @Financial @Release @Offer
  Scenario: Assert the Declined offer
    Given User goes to Financial Page after switching to the parent window
    When User goes to declined offers tab
    Then User asserts the declined offers detail


  @ChangePrimaryMethod_firefox @Firefox
  Scenario: Changing the primary method
    Given User goes to Financial Page after switching to the parent window
    When User goes to the Change Payout method page
    Then User changes the primary payout method
    And User changes the primary payout method to the default payout method
    And User logs out of the application


  @AssertPayoutDetails_firefox @Firefox
  Scenario: Asserting the payout details
    Given User goes to Financial Page after switching to the parent window
    When User goes to the Change Payout method page
    Then User opens the payout details page for the first option
    And User asserts the payout details
    And User logs out of the application


  @AssertPayoutDetails_firefox @Firefox
  Scenario: Editing the second payout method and then Asserting the payout details
    Given User goes to Financial Page after switching to the parent window
    When User goes to the Change Payout method page
    Then User opens the payout details page for the second option
    And User edits the payout details for second option
    And User asserts the payout details for the second option
    And User opens the payout in edit mode and then cancels it
    And User logs out of the application

  @AssertPayoutHistory_firefox @Firefox
  Scenario: Assert the payout transactions
    Given User goes to Financial Page after switching to the parent window
    When User goes to payout transactions page
    Then User asserts the transaction
    And User logs out of the application

  @AssertFuturePayout_firefox @Firefox
  Scenario: Assert the future payouts
    Given User goes to Financial Page after switching to the parent window
    When User goes to future payouts tab
    Then User asserts the future transaction
    And User logs out of the application

  @AssertCommitments_firefox @Firefox
  Scenario: Assert the future commitments
    Given User goes to Financial Page after switching to the parent window
    When User asserts the commitment
    And User goes to commitments detail page
    Then User asserts the commitment in the details page
    And User logs out of the application
    And User logs out of the application


  @AssertTerminatedContract_firefox @Firefox
  Scenario: Assert the terminated contract
    Given User goes to Financial Page after switching to the parent window
    When User goes to terminated contract tab
    Then User asserts the terminated contract
    And User logs out of the application

  @AssertAvailableOffers_firefox @Firefox
  Scenario: Assert the available offer
    Given User goes to Financial Page after switching to the parent window
    Then User asserts the available offers
    And User logs out of the application

  @AssertDeclinedOffers_firefox @Firefox
  Scenario: Assert the Declined offer
    Given User goes to Financial Page after switching to the parent window
    When User goes to declined offers tab
    Then User asserts the declined offers detail
    And User logs out of the application
