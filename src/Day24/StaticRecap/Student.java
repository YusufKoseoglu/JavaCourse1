package Day24.StaticRecap;

public class Student {
//    TASK
//
//    - Create a class called Student
//        - Create 2 instance fields studentName, studentAge
//        - Create a static filed numberOfStudentsEnrolledToCourse
//
//        - Create an instance method called registerCourse ->
//    when a new object call this method numberOfStudents field should be increased by 1
//
//            - Create a static method called printNumberOfStudents ->
//    when this method called it should print = "Number of students registered course: numberOfStudents"

    String studentName ;
    int studentAge ;
    static int numberOfStudentsEnrolledToCourse ;

    public void registerCourse (){
        numberOfStudentsEnrolledToCourse++ ;
    }
    public static void printNumberOfStudents () {
        System.out.println("Number of students registered course: " + numberOfStudentsEnrolledToCourse);
    }


}
