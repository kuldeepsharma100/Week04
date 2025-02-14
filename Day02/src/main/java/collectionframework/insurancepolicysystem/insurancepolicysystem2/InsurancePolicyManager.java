package collectionframework.insurancepolicysystem.insurancepolicysystem2;

import java.time.LocalDate;
import java.util.*;

class InsurancePolicyManager {
    private Map<String, Policy> policyMap = new HashMap<>(); // Store policies by policy number
    private List<Policy> policyList = new ArrayList<>(); // Maintain order & allow sorting

    // Add a policy
    public void addPolicy(Policy policy) {
        policyMap.put(policy.getPolicyNumber(), policy); // Ensure uniqueness
        policyList.add(policy);
    }

    // Display all policies
    public void displayAllPolicies() {
        System.out.println("\nAll Policies:");
        policyList.forEach(System.out::println);
    }

    // Display policies expiring within the next 30 days
    public void displayExpiringPolicies() {
        System.out.println("\nPolicies Expiring in 30 Days:");
        LocalDate today = LocalDate.now();
        policyList.stream()
                .filter(p -> p.getExpiryDate().isBefore(today.plusDays(31))) // Alternative check
                .sorted(Comparator.comparing(Policy::getExpiryDate))
                .forEach(System.out::println);
    }

    // Display policies by coverage type
    public void displayPoliciesByType(String type) {
        System.out.println("\nPolicies of Type: " + type);
        policyList.stream()
                .filter(p -> p.getCoverageType().equalsIgnoreCase(type))
                .forEach(System.out::println);
    }

    // Find duplicate policies based on policy number
    public void findDuplicatePolicies() {
        System.out.println("\nDuplicate Policies:");
        Map<String, Long> policyCount = new HashMap<>();
        for (Policy policy : policyList) {
            policyCount.put(policy.getPolicyNumber(), policyCount.getOrDefault(policy.getPolicyNumber(), 0L) + 1);
        }
        policyCount.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println("Policy Number: " + entry.getKey() + " appears " + entry.getValue() + " times."));
    }
}


