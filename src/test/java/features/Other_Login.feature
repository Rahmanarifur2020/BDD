@OtherLogin @Regression
Feature: Validate Techfios Login functionality using scenario outline

Background:
    Given User is on the Techfio loging page  

@OtherScenario1 
Scenario Outline: User should be able to login with the valid credential 

    When User enters "<username>" and "<password>"  
    And User click on SignIn buttton 
    Then User should land on Dashboar page 
    Examples:
    |username           | password |
    |demo@techfios.com  | abc123   |
    |demo2@techfios.com | abc123   |
    |demo@techfios.com  | abc423   |
    |demo2@techfios.com | abc423   |