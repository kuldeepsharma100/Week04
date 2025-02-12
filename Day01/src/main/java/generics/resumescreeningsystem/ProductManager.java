package generics.resumescreeningsystem;


class ProductManager extends JobRole {
    public ProductManager(String candidateName, String experience) {
        super(candidateName, experience);
    }



    @Override
    void displayDetails() {
        System.out.println("Product Manager Candidate: " + candidateName + ", Experience: " + experience);
    }


}
