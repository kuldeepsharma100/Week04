package filehandling.datastream;

import java.io.*;

public class StudentDataStream {

    static String  fileName = "source.txt";
    public static void writeStudentData(Student[] students) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            for (Student s : students) {
                dos.writeInt(s.rollNumber);
                dos.writeUTF(s.name);
                dos.writeDouble(s.gpa);
            }
            System.out.println("Student data written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing student data: " + e.getMessage());
        }
    }

    // Method to read student data using DataInputStream
    public static void readStudentData() {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            System.out.println("\nRetrieved Student Data:");
            while (dis.available() > 0) {
                int rollNumber = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();
                System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (IOException e) {
            System.out.println("Error reading student data: " + e.getMessage());
        }
    }
}


