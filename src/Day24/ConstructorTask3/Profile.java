package Day24.ConstructorTask3;

public class Profile {
//    TASK
//
//    -Create a class called Profile with following attributes:
//    String firstName;
//    String lastName;
//    String address;
//    String birthDate;
//    String phone;
//    String email;
//    String nickname;
//
//    -Create a constructor to initialize all attributes
//    -Create a constructor to initialize firstName and lastName only
//    -Create a constructor to initialize firstName, lastName, birthDate only
//    -Create a constructor to initialize nickname only
    String firstName;
    String lastName;
    String address ;
    String birthDate;
    String phone ;
    String email;
    String nickname;

    public Profile(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Profile(String firstName, String lastName, String birthDate){
        this(firstName,lastName);
        this.birthDate = birthDate;
    }
    public Profile(String firstName, String lastName, String address,
                   String birthDate, String phone, String email, String nickname){
        this(firstName,lastName,birthDate);
        this.address = address;
        this.phone = phone ;
        this.email = email ;
        this.nickname = nickname ;
    }
}
