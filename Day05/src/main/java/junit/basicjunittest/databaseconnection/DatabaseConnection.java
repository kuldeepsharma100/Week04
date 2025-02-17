package junit.basicjunittest.databaseconnection;

public class DatabaseConnection {

    private boolean connected = false;

    // Method to simulate establishing a connection
    public void connect() {
        connected = true;
        System.out.println("Database connected");
    }

    // Method to simulate closing the connection
    public void disconnect() {
        connected = false;
        System.out.println("Database disconnected");
    }

    // Method to check if the connection is established
    public boolean isConnected() {
        return connected;
    }

    // Main method to manually test the connect and disconnect functionality
    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();

        // Manually testing connect and disconnect methods
        System.out.println("Testing the DatabaseConnection class directly:");
        dbConnection.connect();  // Establish the connection
        System.out.println("Is connected? " + dbConnection.isConnected()); // Should print true

        dbConnection.disconnect();  // Disconnect
        System.out.println("Is connected? " + dbConnection.isConnected()); // Should print false
    }
}
