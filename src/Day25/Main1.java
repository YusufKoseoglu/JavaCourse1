package Day25;

import Day25.PackageOne.Boat;
import Day25.PackageOne.Car;

public class Main1 {

    Car car = new Car(); // Public

    Boat boat = new Boat(); // Public

//    Not available because it is package-private class,
//    the access modifier is default
//    Plane plane = new Plane();

}
