#Author: fayas@your.domain.com

Feature: Add customer details


  Scenario: validating customer details
    Given user launches telecom application
		And user click on add customer button
		When user need to file up the fields
		And user click on submit button
		Then user verify customer id is generated
		
		

  