@project
  Feature: User could reset his/her password successfully
    Scenario: reset Password
      And user click in login
      When user writer Email
      And user click on link ForgetPassword
      And user writer Email
      And user click on Recover button
  Then ensure the message of sending an email is found