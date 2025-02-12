package genericstest.universitycoursemanagementsystem;

import generics.coursemanagementsystem.AssignmentCourse;
import generics.coursemanagementsystem.Course;
import generics.coursemanagementsystem.Research;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CourseManagementTest {

    @Test
    public void test1() {
        // Test for ExamCourses
        Course<Research> research = new Course<>();
        research.addCourse(new Research("Machine Learning"));
        Assert.assertEquals(1, research.getCourse().size());
    }

    @Test
    public void test2() {
        Course<AssignmentCourse> assignment = new Course<>();
        assignment.addCourse(new AssignmentCourse("Computer network"));
        assignment.addCourse(new AssignmentCourse("Project management"));
        Assert.assertEquals(2, assignment.getCourse().size());

    }
}
