@Test
Feature: User want to add review if they have done success booking

  Scenario: User want to go to 'Profil' page
    Given user already on landing page
    When user already do logins with "vvdtynht@exelica.com" as email and "@Aadmin92" as password
    And user click on lap bola Admin Jangan Dihapus venue
    Then user click on 'Check Avaibility' buttons
    And redirected to 'Check Venue Avaibility' pages
    When user select "<date>" and "<time>" and click 'Reservation' buttons
    And 'Reservation' pop up will appears
    And click on 'Submit' buttons
    Then user redirected to 'Confirmation and Payment' pages
    And verify the total prices is "price"
    When user selects a "bank"
    And click on 'Confirm and Pay' buttons
    Then user click 'Profil' buttons
    And selects 'My Transaction'
    And 'History' pages is showed
    And user click on 'Review' buttons
    When 'Add Review' pop up appears
    And user click on stars and input "Lapangannya Bagus" on Review boxs
    Then click on 'Submit' button
