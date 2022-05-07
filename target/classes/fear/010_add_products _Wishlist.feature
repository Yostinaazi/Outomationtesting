@project
  Feature: SC10_add_products _Wishlist
    Scenario:SC10_add_products _Wishlist
      Given user click in login
      And user enter valid email and Password
      And user click on button log in
      When user choose category
      And user choose Sub_category
      And  user choose item
      And user select size
      And user select WishList
      Then message of adding to wishlist apper