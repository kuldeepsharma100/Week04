package collectionframework.insurancepolicysystem.insurancepolicysystem1;

import java.time.LocalDate;

public class InsurancePolicyManagementMain {
    public static void main(String[] args) {
        InsurancePolicyManagement manager = new InsurancePolicyManagement();

        // Adding policies
        manager.addPolicy(new InsurancePolicy("P101", "Kuldeep", LocalDate.now().plusDays(10)));
        manager.addPolicy(new InsurancePolicy("P102", "om", LocalDate.now().plusDays(40)));
        manager.addPolicy(new InsurancePolicy("P103", "Kuldeep", LocalDate.now().plusDays(20)));
        manager.addPolicy(new InsurancePolicy("P104", "Harsh", LocalDate.now().minusDays(5))); // Expired

        // Display policies
        manager.displayPolicies();

        // Retrieve policy by number
        System.out.println("\nPolicy P102: " + manager.getPolicyByNumber("P102"));

        // List policies expiring in the next 30 days
        System.out.println("\nPolicies expiring within 30 days: " + manager.getExpiringPolicies());

        // List policies for Alice
        System.out.println("\nPolicies for Alice: " + manager.getPoliciesByHolder("Kuldeep"));

        // Remove expired policies
        manager.removeExpiredPolicies();
        System.out.println("\nAfter removing expired policies:");
        manager.displayPolicies();
    }

}
