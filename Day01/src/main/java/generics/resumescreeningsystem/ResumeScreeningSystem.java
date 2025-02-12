package generics.resumescreeningsystem;

import java.util.ArrayList;
import java.util.List;

public class ResumeScreeningSystem {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> seResume = new Resume<>(new SoftwareEngineer("Kuldeep", "5 years"));
        Resume<DataScientist> dsResume = new Resume<>(new DataScientist("om", "3 years"));
        Resume<ProductManager> pmResume = new Resume<>(new ProductManager("Harsh", "4 years"));

        seResume.processResume();
        dsResume.processResume();
        pmResume.processResume();

        List<JobRole> candidates = new ArrayList<>();
        candidates.add(new SoftwareEngineer("Kanisk", "6 years"));
        candidates.add(new DataScientist("ishan", "2 years"));
        candidates.add(new ProductManager("Naman", "7 years"));

        System.out.println("Screening Candidates:");
        Resume.screenCandidates(candidates);
    }
}
