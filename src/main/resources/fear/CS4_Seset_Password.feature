@project
  Feature: SC3- User could reset his/her password successfully
    Scenario: reset Password
      And user click in login
      When user writer Email
      And user click on link ForgetPassword
      And user quit chrome at end