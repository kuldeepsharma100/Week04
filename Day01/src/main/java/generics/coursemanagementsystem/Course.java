package generics.coursemanagementsystem;

import java.util.List;
import java.util.ArrayList;

public class Course<T extends CourseType> {

    ArrayList<T> course = new ArrayList<>();

    public void addCourse(T courseType){
        course.add(courseType);
    }

    public ArrayList<T> getCourse(){
        return course;
    }

    public void display(List<? extends CourseType> list){

        System.out.println(list);
    }


}
