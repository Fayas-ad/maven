#Author: your.fayas@your.domain.com
Feature: Add Tarrif Plans

  Scenario: Add Tariff Plans validation
    Given users launche telecom applications
    Given user click on add tariff plan buttons
    When users need to fill up the fields by one dim list
      | 10 | 200 | 300 | 400 | 500 | 600 | 700 |
    When user click on submit buttons
    Then users verify Congratulation you add Tariff Plan is generated

  Scenario: Add Tariff Plans validation
    Given users launche telecom applications
    Given user click on add tariff plan buttons
    When users need to fill up the fields by one dim maps
      | rental      |   11 |
      | lname       | 2200 |
      | email       | 3300 |
      | addr        | 4400 |
      | telephoneno | 5500 |
      | addss       | 6600 |
      | tele        | 7700 |
    When user click on submit buttons
    Then users verify Congratulation you add Tariff Plan is generated

  Scenario: Add Tariff Plans validation
    Given users launche telecom applications
    Given user click on add tariff plan buttons
    When users need to fill up the fields by two dim list
      | 10 | 200 | 300 | 400 | 500 | 600 | 700 |
      | 11 | 200 | 300 | 400 | 500 | 600 | 700 |
      | 12 | 200 | 300 | 400 | 500 | 600 | 700 |
    When user click on submit buttons
    Then users verify Congratulation you add Tariff Plan is generated

  Scenario: Add Tariff Plans validation
    Given users launche telecom applications
    Given user click on add tariff plan buttons
    When users need to fill up the fields by two dim maps
      | AB | AC  | AD  | AE  | AF  | AG  | AH  |
      | 11 | 200 | 300 | 400 | 500 | 600 | 700 |
      | 12 | 200 | 300 | 400 | 500 | 600 | 700 |
      | 12 | 200 | 300 | 400 | 500 | 600 | 700 |
    When user click on submit buttons
    Then users verify Congratulation you add Tariff Plan is generated
