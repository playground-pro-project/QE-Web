@Test
Feature: Add Venue

  Scenario: Hoster add venue with complete data
    Given user already on landing page
    When user already do logins with "vvdtynht@exelica.com" as email and "@Aadmin92" as password
    And hoster click 'Profil' buttons
    And click on 'My Venue' buttons
    Then hoster click on 'Add Venue' buttons
    And 'Add Venue' pop up will showed
#    When hoster input "Lapangan Basket Delta 4" as Venue Name, "Bersih&Luas 4" as Description, and choose locations
    When input "Lapangan Basket Delta 4" as venue name, "Bersih&Luas 4" as Description, and choose locations
    Then hoster click 'Submit' button
    And Venue can be added

  Scenario: Hoster add venue with incomplete data
    Given user already on landing page
    When user already do logins with "vvdtynht@exelica.com" as email and "@Aadmin92" as password
    And hoster click 'Profil' buttons
    And click on 'My Venue' buttons
    Then hoster click on 'Add Venue' buttons
    And 'Add Venue' pop up will showed
    When hoster input "Bersih&Luas 7" as Description and "Deltasari 7" as location
    Then new venue can't be added