@project
  Feature: SC9- Logged user could add different products to Shopping cart
    Scenario: SC9- Logged user could add different products to Shopping cart
      Given user click in login
      And user enter valid email and Password
      And user click on button log in
      When user choose category
      And user choose Sub_category
      And  user choose item
      And user select size
      And add to card
      Then Ensure the item on card

