@Sample
Feature: CucumberJava

@Tag1
Scenario: Login functionality exists

Given I have open the browser 

When I open Facebook website  

Then Login button should exits

@Tag2
Scenario: Login functionality exists

Given I have open the browser on chrome

When I open Facebook website on chrome

And User enters "testuser_1" and "Test@123"

And I enter "NAT@852906" for password

Then Login button should exist as


@Tag3
Scenario Outline: Check if String is Palindrome
  Given I entered word <wordToTest>
  When I test it for Palindrome
  Then the output should be <output>
  Examples:
    | wordToTest | output  |
    | "Refer"    | "true"  |
    
    
    