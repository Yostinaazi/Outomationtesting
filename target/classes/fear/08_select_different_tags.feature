@project
  Feature: SC8- Logged user could select different tags
    Scenario: SC8- Logged user could select different tags
      Given user click in login
      And user choose category
      When click on tags
      Then site open selected tag