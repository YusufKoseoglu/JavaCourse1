package Day24.ConstructorTask;

public class Circle {
//    Task
//
//    Part 1
//            - Create a class called Circle, with one attribute called radius
//    - Create a no args constructor that initializes the radius to 10
//
//    Part 2
//            - Overload constructor that can accept 1 parameter and initializes the radius

    int radius ;
    public Circle(){
        radius = 10;
    }
    public Circle(int radius){
        this.radius = radius;
    }
}
