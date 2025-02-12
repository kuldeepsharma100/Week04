package generics.coursemanagementsystem;

public class Research extends CourseType {

    public Research(String courseType){
        super(courseType);
    }

    public String evaluationType(){
        return "Research based ";
    }
}
