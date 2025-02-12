package generics.resumescreeningsystem;
import java.util.*;
class Resume<T extends JobRole> {
    private T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public void processResume() {
        System.out.println("Processing Resume...");
        jobRole.displayDetails();
    }

    public static void screenCandidates(List<? extends JobRole> candidates) {
        for (JobRole candidate : candidates) {
            candidate.displayDetails();
        }
    }
}