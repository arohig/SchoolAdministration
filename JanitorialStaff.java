import java.util.List;

public class JanitorialStaff extends Staff {

    public JanitorialStaff(String firstName, String middleName, String lastName, int homePhoneNumber,
                           String dateOfBirth,
                           String gender, String homeMailingAddress, int employeeIdNumber,
                           List<String> emergencyContacts) {
        super(firstName, middleName, lastName, homePhoneNumber, dateOfBirth, gender, homeMailingAddress,
                employeeIdNumber, emergencyContacts);
    }

    @Override
    public String toString() {
        return ("Janitorial " + super.toString());
    }
}
