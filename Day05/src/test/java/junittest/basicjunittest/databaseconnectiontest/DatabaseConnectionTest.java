package junittest.basicjunittest.databaseconnectiontest;

import junit.basicjunittest.databaseconnection.DatabaseConnection;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseConnectionTest {

    private DatabaseConnection dbConnection;

    // This method will run before each test
    @BeforeEach
    void setup() {
        dbConnection = new DatabaseConnection();
        dbConnection.connect();  // Initialize the connection before each test
    }

    // This method will run after each test
    @AfterEach
    void cleanup() {
        dbConnection.disconnect();  // Close the connection after each test
    }

    // Test to verify that the connection is established
    @Test
    void testConnectionEstablished() {
        assertTrue(dbConnection.isConnected(), "The database should be connected.");
    }

    // Test to verify that the connection is closed
    @Test
    void testConnectionClosed() {
        dbConnection.disconnect(); // Explicitly disconnect before the test
        assertFalse(dbConnection.isConnected(), "The database should be disconnected.");
    }
}
