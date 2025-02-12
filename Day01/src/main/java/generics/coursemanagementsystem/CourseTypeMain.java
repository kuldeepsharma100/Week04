package generics.coursemanagementsystem;

public class CourseTypeMain {
    public static void main(String[] args) {
        Course<Research> research = new Course<>();
        research.addCourse(new Research("Machine Learning"));
        research.display(research.getCourse());

        Course<AssignmentCourse> assignment = new Course<>();
        assignment.addCourse(new AssignmentCourse("Computer network"));
        assignment.display(assignment.getCourse());

        Course<ExamCourse> exam = new Course<>();
        exam.addCourse(new ExamCourse("Compiler design"));
        exam.display(exam.getCourse());


    }
}
