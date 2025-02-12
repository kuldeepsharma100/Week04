package generics.coursemanagementsystem;

 public class AssignmentCourse extends CourseType {

     public AssignmentCourse(String courseType){
         super(courseType);
     }

     public String evaluationType(){
         return "Assignment based";
     }

 }
