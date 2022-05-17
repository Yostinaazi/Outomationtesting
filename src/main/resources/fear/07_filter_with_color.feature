@project
  Feature:07  Logged user could filter with color
    Scenario: SC7- Logged user could filter with color
      Given user click in login
      And user choose category
      And user choose Sub_category
      And user filter with color
      Then filtered items will appear
