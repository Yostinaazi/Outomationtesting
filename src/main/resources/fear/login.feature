@project
Feature: SC2- User could log in with valid email and password

  Scenario:user can login in with vaild data
    Given user open chrome browser to log in
    And user click in login
    When user enter valid email and Password
    And user click on button log in
    Then user log in succefuly


