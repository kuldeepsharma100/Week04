package generics.resumescreeningsystem;

class DataScientist extends JobRole {
    public DataScientist(String candidateName, String experience) {
        super(candidateName, experience);
    }

    @Override
    void displayDetails() {
        System.out.println("Data Scientist Candidate: " + candidateName + ", Experience: " + experience);
    }
}
