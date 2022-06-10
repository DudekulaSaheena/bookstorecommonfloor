Feature: Create account in commonfloor application

  @createAccount
  Scenario: Create user account successfully
    Given User launches
    When User clicks Sign up as Individual
    And User entering the  data valid  
    | Saheena  | Shaahi4mail@gmail.com |   9347745883 | Bangalore | Shahena@211 | Builder |
    When User clicks SignUp
    Then User account should be created successfully