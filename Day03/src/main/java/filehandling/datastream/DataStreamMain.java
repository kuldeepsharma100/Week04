package filehandling.datastream;

public class DataStreamMain {
    public static void main(String[] args) {
        // Sample student data
        Student[] students = {
                new Student(101, "Kuldeep", 3.8),
                new Student(102, "harsh", 3.5),
                new Student(103, "Namam", 3.9)
        };

        // Write student data to file
        StudentDataStream.writeStudentData(students);

        // Read student data from file
        StudentDataStream.readStudentData();
    }

}
