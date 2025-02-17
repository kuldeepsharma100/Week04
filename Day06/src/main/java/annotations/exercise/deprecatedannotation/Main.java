package annotations.exercise.deprecatedannotation;

public class Main {
    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();

        api.oldFeature(); // Deprecated method call (Will show a warning)
        api.newFeature();
    }
}
