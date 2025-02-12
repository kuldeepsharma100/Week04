package generics.resumescreeningsystem;

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName, String experience) {
        super(candidateName, experience);
    }

    @Override
    void displayDetails() {
        System.out.println("Software Engineer Candidate: " + candidateName + ", Experience: " + experience);
    }
}