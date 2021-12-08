package Day21.Task1;
    public class CatMain {

//
//        TASK - OOP Intro (Objects and Classes)
//
//        Part 1
//                1-Create a class called Cat with
//       2 properties and 1 method that prints "Meow" sound
//
//    2-Create 2 objects of this class,
//        set their properties and call their methods
//
//
//        Part 2
//        Create a method in Cat class to print cat properties
//
//
//                Part 3
//        Create a static method in Main class to print cat properties
//                hint: public static void print(Cat cat) {}
//
//

        public static void main(String[] args) {

            Cat arya = new Cat();

            arya.age = 1;
            arya.color = "White and Black";

            arya.meow();

            System.out.println("Age of Arya: " + arya.age);
            System.out.println("Color of Arya: " + arya.color);

            printCatProperties(arya);



            Cat red = new Cat();

            red.age = 1;
            red.color = "Black";

            red.meow();

            System.out.println("Age of Red: " + red.age);
            System.out.println("Color of Red: " + red.color);

            red.printProperties();

        }

        public static void printCatProperties(Cat cat) {
            System.out.println("Color: " + cat.color);
            System.out.println("Age: " + cat.age);
        }}
