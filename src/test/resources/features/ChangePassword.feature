@Test
Feature: Change Password

  Scenario: User want change valid password
    Given user already do logins with "email.com" as email and "password" as password
    When user click 'Profil' buttons
    And selects 'Profil'
    Then user click on setting buttons
    And selects 'Change Password'
    When 'Change Password' pop up will appears
    And user inputs "<oldPwd>" as Old Password, "<newPwd>" as New Password, and "<confirmPwd>" as Confirm Password
    Then user click submits
    And passwords successfully changed

  Scenario: User want change invalid password
    Given user already do logins with "email.com" as email and "password" as password
    When user click 'Profil' buttons
    And selects 'Profil'
    Then user click on setting buttons
    And selects 'Change Password'
    When 'Change Password' pop up will appears
    And user inputs "<oldPwd>" as Old Password, "<newPwd>" as New Password, and "<confirmPwd>" as Confirm Password
    Then user click submits
    And passwords can't be changed


