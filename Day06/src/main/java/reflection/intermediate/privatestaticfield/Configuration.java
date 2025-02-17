package reflection.intermediate.privatestaticfield;

public class Configuration {
    private static String API_KEY = "InitialAPIKey12345"; // Private static field

    public static void printApiKey() {
        System.out.println("API Key: " + API_KEY);
    }
}
