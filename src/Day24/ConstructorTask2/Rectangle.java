package Day24.ConstructorTask2;

public class Rectangle {
//    TASK
//
//    -Create a class called Rectangle, with 2 attributes width and length;
//    -Create a constructor with 2 parameters, width and length
//    -Create a method to calculate the area of Rectangle

    int length;
    int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    public int calculateArea(){
        return length * width ;
    }
    }
