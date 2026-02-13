package collectionsandstreams.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test cases for BankAccount class.
 *
 * Verifies correct balance updates on deposit/withdraw and that withdrawals
 * fail with exception when funds are insufficient.
 */
class BankAccountTest {

    private BankAccount bankAccount;

    // Create fresh BankAccount before each test for isolation
    @BeforeEach
    void setUp() {
        bankAccount = new BankAccount();
    }

    // Test deposit updates balance correctly
    @Test
    @DisplayName("Should update balance correctly after deposit")
    void testDeposit() {
        bankAccount.deposit(100.0);
        assertEquals(100.0, bankAccount.getBalance());
        bankAccount.deposit(50.0);
        assertEquals(150.0, bankAccount.getBalance());
    }

    // Test withdraw updates balance correctly
    @Test
    @DisplayName("Should update balance correctly after withdrawal")
    void testWithdraw() {
        bankAccount.deposit(100.0);
        bankAccount.withdraw(30.0);
        assertEquals(70.0, bankAccount.getBalance());
    }

    // Test that withdrawal fails when insufficient funds
    @Test
    @DisplayName("Should throw exception when withdrawing more than balance")
    void testWithdrawInsufficientFunds() {
        bankAccount.deposit(50.0);
        assertThrows(IllegalStateException.class, () -> bankAccount.withdraw(100.0));
        assertEquals(50.0, bankAccount.getBalance());
    }

    // Test initial balance is zero
    @Test
    @DisplayName("Should have zero initial balance")
    void testInitialBalance() {
        assertEquals(0.0, bankAccount.getBalance());
    }

    // Test multiple deposit and withdraw sequence
    @Test
    @DisplayName("Should handle multiple transactions correctly")
    void testMultipleTransactions() {
        bankAccount.deposit(200.0);
        bankAccount.withdraw(50.0);
        bankAccount.deposit(25.0);
        bankAccount.withdraw(25.0);
        assertEquals(150.0, bankAccount.getBalance());
    }
}
