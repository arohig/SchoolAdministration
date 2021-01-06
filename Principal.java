import java.util.List;

public class Principal extends Staff {

    public Principal(String firstName, String middleName, String lastName, int homePhoneNumber, String dateOfBirth,
                     String gender, String homeMailingAddress, int employeeIdNumber,
                     List<String> emergencyContacts) {
        super(firstName, middleName, lastName, homePhoneNumber, dateOfBirth, gender, homeMailingAddress,
                employeeIdNumber, emergencyContacts);
    }

    @Override
    public String toString() {
        return ("Principal, " + super.toString());
    }
}
