@Test
Feature: Change Password

  Scenario: User want change valid password
    Given user already do logins with "email.com" as email and "password" as password
    And user already on 'Edit Profil' pages
    When user click 'Profil' buttons
    And selects 'Change Password'
    And 'Change Password' pop up will appears
    And user inputs "<oldPwd>" as Old Password, "<newPwd>" as New Password, and "<confirmPwd>" as Confirm Password
    Then user click submits
    And passwords successfully changed

  Scenario: User want change invalid password
    Given user already do logins with "email.com" as email and "password" as password
    And user already on 'Edit Profil' pages
    When user click 'Profil' buttons
    And selects 'Change Password'
    And 'Change Password' pop up will appears
    And user inputs "<oldPwd>" as Old Password, "<newPwd>" as New Password, and "<confirmPwd>" as Confirm Password
    Then user click submits
    And passwords can't be changed


