package Day24.StaticRecap;

import Day24.StaticRecap.Student;

public class MainStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.studentName = "Almedin";
        student1.studentAge = 25 ;
        student1.registerCourse();

        Student.printNumberOfStudents();
    }
}
