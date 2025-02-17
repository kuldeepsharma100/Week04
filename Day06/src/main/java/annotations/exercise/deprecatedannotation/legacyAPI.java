package annotations.exercise.deprecatedannotation;

class LegacyAPI {

    @Deprecated
    void oldFeature() {
        System.out.println("This is an old feature and should not be used.");
    }

    void newFeature() {
        System.out.println("This is the new and improved feature.");
    }
}
