package generics.resumescreeningsystem;

abstract class JobRole {
    String candidateName;
    String experience;

    public JobRole(String candidateName, String experience) {
        this.candidateName = candidateName;
        this.experience = experience;
    }

    abstract void displayDetails();
}

