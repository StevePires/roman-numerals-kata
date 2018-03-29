Feature: Converting integers to roman numerals and the other way around
  Background: In order to experiment BDD on roman numerals kata
  As a wesquad member
  I want to see an example of feature file

  Scenario: I convert 1 to I
    Given a roman numerals converter
    When i input 1
    Then my converter should return I
