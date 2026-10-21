Feature: Login Fuctionality 

Scenario: verify login with valid credential

  Given User lauches the login application
  When User enter the username as "tomsmith"
  And User enter the password as "SuperSecretPassword!"
  And User clicks login button
  Then login should navigate to secure page 

  
  
   