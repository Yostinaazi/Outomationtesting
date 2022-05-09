@project
Feature:11 Logged user could add different products to compare list
  Scenario:Logged user could add different products to compare list
    Given user click in login
    And user enter valid email and Password
    And user click on button log in
    When user choose category
    And user choose Sub_category
    And  user choose item
    And user select size
    And user click on Add to compare list
    Then message of adding to compare list
