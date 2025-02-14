package collectionframework.insurancepolicysystem.insurancepolicysystem2;

import java.time.LocalDate;

public class InsurancePolicyMain {
    public static void main(String[] args) {
        InsurancePolicyManager manager = new InsurancePolicyManager();

        // Adding policies
        manager.addPolicy(new Policy("P1001", "Kuldeep", LocalDate.now().plusDays(10), "Health", 500.0));
        manager.addPolicy(new Policy("P1002", "Harsh", LocalDate.now().plusDays(40), "Auto", 300.0));
        manager.addPolicy(new Policy("P1003", "Om", LocalDate.now().plusDays(5), "Home", 700.0));
        manager.addPolicy(new Policy("P1004", "Kuldeep", LocalDate.now().plusDays(25), "Health", 600.0));
        manager.addPolicy(new Policy("P1001", "Kuldeep", LocalDate.now().plusDays(10), "Health", 500.0)); // Duplicate

        // Displaying policies
        manager.displayAllPolicies();
        manager.displayExpiringPolicies();
        manager.displayPoliciesByType("Health");
        manager.findDuplicatePolicies();
    }

}
