@project
Feature:06 Logged user could select different Categories
  Scenario: SC6- Logged user could select different Categories
    And user click in login
    And user enter valid email and Password
    And user click on button log in
    # nullPointer Exption
    When user choose category
    #hover remainder
