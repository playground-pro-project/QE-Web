@Test @OTPPage
  Feature: OTP Page
    Scenario: OTP Page Invalid
      Given User already on OTP page
      When Set otp "000000"
        Then User click verify button
      And User see caution message "Gagal OTP" on OTP page
    Scenario: OTP Page Valid
      Given User already on OTP page
      When Set otp "123456"
      Then User click verify button
      And Verify user already on landing page

