package Day24.ConstructorTask;

import java.util.concurrent.Callable;

public class MainCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1.radius);

        Circle circle2 = new Circle(50);
        System.out.println(circle2.radius);
    }
}
