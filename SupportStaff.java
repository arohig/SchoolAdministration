import java.util.List;

public class SupportStaff extends Staff {

    private String positionTitle;

    public SupportStaff(String firstName, String middleName, String lastName, int homePhoneNumber, String dateOfBirth,
                        String gender, String homeMailingAddress, int employeeIdNumber,
                        List<String> emergencyContacts, String positionTitle) {
        super(firstName, middleName, lastName, homePhoneNumber, dateOfBirth, gender, homeMailingAddress,
                employeeIdNumber, emergencyContacts);
        this.positionTitle = positionTitle;
    }

    public String getPositionTitle() {
        return positionTitle;
    }

    public void setPositionTitle(String newPositionTitle) {
        positionTitle = newPositionTitle;
    }

    @Override
    public String toString() {
        return ("Support " + super.toString() + "\nPosition Title: " + getPositionTitle());
    }
}
