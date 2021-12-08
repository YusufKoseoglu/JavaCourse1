package Day26.EnumTask;

public enum Months {
//    TASK
//
//    Part 1
//            - Create an Enum called Months
//    - Store all the Months as constants
//
//
//    Part 2
//            - Add a field called shortName
//    - Create a constructor to initialize shortName field
//
//    Part 3
//            - Create Main class and use Months Enum inside a switch statement


    JANUARY("Jan"),
    FEBRUARY("Feb"),
    MARCH("Mar"),
    APRIL("Apr"),
    MAY("May"),
    JUNE("Jun"),
    JULY("Jul"),
    AUGUST("Aug"),
    SEPTEMBER("Sep"),
    OCTOBER("Oct"),
    NOVEMBER("Nov"),
    DECEMBER("Dec");
    String shortName;
    Months(String shortName){
        this.shortName = shortName;

    }


}
