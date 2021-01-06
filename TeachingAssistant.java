import java.util.List;

public class TeachingAssistant extends Staff {

    private List<String> coursesSupported;

    public TeachingAssistant(String firstName, String middleName, String lastName, int homePhoneNumber,
                             String dateOfBirth,
                             String gender, String homeMailingAddress, int employeeIdNumber,
                             java.util.List<String> emergencyContacts, List<String> coursesSupported) {
        super(firstName, middleName, lastName, homePhoneNumber, dateOfBirth, gender, homeMailingAddress,
                employeeIdNumber, emergencyContacts);
        this.coursesSupported = coursesSupported;
    }

    public List<String> getCoursesSupported() {
        return coursesSupported;
    }

    public void setCoursesSupported(List<String> newCoursesSupported) {
        coursesSupported = newCoursesSupported;
    }

    @Override
    public String toString() {
        return ("Teaching Assistant, " + super.toString() + "\nName(s) of Course(s) Supported: " + getCoursesSupported());
    }
}
