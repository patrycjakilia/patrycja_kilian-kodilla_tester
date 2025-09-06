Feature: Cash Withdrawal

Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed
    And the balance of my wallet should be $170


Scenario: Unsuccessful withdrawal from a wallet in credit
        Given I have deposited $100 in my wallet
        When I request $220
        Then $220 shouldn't be dispensed

Scenario: Unsuccessful withdrawal from a wallet
        Given I haven't deposit in my wallet
        When I request $20
        Then $20 shouldn't be dispensed

Scenario: Withdrawal of the entire wallet balance
    Given I have deposited $100 in my wallet
    When I request $100
    Then $100 should be dispensed

Scenario: Requesting zero dollars
    Given I have deposited $100 in my wallet
    When I request $0
    Then $0 shouldn't be dispensed
