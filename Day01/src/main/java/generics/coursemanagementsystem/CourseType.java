package generics.coursemanagementsystem;

abstract class CourseType {
    String courseType;
    public CourseType(String courseType){
        this.courseType = courseType;
    }

    public abstract String evaluationType();

    @Override
    public String toString() {
        return "CourseType{   " +
                "courseType='" + courseType + '\'' + "   evaluation= " + evaluationType() +
                '}';
    }
}
