 @project
  Feature:05 Logged User could switch between currencies US-to_Euro
     Scenario:Logged User could switch between currencies US-Euro

         And user click in login
         And user enter valid email and Password
         And user click on button log in
          When  user change currency
         Then website prices should be with Eruo
