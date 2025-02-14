package collectionframework.insurancepolicysystem.insurancepolicysystem1;

import java.time.LocalDate;
import java.util.*;

public class InsurancePolicyManagement {
    private Map<String, InsurancePolicy> policyMap = new HashMap<>(); // Store policies by number
    private Map<String, InsurancePolicy> orderedPolicyMap = new LinkedHashMap<>(); // Maintain insertion order
    private TreeMap<LocalDate, InsurancePolicy> sortedByExpiry = new TreeMap<>(); // Sorted by expiry date

    // Add a new policy
    public void addPolicy(InsurancePolicy policy) {
        policyMap.put(policy.policyNumber, policy);
        orderedPolicyMap.put(policy.policyNumber, policy);
        sortedByExpiry.put(policy.expiryDate, policy);
    }

    // Retrieve a policy by number
    public InsurancePolicy getPolicyByNumber(String policyNumber) {
        return policyMap.getOrDefault(policyNumber, null);
    }

    // List all policies expiring within the next 30 days
    public List<InsurancePolicy> getExpiringPolicies() {
        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);
        return new ArrayList<>(sortedByExpiry.subMap(today, next30Days).values());
    }

    // List all policies for a specific policyholder
    public List<InsurancePolicy> getPoliciesByHolder(String policyholderName) {
        List<InsurancePolicy> result = new ArrayList<>();
        for (InsurancePolicy policy : policyMap.values()) {
            if (policy.policyholderName.equalsIgnoreCase(policyholderName)) {
                result.add(policy);
            }
        }
        return result;
    }

    // Remove expired policies
    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        sortedByExpiry.headMap(today, true).clear(); // Remove expired policies from TreeMap
        policyMap.entrySet().removeIf(entry -> entry.getValue().expiryDate.isBefore(today));
        orderedPolicyMap.entrySet().removeIf(entry -> entry.getValue().expiryDate.isBefore(today));
    }

    // Display all policies
    public void displayPolicies() {
        System.out.println("All Policies:");
        for (InsurancePolicy policy : orderedPolicyMap.values()) {
            System.out.println(policy);
        }
    }
}
