#Autor: Estefania
#fecha: 11/08/2023

@stories
Feature: New user registration
  the user as a visitor to the Utest.com page
  she wants to create a new user with her personal data

  Scenario: Successful registration
    Given that the user navigates to the registration page
    When  enters his personal data
    And log in
    Then the user can see a message to confirm his email










