package collectionsandstreams.junit;

/**
 * Basic JUnit Test - Problem 5: @BeforeEach and @AfterEach Annotations
 *
 * This class simulates a database connection with connect() and disconnect()
 * methods. Used to demonstrate lifecycle management with JUnit's @BeforeEach
 * and @AfterEach annotations.
 */
public class DatabaseConnection {

    private boolean connected;

    // Establishes a connection to the database
    public void connect() {
        this.connected = true;
    }

    // Closes the database connection
    public void disconnect() {
        this.connected = false;
    }

    // Returns true if currently connected to the database
    public boolean isConnected() {
        return connected;
    }
}
