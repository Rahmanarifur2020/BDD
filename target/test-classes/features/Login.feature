@Login @Regression
Feature: Validate Techfios Login functionality

Background:
    Given User is on the Techfio loging page  

@Scenario1 @Smoke
Scenario: User should be able to login with the valid credential 

    When User enters username as "demo@techfios.com" 
    When User enters password as "abc123"
    And User click on SignIn buttton 
    Then User should land on Dashboar page 

@Scenario2
Scenario: User should be able to login with the valid credential 

    When User enters username as "demo2@techfios.com" 
    When User enters password as "abc123"
    And User click on SignIn buttton 
    Then User should land on Dashboar page 
    
@Scenario3
Scenario: User should be able to login with the valid credential 

    When User enters username as "demo@techfios.com" 
    When User enters password as "abc423"
    And User click on SignIn buttton 
    Then User should land on Dashboar page 
    
@Scenario4 @Smoke
Scenario: User should be able to login with the valid credential 

    When User enters username as "demo2@techfios.com" 
    When User enters password as "abc423"
    And User click on SignIn buttton 
    Then User should land on Dashboar page 
    
    
    
    