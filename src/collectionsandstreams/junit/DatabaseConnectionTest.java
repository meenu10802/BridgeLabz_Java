package collectionsandstreams.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test cases for DatabaseConnection class.
 *
 * Demonstrates @BeforeEach to initialize connection before each test and
 * @AfterEach to close connection after each test. Verifies connection
 * state is properly managed.
 */
class DatabaseConnectionTest {

    private DatabaseConnection dbConnection;

    // Initialize database connection before each test (simulates setup)
    @BeforeEach
    void setUp() {
        dbConnection = new DatabaseConnection();
        dbConnection.connect();
    }

    // Close database connection after each test (simulates cleanup)
    @AfterEach
    void tearDown() {
        dbConnection.disconnect();
    }

    // Verify connection is established after @BeforeEach
    @Test
    @DisplayName("Should be connected after setUp")
    void testConnectionEstablished() {
        assertTrue(dbConnection.isConnected());
    }

    // Verify connection can be used during test
    @Test
    @DisplayName("Should verify connection state during test")
    void testConnectionState() {
        assertTrue(dbConnection.isConnected());
        dbConnection.disconnect();
        assertFalse(dbConnection.isConnected());
    }

    // Additional test to ensure @BeforeEach runs for each test independently
    @Test
    @DisplayName("Should have fresh connection for each test")
    void testFreshConnection() {
        assertTrue(dbConnection.isConnected());
    }
}
