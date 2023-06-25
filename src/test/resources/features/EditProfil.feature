@Test
Feature: Edit Profile

 Scenario Outline: User edit profile with complete data
    Given user already do logins with "email.com" as email and "password" as password
    And user already on 'Edit Profil' pages
    When user inputs "<name>" as Name, "<email>" as Email, "<phone>" as Phone
    And inputs "<address>" as Address, "<bio>" as Bio
    Then user click on save buttons
    And user's new profils will be saved
    Examples:
      | name | email | phone | address | bio |
      |      |       |       |         |     |

 Scenario Outline: User edit profile with few data
    Given user already do logins with "email.com" as email and "password" as password
    And user already on 'Edit Profil' pages
    When user inputs "<name>" as Name, "<email>" as Email, "<phone>" as Phone
    And inputs "<address>" as Address, "<bio>" as Bio
    Then user click on save buttons
    And user's new profils will be saved
    Examples:
      | name | email | phone | address | bio |
      |      |       |       |         |     |
