@project
Feature:12  Create successful Order
  Scenario: Create successful Order
    Given user click in login
    And user enter valid email and Password
    And user click on button log in
    When user choose category
    And user choose Sub_category
    And  user choose item
    And user select size
    And add to card
    And go to card
    And user click on check box read terms
    And user click on CHECK OUT
    And  user fill Billing address
    And  user choose Shipping method
    And  user choose Payment method
    And user click continue after reading Payment Info
  And user click on confirm
  Then message 'Your order has been successfully processed!' appear

#    And add adress of shipment

