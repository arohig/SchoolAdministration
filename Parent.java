public class Parent extends Person {

    public Parent(String firstName, String middleName, String lastName, int homePhoneNumber, String dateOfBirth,
                  String gender, String homeMailingAddress) {
        super(firstName, middleName, lastName, homePhoneNumber, dateOfBirth, gender, homeMailingAddress);
    }

    @Override
    public String toString() {
        return ("Parent\n" + super.toString());
    }
}
