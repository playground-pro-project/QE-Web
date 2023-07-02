@Test
Feature: History

  Scenario Outline: User want to check their pending reservation if they have done booking
    Given user already on landing page
    When user already do logins with "email.com" as email and "password" as password
    And user clicks on "<arena>"
    And redirected to 'Venue Detail' pages
    Then user click on 'Check Avaibility' buttons
    And redirected to 'Check Venue Avaibility' pages
    When user select date, time, and click 'Reservation' buttons
    And 'Reservation' pop up will appears
    And user inputs "<start>" as start time and "<until>" as until time
    And click on 'Submit' buttons
    Then user click 'Profil' buttons
    And selects 'My Transaction'
    And 'History' pages is showed
    And Reservation with status "<status>" will appears
    Examples:
      | arena | start | until | status |
      |       |       |       |        |

  Scenario Outline: User want to check their pending reservation if they have not done booking
    Given user already on landing page
    When user already do logins with "email.com" as email and "password" as password
    And user click 'Profil' buttons
    And selects 'My Transaction'
    And 'History' pages is showed
    Then Reservation with status "<status>" will appears
    Examples:
      | status |
      |        |

  Scenario Outline: User want to check their history if they have success reservation
    Given user already on landing page
    When user already do logins with "email.com" as email and "password" as password
    And user clicks on "<arena>"
    And redirected to 'Venue Detail' pages
    Then user click on 'Check Avaibility' buttons
    And redirected to 'Check Venue Avaibility' pages
    When user select date, time, and click 'Reservation' buttons
    And 'Reservation' pop up will appears
    And user inputs "<start>" as start time and "<until>" as until time
    And click on 'Submit' buttons
    Then user redirected to 'Confirmation and Payment' pages
    And verify the total prices is "<price>"
    When user selects a "<bank>"
    And click on 'Confirm and Pay' buttons
    Then user click 'Profil' buttons
    And selects 'My Transaction'
    And 'History' pages is showed
    And Reservation with status "<status>" will appears
    Examples:
      | arena | start | until | status | price | bank |
      |       |       |       |        |       |      |

  Scenario Outline: User want to check their history if they have not had success reservation
    Given user already on landing page
    When user already do logins with "email.com" as email and "password" as password
    And user click 'Profil' buttons
    And selects 'My Transaction'
    And 'My Transaction' pages is showed
    Then Reservation with status "<status>" will appears
    Examples:
      | status |
      |        |

  Scenario Outline: User want to cancel reservation if they have done booking
    Given user already on landing page
    When user already do logins with "email.com" as email and "password" as password
    And user clicks on "<arena>"
    And redirected to 'Venue Detail' pages
    Then user click on 'Check Avaibility' buttons
    And redirected to 'Check Venue Avaibility' pages
    When user select date, time, and click 'Reservation' buttons
    And 'Reservation' pop up will appears
    And user inputs "<start>" as start time and "<until>" as until time
    And click on 'Submit' buttons
    Then user click 'Profil' buttons
    And selects 'My Transaction'
    And 'History' pages is showed
    And user click on 'Cancel' buttons
    Then Reservation with status "<status>" will appears
    Examples:
      | arena | start | until | status |
      |       |       |       |        |