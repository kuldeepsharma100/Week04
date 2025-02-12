package generics.coursemanagementsystem;

 class ExamCourse extends CourseType{

     ExamCourse(String courseType){
         super(courseType);
     }

     public String evaluationType(){
         return "Final exam based ";
     }
}
