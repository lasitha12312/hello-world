@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Login with vlid credintials
    Given User opens the browser
    Then userenter "hostportuser" and "$*$*Grace_&_lighT*$*$"
    Then user in homepage
    Then Click on down arrow
    Then Click Logout
    Then user logout successfully
   	Then Close browser

  Scenario: Login with vlid username
    Given User opens the browser
    Then userenter "yes" and "$*$*Grace_&_lighT*$*$"
    When user click on the sign in
    Then email address or password incorrect message should appears 
    

 