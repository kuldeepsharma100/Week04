package collectionframework.insurancepolicysystem.insurancepolicysystem1;

import java.time.LocalDate;

class InsurancePolicy {
    String policyNumber;
    String policyholderName;
    LocalDate expiryDate;

    public InsurancePolicy(String policyNumber, String policyholderName, LocalDate expiryDate) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "[Policy No: " + policyNumber + ", Holder: " + policyholderName + ", Expiry: " + expiryDate + "]";
    }
}

