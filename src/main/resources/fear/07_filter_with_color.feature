@project
  Feature:07  Logged user could filter with color
    Scenario: SC7- Logged user could filter with color
      Given user click in login
      And user choose category
      And user choose Sub_category
      Then user can choose his favorite color
